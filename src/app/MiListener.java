package app;

import java.util.ArrayList;
import java.util.Collection;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import app.reglasParser.*;
import models.*;
import errores.*;

public class MiListener extends reglasBaseListener {

    private static TablaSimbolos tablaSimbolos = new TablaSimbolos();
    private ErrorEncontrado errores = new ErrorEncontrado();

    /* Inicio el programa */
    @Override public void enterProg(reglasParser.ProgContext ctx) { 
        tablaSimbolos.agregarContexto(); //ingreso al contexto
    }
    
    /*Obtengo los parametros de prototipo y de la funcion*/
    private ArrayList<Variable> obtenerParametros(ParametrosFuncionContext ctx, ArrayList<Variable> parametros) {
        
        Collection<ParseTree> param = Trees.findAllRuleNodes(ctx, reglasParser.RULE_parametrosFuncion);

        if(ctx.ID() != null){

            for(ParseTree parse : param){
                ParametrosFuncionContext pfc = (ParametrosFuncionContext) parse;

                Variable id = new Variable();
                id.setTipoDato(pfc.tipodato().getText());
                id.setNombre(pfc.ID().getText());
                id.setInicializado(true);
                id.setUsado(false);
                parametros.add(id);            
                
            }

            return parametros;            

        }else{
            return null;
        }             
    }
    
    /* Prototipo de la Funcion */
    @Override public void exitPrototipoFuncion(reglasParser.PrototipoFuncionContext ctx) { 

        ArrayList<Variable> parametros = new ArrayList<>();
        
        parametros = obtenerParametros(ctx.parametrosFuncion(), parametros);

        ID prototipo = new Funcion(ctx.tipodato().getText(), ctx.ID().getText(), false, false);

        

        if(parametros != null){
            
            tablaSimbolos.addParamContext();

            for (ID aux : parametros) {  
                
                if(tablaSimbolos.encontrarId(ctx.ID().getText()) != null){
                    errores.idDeclarado(ctx.getStop().getLine(), aux.getNombre());
                }
                
                tablaSimbolos.agregarId(aux);
            }

            tablaSimbolos.eliminarContexto();
            
            ((Funcion)prototipo).setParams(parametros);
            
        }

        tablaSimbolos.insertFunction(prototipo);
    }

    /*Obtener informacion de la funcion*/
    private ID procesarFuncion(FuncionContext ctx) {

        ArrayList<Variable> parametros = new ArrayList<>();

        ID prototipo = new Funcion(ctx.tipodato().getText(), ctx.ID().getText(), true, false);

        parametros = obtenerParametros(ctx.parametrosFuncion(), parametros);

        if(parametros != null){
            tablaSimbolos.addParamContext();

            for (ID aux : parametros) {  

                
                if(tablaSimbolos.encontrarIdLocal(ctx.ID().getText()) != null){
                    errores.idDeclarado(ctx.getStop().getLine(), aux.getNombre());
                }
                tablaSimbolos.agregarId(aux);

            }

            tablaSimbolos.eliminarContexto();
            
            ((Funcion)prototipo).setParams(parametros);
            
        }

        return prototipo;
    }

    /* Entro al bloque */
    @Override public void enterBloque(reglasParser.BloqueContext ctx) {        

        if(ctx.getParent() instanceof FuncionContext) {
            
            FuncionContext fContext = (FuncionContext)ctx.getParent();
            
            ID func = procesarFuncion(fContext);      
            
            tablaSimbolos.insertFunction(func);
            
            tablaSimbolos.agregarContexto();


            if(fContext.parametrosFuncion() != null){

                for(ID id : ((Funcion) func).getParams()){
                    
                    tablaSimbolos.agregarId(id);

                }

            }
            
        } else{
            tablaSimbolos.agregarContexto();
        }
    }


    private ArrayList<FactorContext> obtenerFactores (ParseTree ctx) {
        
        ArrayList<FactorContext> factores = new ArrayList<FactorContext>();
 
        Collection<ParseTree> param = Trees.findAllRuleNodes(ctx, reglasParser.RULE_factor);

        for(ParseTree parseTree : param){

            factores.add((FactorContext)parseTree);

        }

        if(factores.size() > 0) {
            return factores;
        } else{
            return null;
        }
    } 

    /*Comparo tipo de datos de dos valores*/

    private boolean compararTipos(String tipoId, FactorContext factor) {
        
        if (factor.INTEGER() != null && tipoId.equals("int")) {
            return true;
        }
        if (factor.DECIMAL() != null && tipoId.equals("double")) {
            return true;
        }
        if (factor.CHARACTER() != null && tipoId.equals("char")) {
            return true;
        }
        
        if(factor.llamadaFuncion() != null){

            ID id = tablaSimbolos.encontrarId(factor.llamadaFuncion().ID().getText());

            if(id != null){

                if(tipoId.equals(id.getTipoDato())){
                    
                    return true;

                }else{  

                    return false;

                }
            }
        }

        if(factor.ID() != null){


            ID id = tablaSimbolos.encontrarId(factor.ID().getText());

            if(id != null){

                if(tipoId.equals(id.getTipoDato())){
                    
                    return true;

                }else{  

                    return false;

                }
            }else{

                errores.idNoDeclarado(factor.getStop().getLine(), factor.ID().getText());

            }           

        }
        
        return false;
	}


    /*Veo si tiene return o no y si corresponde lo que se le colocó*/
    private void procesarReturn(FuncionContext ctx) {

        Collection<ParseTree> returns = Trees.findAllRuleNodes(ctx, reglasParser.RULE_returnD);       

        if(ctx.tipodato().getText().equals("void") && returns.size() != 0){

            errores.returnEnFuncionVoid(ctx.getStop().getLine(), ctx.ID().getText());

        }else if(!ctx.tipodato().getText().equals("void") && returns.size() > 0){
           
            ArrayList<FactorContext> factores = obtenerFactores(ctx);

            if(factores != null){                

                for (FactorContext factor : factores) {
                   
                    if (!compararTipos(ctx.tipodato().getText(), factor)){
                        errores.returnDiferenteAlTipoDeFuncion(ctx.getStart().getLine());
                        return;
                    }
                }

                procesarFactores(ctx.tipodato().getText(), factores);
            }         
        }else if(!ctx.tipodato().getText().equals("void") && !ctx.ID().getText().equals("main") && returns.size() == 0){
            errores.noTieneReturnEnFuncionNoVoid(ctx.getStart().getLine(), ctx.ID().getText());
        }
        
    }

    /* Llamada de la Funcion */
	@Override public void exitLlamadaFuncion(reglasParser.LlamadaFuncionContext ctx) {
        
        ID funcion = tablaSimbolos.encontrarId(ctx.ID().getText());

        if(funcion != null){
            procesarLlamadaFuncion(null, ctx);  
        }  
    
    }


    private void procesarLlamadaFuncion(String tipo, LlamadaFuncionContext ctx) {

        ID funcion = tablaSimbolos.encontrarId(ctx.ID().getText());

        if(funcion == null){
            errores.funcionNoDeclarada(ctx.getStop().getLine(), ctx.ID().getText());
            return;
        }

        ArrayList<FactorContext> factores = obtenerFactores(ctx.parametrosLlamada());

        if(factores != null){

            int cantidadFact = obtenerFactores(ctx.parametrosLlamada()).size();

            if (!(funcion instanceof Funcion)){
                
                errores.llamadaANoFuncion(ctx.getStart().getLine(), ctx.ID().getText());
                return;

            }else if (cantidadFact < ((Funcion) funcion).getParams().size()){

                errores.pocosArgumentos(ctx.getStart().getLine(), ctx.ID().getText());
                return;

            } else if (cantidadFact > ((Funcion) funcion).getParams().size()){

                errores.muchosArgumentos(ctx.getStart().getLine(), ctx.ID().getText());
                return;

            }else{
                if(procesarFactores(funcion.getTipoDato(), factores)){
            
                    funcion.setInicializado(true);
                }
            }
        }
        
        
        funcion.setUsado(true); 
    }

    /* Declaracion de Variables */
	@Override public void exitDeclaracion(reglasParser.DeclaracionContext ctx) {     
        if(ctx.asignacion() == null){
            
            ID id = tablaSimbolos.encontrarIdLocal(ctx.ID().getText());

            if(id == null){
    
                ID id2 = new Variable(ctx.tipodato().getText(), ctx.ID().getText(), true, false);          
               
                tablaSimbolos.agregarId(id2);
    
            }else{
                errores.idDeclarado(ctx.getStop().getLine(), id.getNombre());
            } 
        } else{
            ArrayList<FactorContext> factores = obtenerFactores(ctx);

            if(factores != null){
                procesarFactores(ctx.tipodato().getText(), factores);
            }            
        }     
    }


    /* Asignacion de variables */
	@Override public void exitAsignacion(reglasParser.AsignacionContext ctx) {
        
        ID id = tablaSimbolos.encontrarId(ctx.ID().getText());

        if(ctx.getParent() instanceof DeclaracionContext){
            id = new Variable(((DeclaracionContext) ctx.getParent()).tipodato().getText(), ctx.ID().getText(), true, false);
            tablaSimbolos.agregarId(id);

        }

        if(id == null){
            errores.idNoDeclarado(ctx.getStop().getLine(), ctx.ID().getText());
            return;
        }

        ArrayList<FactorContext> factores = obtenerFactores(ctx);

        if(factores == null){
            errores.idNoAsignado(ctx.getStop().getLine(), ctx.ID().getText());
        }

        if(procesarFactores(id.getTipoDato(), factores)){
            
            id.setInicializado(true);
        }
        

    }

    private boolean procesarFactores(String tipoDato, ArrayList<FactorContext> factores) {

        FactorContext fc;
        boolean e = true;

        for (ParseTree parseTree : factores) {

            fc = (FactorContext) parseTree;   

            if(fc.ID() != null){

                ID id = tablaSimbolos.encontrarId(fc.ID().getText());

                if(id == null){

                    errores.idNoDeclarado(fc.getStop().getLine(), fc.ID().getText());

                }else if(!id.isInicializado()){
                    
                    errores.idNoInicializado(fc.getStop().getLine(), fc.ID().getText());

                }else{
                    id.setUsado(true);
                    if(compararTipos(tipoDato, fc)){
                        e = true;
                    } else{
                        e = false;
                    }                   

                }


            } else if(fc.llamadaFuncion() != null){
                
                procesarLlamadaFuncion(tipoDato, fc.llamadaFuncion());
                
            } else if (fc.INTEGER() != null || fc.DECIMAL() != null || fc.CHARACTER() != null) {

                if (!compararTipos(tipoDato, fc)){
                    e = false;
                }
            }
        }
        return e;
    }

    /* Fin del bloque */
    @Override public void exitBloque(reglasParser.BloqueContext ctx) { 
       
        if(ctx.getParent() instanceof FuncionContext){
            procesarReturn((FuncionContext)ctx.getParent());
        }
        errores.idNoUsado(tablaSimbolos.sinUso()); 
    }       

    /* Fin del Programa */
	@Override public void exitProg(reglasParser.ProgContext ctx) { 
        tablaSimbolos.imprimirTablaSimbolo();        
        errores.idNoUsado(tablaSimbolos.sinUso());      
    }
}