// Generated from /home/sofia/Descargas/ProyectoTC/src/app/reglas.g4 by ANTLR 4.8

    package app;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link reglasParser}.
 */
public interface reglasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link reglasParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(reglasParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(reglasParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(reglasParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(reglasParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void enterTipodato(reglasParser.TipodatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void exitTipodato(reglasParser.TipodatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(reglasParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(reglasParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#asignacionValor}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionValor(reglasParser.AsignacionValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#asignacionValor}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionValor(reglasParser.AsignacionValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(reglasParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(reglasParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprLog}.
	 * @param ctx the parse tree
	 */
	void enterExprLog(reglasParser.ExprLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprLog}.
	 * @param ctx the parse tree
	 */
	void exitExprLog(reglasParser.ExprLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprOR}.
	 * @param ctx the parse tree
	 */
	void enterExprOR(reglasParser.ExprORContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprOR}.
	 * @param ctx the parse tree
	 */
	void exitExprOR(reglasParser.ExprORContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#disy}.
	 * @param ctx the parse tree
	 */
	void enterDisy(reglasParser.DisyContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#disy}.
	 * @param ctx the parse tree
	 */
	void exitDisy(reglasParser.DisyContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprAND}.
	 * @param ctx the parse tree
	 */
	void enterExprAND(reglasParser.ExprANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprAND}.
	 * @param ctx the parse tree
	 */
	void exitExprAND(reglasParser.ExprANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(reglasParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(reglasParser.ConjContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exprIgualdad}.
	 * @param ctx the parse tree
	 */
	void enterExprIgualdad(reglasParser.ExprIgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exprIgualdad}.
	 * @param ctx the parse tree
	 */
	void exitExprIgualdad(reglasParser.ExprIgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(reglasParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(reglasParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#comparaciones}.
	 * @param ctx the parse tree
	 */
	void enterComparaciones(reglasParser.ComparacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#comparaciones}.
	 * @param ctx the parse tree
	 */
	void exitComparaciones(reglasParser.ComparacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(reglasParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(reglasParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(reglasParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(reglasParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(reglasParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(reglasParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(reglasParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(reglasParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(reglasParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(reglasParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(reglasParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(reglasParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(reglasParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(reglasParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#prototipoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterPrototipoFuncion(reglasParser.PrototipoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#prototipoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitPrototipoFuncion(reglasParser.PrototipoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#parametrosFuncion}.
	 * @param ctx the parse tree
	 */
	void enterParametrosFuncion(reglasParser.ParametrosFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#parametrosFuncion}.
	 * @param ctx the parse tree
	 */
	void exitParametrosFuncion(reglasParser.ParametrosFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(reglasParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(reglasParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#parametrosLlamada}.
	 * @param ctx the parse tree
	 */
	void enterParametrosLlamada(reglasParser.ParametrosLlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#parametrosLlamada}.
	 * @param ctx the parse tree
	 */
	void exitParametrosLlamada(reglasParser.ParametrosLlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void enterCicloFor(reglasParser.CicloForContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void exitCicloFor(reglasParser.CicloForContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void enterCicloWhile(reglasParser.CicloWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void exitCicloWhile(reglasParser.CicloWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#cicloIf}.
	 * @param ctx the parse tree
	 */
	void enterCicloIf(reglasParser.CicloIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#cicloIf}.
	 * @param ctx the parse tree
	 */
	void exitCicloIf(reglasParser.CicloIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#returnD}.
	 * @param ctx the parse tree
	 */
	void enterReturnD(reglasParser.ReturnDContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#returnD}.
	 * @param ctx the parse tree
	 */
	void exitReturnD(reglasParser.ReturnDContext ctx);
}