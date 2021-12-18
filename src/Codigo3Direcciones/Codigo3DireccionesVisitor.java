package Codigo3Direcciones;

import org.antlr.v4.runtime.tree.ParseTree;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.Trees;

import app.reglasBaseVisitor;
import app.reglasParser;
import app.reglasParser.*;

public class Codigo3DireccionesVisitor extends reglasBaseVisitor<String> {
    
    private int contadorLabels;
    private int contadorTemp;
    private String resultado;
    private String tempAnterior;
    private String tempActual;

    public Codigo3DireccionesVisitor() {
        this.contadorLabels = 0;
        this.contadorTemp = 0;
        this.resultado = "";
        this.tempAnterior = "";
        this.tempActual = "";
    }
    
    /* Busco nodos que coincidan con la regla pasada y elimino aquellos que no coinciden */
    public void findRuleNodesWithoutNoRule(ParseTree t, int regla, List<ParseTree> nodes) {
        if (t instanceof ParserRuleContext) {
            ParserRuleContext ctx = (ParserRuleContext) t;
            if (ctx.getRuleIndex() == regla) {
                nodes.add(t);
            }
        }
        for (int i = 0; i < t.getChildCount(); i++) {
            if (!(t.getChild(i) instanceof ExprLogContext)) {
                findRuleNodesWithoutNoRule(t.getChild(i), regla, nodes);
            }
        }
    }

    /* Concatena temporales con la operacion que los separa */
    private void concatenarTemp(String operacion) {
        resultado += String.format("t%d = %s %s %s \n", contadorTemp, tempAnterior, operacion, tempActual);
        tempActual = "t" + contadorTemp;
        contadorTemp++;
    }

    /** Obtiene los nodos del árbol que coinciden con la regla especificada; 
    ctx Árbol en el cual se busca la regla gramatical
    devuelve una lista con los nodos que coinciden con la regla
    */
    private List<ParseTree> findRuleNodes(ParseTree ctx, int reglaIndex) {
        return new ArrayList<ParseTree>(Trees.findAllRuleNodes(ctx, reglaIndex));
    }

    /* Guardo el resultado luego de haber sido concatenado en un archivo txt */
    public void generateCode() {
        try {
            PrintWriter out = new PrintWriter("intermediateCode.txt");
            out.println(this.resultado);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /* Obtengo el codigo de tres direcciones */
    public void getResultado() {
        System.out.println(resultado);
    }

    /**********************************************************/
    @Override
    public String visitAsignacion(AsignacionContext ctx) {

        List<ParseTree> factor = findRuleNodes(ctx, reglasParser.RULE_factor);

        if(factor.size() == 1){

            resultado +=  ctx.ID().getText() + " = " + factor.get(0).getText() + "\n";

        }else{

            processExprLog(ctx.asignacionValor().operacion().exprLog());

            resultado +=  ctx.ID().getText() + " = t" + (contadorTemp - 1) + "\n";

        }

        return null;
    }

    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {

        if(ctx.asignacion() != null){

            List<ParseTree> factor = findRuleNodes(ctx, reglasParser.RULE_factor);

            if(factor.size() == 1){

                resultado +=  ctx.asignacion().ID().getText() + " = " + factor.get(0).getText() + "\n";

            }else{
                
                processExprLog(ctx.asignacion().asignacionValor().operacion().exprLog());

                resultado +=  ctx.asignacion().ID().getText() + " = t" + (contadorTemp - 1) + "\n";
            }

        }

        return null;

    }


    @Override
    public String visitFuncion(FuncionContext ctx) {

        resultado += String.format("funcion comienza %s\n", ctx.ID().getText());
    
        visitChildren(ctx.bloque());

        resultado += String.format("%s termina\n", ctx.ID().getText());

        return null;
    }

    @Override
    public String visitReturnD(ReturnDContext ctx) {

        processExprLog(ctx.operacion().exprLog());

        resultado += String.format("return %s\n", tempActual);

        return null;

    }
   
    @Override
    public String visitLlamadaFuncion(LlamadaFuncionContext ctx) {
        
        if(ctx.parametrosLlamada().operacion().exprLog().getChildCount() > 0){

            List<ParseTree> operaciones = findRuleNodes(ctx, reglasParser.RULE_operacion);

            for(ParseTree a : operaciones){
              
                processExprLog(((OperacionContext)a).exprLog());
                
                resultado += String.format("param %s\n", tempActual);
            }

            resultado += String.format("t%s = call %s, %d\n", contadorTemp, ctx.ID().getText(), operaciones.size());

        } else{

            resultado += String.format("t%d = call %s\n", contadorTemp, ctx.ID().getText());

        }
        
        contadorTemp++;

        return null;

    }


    @Override
    public String visitCicloIf(CicloIfContext ctx) {
       
        contadorLabels++;

        processExprLog(ctx.operacion().exprLog());

        resultado += "ifnot " + tempActual + ", goto L" + contadorLabels + "\n";

        if(ctx.ELSE() == null){

            visitChildren(ctx);

        } else{

            //bloque if
            visitChildren((BloqueContext)ctx.getChild(4));

            int aux = contadorLabels;

            contadorLabels++;

            resultado += String.format("goto %s\n", contadorLabels);
            resultado += String.format("L %s\n", aux);

            //bloque else
            visitChildren((BloqueContext)ctx.getChild(6));

        }
        this.resultado += String.format("L %s\n", contadorLabels);

        return null;
    }

    @Override
    public String visitCicloWhile(CicloWhileContext ctx) {

        contadorLabels++;
        int aux = contadorLabels;

        resultado += String.format("L%s: \n", contadorLabels);
        contadorLabels++;
        
        processExprLog(ctx.operacion().exprLog());

        resultado += String.format("ifnot %s, goto L%s\n", tempActual, contadorLabels);

        visitChildren(ctx);
        
        resultado += String.format("goto L%s\n", aux);
        
        resultado += String.format("L%s:\n", contadorLabels);


        return null;
    }
  
    @Override
    public String visitCicloFor(CicloForContext ctx){
        contadorLabels++;
        
        visitAsignacion(ctx.asignacion());

        int aux = contadorLabels;
        
        /* L1: to: i < 10
        ifnot.... */
        resultado += String.format("L%s:\n", contadorLabels);
        
        processExprLog(ctx.operacion(0).exprLog());

        contadorLabels++;
        resultado += String.format("ifnot %s, goto L%s\n", tempActual, contadorLabels);
        
        visitChildren(ctx.instruccion().bloque());

        resultado += String.format("%s\n", ctx.operacion(1).getText());
        
        
        resultado += String.format("goto L%s\n", aux); 
        resultado += String.format("L%s:\n", contadorLabels);

        return null;
    } 

    /****************************************/
    private void processExprLog(ExprLogContext ctx) {
        List<ParseTree> expOR = new ArrayList<ParseTree>();
        String temp;

        findRuleNodesWithoutNoRule(ctx, reglasParser.RULE_exprOR, expOR);

        for (int i = 0; i < expOR.size(); i++) {
            
            temp = tempActual;
            
            
            processExpAnd((ExprORContext) expOR.get(i));
            
            tempAnterior = temp;
            
            if (i > 0) {
                concatenarTemp(expOR.get(i).getParent().getChild(0).getText());
            }
        }
    }

    private void processExpAnd(ExprORContext ctx) {
        List<ParseTree> expAND = new ArrayList<ParseTree>();
        String temp;
        
        findRuleNodesWithoutNoRule(ctx, reglasParser.RULE_exprAND, expAND);

        for (int i = 0; i < expAND.size(); i++) {
            
            temp = tempActual;
            
            processExpIgualdad((ExprANDContext) expAND.get(i));
            
            tempAnterior = temp;
            
            if (i > 0) {
                concatenarTemp(expAND.get(i).getParent().getChild(0).getText());
            }
        }

    }

    private void processExpIgualdad(ExprANDContext ctx) {
        
        List<ParseTree> expComparacion = new ArrayList<ParseTree>();
        String temp;
        
        findRuleNodesWithoutNoRule(ctx, reglasParser.RULE_exprIgualdad, expComparacion);

        for (int i = 0; i < expComparacion.size(); i++) {
            
            temp = tempActual;
            
            processExpresion((ExprIgualdadContext) expComparacion.get(i));
            
            tempAnterior = temp;
            
            if (i > 0) {
                concatenarTemp(expComparacion.get(i).getParent().getChild(0).getText());
            }
        }
    }

    private void processExpresion(ExprIgualdadContext ctx) {

        List<ParseTree> expresion = new ArrayList<ParseTree>();
        String temp;
        
        findRuleNodesWithoutNoRule(ctx, reglasParser.RULE_expresion, expresion);

        for (int i = 0; i < expresion.size(); i++) {
            
            temp = tempActual;          
            
            processTerminos((ExpresionContext) expresion.get(i));
            
            tempAnterior = temp;
            
            if (i > 0) {
                concatenarTemp(expresion.get(i).getParent().getChild(0).getText());
            }
        }

    }

    private void processTerminos(ExpresionContext ctx) {
        List<ParseTree> reglaterminos = new ArrayList<ParseTree>();
        String temp;
        
        findRuleNodesWithoutNoRule(ctx, reglasParser.RULE_termino, reglaterminos);

        List<ParseTree> terminos = new ArrayList<ParseTree>(reglaterminos);

        for (int i = 0; i < terminos.size(); i++) {
            
            List<ParseTree> factores = new ArrayList<ParseTree>();
            findRuleNodesWithoutNoRule(terminos.get(i), reglasParser.RULE_factor, factores);

            if (factores.size() > 1) {

                temp = tempActual;
                procesarFactores(factores);
                tempAnterior = temp;
                tempActual = "t" + (contadorTemp - 1);


            } else {
               tempAnterior = tempActual;

                if (((TerminoContext) terminos.get(i)).factor().exprLog() != null) {

                    resultado += String.format("1\n");
                    temp = tempActual;
                    processExprLog(((TerminoContext) terminos.get(i)).factor().exprLog());
                    tempAnterior = temp;

                }else if(((TerminoContext)terminos.get(i)).factor().llamadaFuncion() != null){

                    resultado += String.format("2\n");
                    temp = tempActual;
                    visitLlamadaFuncion(((TerminoContext) terminos.get(i)).factor().llamadaFuncion());
                    tempAnterior = temp;
                    tempActual = "t" + (contadorTemp - 1);

                }
                else {
                    tempActual = factores.get(0).getText();

                }
       
            }

            if(i > 0){ 
                concatenarTemp(terminos.get(i).getParent().getChild(0).getText());
            }

        }

    }

    private void procesarFactores(List<ParseTree> factores) {

        String temp;
        for(int i=0; i < factores.size(); i++){

            if(((FactorContext)factores.get(i)).exprLog() != null){
                temp = tempActual;
                processExprLog(((FactorContext) factores.get(i)).exprLog());
                tempAnterior = temp;

            } else if(((FactorContext)factores.get(i)).llamadaFuncion() != null){
                temp = tempActual;
                visitLlamadaFuncion(((FactorContext)factores.get(i)).llamadaFuncion());
                tempAnterior = temp;
                tempActual = "t" + (contadorTemp - 1);

            } else {
                
                tempAnterior = tempActual;
                tempActual = factores.get(i).getText();

            }

            if (i > 0) {
                concatenarTemp(factores.get(i).getParent().getChild(0).getText());
            }
        }
    }
}