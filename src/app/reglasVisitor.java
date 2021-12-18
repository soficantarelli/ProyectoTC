// Generated from /home/sofia/Descargas/ProyectoTC/src/app/reglas.g4 by ANTLR 4.8

    package app;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link reglasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface reglasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link reglasParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(reglasParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(reglasParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#tipodato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipodato(reglasParser.TipodatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(reglasParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#asignacionValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionValor(reglasParser.AsignacionValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(reglasParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLog(reglasParser.ExprLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprOR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOR(reglasParser.ExprORContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#disy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisy(reglasParser.DisyContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprAND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAND(reglasParser.ExprANDContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#conj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConj(reglasParser.ConjContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exprIgualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIgualdad(reglasParser.ExprIgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(reglasParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#comparaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparaciones(reglasParser.ComparacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(reglasParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(reglasParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(reglasParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(reglasParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(reglasParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(reglasParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(reglasParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#prototipoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototipoFuncion(reglasParser.PrototipoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#parametrosFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosFuncion(reglasParser.ParametrosFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(reglasParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#parametrosLlamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosLlamada(reglasParser.ParametrosLlamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#cicloFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloFor(reglasParser.CicloForContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#cicloWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloWhile(reglasParser.CicloWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#cicloIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloIf(reglasParser.CicloIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#returnD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnD(reglasParser.ReturnDContext ctx);
}