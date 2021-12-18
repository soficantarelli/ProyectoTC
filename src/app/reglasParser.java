// Generated from /home/sofia/Descargas/ProyectoTC/src/app/reglas.g4 by ANTLR 4.8

    package app;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class reglasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, OTRO=2, PA=3, PC=4, LA=5, LC=6, CA=7, CC=8, SUM=9, RES=10, MUL=11, 
		DIV=12, MOD=13, INCREMENT=14, DECREMENT=15, EQ=16, MAY=17, MEN=18, MAYIG=19, 
		MENIG=20, DIS=21, OR=22, AND=23, NOT=24, TRUE=25, FALSE=26, MASIGUAL=27, 
		MENOSIGUAL=28, PORIGUAL=29, BARRAIGUAL=30, MODULOIGUAL=31, IGUAL=32, INT=33, 
		DOUBLE=34, CHAR=35, VOID=36, FOR=37, IF=38, WHILE=39, ELSE=40, COMA=41, 
		PYC=42, RETURN=43, ID=44, INTEGER=45, DECIMAL=46, CHARACTER=47;
	public static final int
		RULE_prog = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_tipodato = 4, RULE_asignacion = 5, RULE_declaracion = 6, RULE_asignacionValor = 7, 
		RULE_operacion = 8, RULE_exprLog = 9, RULE_exprOR = 10, RULE_disy = 11, 
		RULE_exprAND = 12, RULE_conj = 13, RULE_exprIgualdad = 14, RULE_comp = 15, 
		RULE_comparaciones = 16, RULE_expresion = 17, RULE_exp = 18, RULE_termino = 19, 
		RULE_term = 20, RULE_factor = 21, RULE_f = 22, RULE_funcion = 23, RULE_prototipoFuncion = 24, 
		RULE_parametrosFuncion = 25, RULE_llamadaFuncion = 26, RULE_parametrosLlamada = 27, 
		RULE_cicloFor = 28, RULE_cicloWhile = 29, RULE_cicloIf = 30, RULE_returnD = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "instrucciones", "instruccion", "bloque", "tipodato", "asignacion", 
			"declaracion", "asignacionValor", "operacion", "exprLog", "exprOR", "disy", 
			"exprAND", "conj", "exprIgualdad", "comp", "comparaciones", "expresion", 
			"exp", "termino", "term", "factor", "f", "funcion", "prototipoFuncion", 
			"parametrosFuncion", "llamadaFuncion", "parametrosLlamada", "cicloFor", 
			"cicloWhile", "cicloIf", "returnD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'>'", "'<'", "'=>'", "'<='", 
			"'!='", "'||'", "'&&'", "'!'", "'true'", "'false'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'='", "'int'", "'double'", "'char'", "'void'", "'for'", 
			"'if'", "'while'", "'else'", "','", "';'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "OTRO", "PA", "PC", "LA", "LC", "CA", "CC", "SUM", "RES", 
			"MUL", "DIV", "MOD", "INCREMENT", "DECREMENT", "EQ", "MAY", "MEN", "MAYIG", 
			"MENIG", "DIS", "OR", "AND", "NOT", "TRUE", "FALSE", "MASIGUAL", "MENOSIGUAL", 
			"PORIGUAL", "BARRAIGUAL", "MODULOIGUAL", "IGUAL", "INT", "DOUBLE", "CHAR", 
			"VOID", "FOR", "IF", "WHILE", "ELSE", "COMA", "PYC", "RETURN", "ID", 
			"INTEGER", "DECIMAL", "CHARACTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "reglas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public reglasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(reglasParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			instrucciones();
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LA:
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case FOR:
			case IF:
			case WHILE:
			case RETURN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				instruccion();
				setState(68);
				instrucciones();
				}
				break;
			case EOF:
			case LC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(reglasParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public PrototipoFuncionContext prototipoFuncion() {
			return getRuleContext(PrototipoFuncionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public CicloForContext cicloFor() {
			return getRuleContext(CicloForContext.class,0);
		}
		public CicloWhileContext cicloWhile() {
			return getRuleContext(CicloWhileContext.class,0);
		}
		public CicloIfContext cicloIf() {
			return getRuleContext(CicloIfContext.class,0);
		}
		public ReturnDContext returnD() {
			return getRuleContext(ReturnDContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				declaracion();
				setState(75);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				asignacion();
				setState(78);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				prototipoFuncion();
				setState(81);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				funcion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				llamadaFuncion();
				setState(85);
				match(PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				cicloFor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				cicloWhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				cicloIf();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				returnD();
				setState(91);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(reglasParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(reglasParser.LC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LA);
			setState(96);
			instrucciones();
			setState(97);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipodatoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(reglasParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(reglasParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(reglasParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(reglasParser.VOID, 0); }
		public TipodatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipodato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterTipodato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitTipodato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitTipodato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipodatoContext tipodato() throws RecognitionException {
		TipodatoContext _localctx = new TipodatoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipodato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public AsignacionValorContext asignacionValor() {
			return getRuleContext(AsignacionValorContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			setState(102);
			asignacionValor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				tipodato();
				setState(105);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				tipodato();
				setState(108);
				asignacion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionValorContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(reglasParser.IGUAL, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public AsignacionValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionValor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterAsignacionValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitAsignacionValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitAsignacionValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionValorContext asignacionValor() throws RecognitionException {
		AsignacionValorContext _localctx = new AsignacionValorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacionValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IGUAL);
			setState(113);
			operacion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			exprLog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprLogContext extends ParserRuleContext {
		public ExprORContext exprOR() {
			return getRuleContext(ExprORContext.class,0);
		}
		public ExprLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogContext exprLog() throws RecognitionException {
		ExprLogContext _localctx = new ExprLogContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprLog);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case SUM:
			case RES:
			case INCREMENT:
			case DECREMENT:
			case NOT:
			case ID:
			case INTEGER:
			case DECIMAL:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				exprOR();
				}
				break;
			case PC:
			case COMA:
			case PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprORContext extends ParserRuleContext {
		public ExprANDContext exprAND() {
			return getRuleContext(ExprANDContext.class,0);
		}
		public DisyContext disy() {
			return getRuleContext(DisyContext.class,0);
		}
		public ExprORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprOR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprORContext exprOR() throws RecognitionException {
		ExprORContext _localctx = new ExprORContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprOR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			exprAND();
			setState(122);
			disy();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisyContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(reglasParser.OR, 0); }
		public ExprANDContext exprAND() {
			return getRuleContext(ExprANDContext.class,0);
		}
		public DisyContext disy() {
			return getRuleContext(DisyContext.class,0);
		}
		public DisyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterDisy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitDisy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitDisy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisyContext disy() throws RecognitionException {
		DisyContext _localctx = new DisyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_disy);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(OR);
				setState(125);
				exprAND();
				setState(126);
				disy();
				}
				break;
			case PC:
			case COMA:
			case PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprANDContext extends ParserRuleContext {
		public ExprIgualdadContext exprIgualdad() {
			return getRuleContext(ExprIgualdadContext.class,0);
		}
		public ConjContext conj() {
			return getRuleContext(ConjContext.class,0);
		}
		public ExprANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprAND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprANDContext exprAND() throws RecognitionException {
		ExprANDContext _localctx = new ExprANDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprAND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			exprIgualdad();
			setState(132);
			conj();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(reglasParser.AND, 0); }
		public ExprIgualdadContext exprIgualdad() {
			return getRuleContext(ExprIgualdadContext.class,0);
		}
		public ConjContext conj() {
			return getRuleContext(ConjContext.class,0);
		}
		public ConjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterConj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitConj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitConj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjContext conj() throws RecognitionException {
		ConjContext _localctx = new ConjContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conj);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(AND);
				setState(135);
				exprIgualdad();
				setState(136);
				conj();
				}
				break;
			case PC:
			case OR:
			case COMA:
			case PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprIgualdadContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ExprIgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprIgualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIgualdadContext exprIgualdad() throws RecognitionException {
		ExprIgualdadContext _localctx = new ExprIgualdadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprIgualdad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expresion();
			setState(142);
			comp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public ComparacionesContext comparaciones() {
			return getRuleContext(ComparacionesContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comp);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
			case MAY:
			case MEN:
			case MAYIG:
			case MENIG:
			case DIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				comparaciones();
				setState(145);
				expresion();
				setState(146);
				comp();
				}
				break;
			case PC:
			case OR:
			case AND:
			case COMA:
			case PYC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacionesContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(reglasParser.EQ, 0); }
		public TerminalNode MAY() { return getToken(reglasParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(reglasParser.MEN, 0); }
		public TerminalNode MAYIG() { return getToken(reglasParser.MAYIG, 0); }
		public TerminalNode MENIG() { return getToken(reglasParser.MENIG, 0); }
		public TerminalNode DIS() { return getToken(reglasParser.DIS, 0); }
		public ComparacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterComparaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitComparaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitComparaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionesContext comparaciones() throws RecognitionException {
		ComparacionesContext _localctx = new ComparacionesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << MAY) | (1L << MEN) | (1L << MAYIG) | (1L << MENIG) | (1L << DIS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			termino();
			setState(154);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(reglasParser.SUM, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RES() { return getToken(reglasParser.RES, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(SUM);
				setState(157);
				termino();
				setState(158);
				exp();
				}
				break;
			case RES:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(RES);
				setState(161);
				termino();
				setState(162);
				exp();
				}
				break;
			case PC:
			case EQ:
			case MAY:
			case MEN:
			case MAYIG:
			case MENIG:
			case DIS:
			case OR:
			case AND:
			case COMA:
			case PYC:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			factor();
			setState(168);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(reglasParser.MUL, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(reglasParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(reglasParser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(MUL);
				setState(171);
				factor();
				setState(172);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(DIV);
				setState(175);
				factor();
				setState(176);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(MOD);
				setState(179);
				factor();
				setState(180);
				term();
				}
				break;
			case PC:
			case SUM:
			case RES:
			case EQ:
			case MAY:
			case MEN:
			case MAYIG:
			case MENIG:
			case DIS:
			case OR:
			case AND:
			case COMA:
			case PYC:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(reglasParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode DECIMAL() { return getToken(reglasParser.DECIMAL, 0); }
		public TerminalNode CHARACTER() { return getToken(reglasParser.CHARACTER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				f();
				setState(186);
				match(PA);
				setState(187);
				exprLog();
				setState(188);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				f();
				setState(191);
				llamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				f();
				setState(194);
				match(INTEGER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				f();
				setState(197);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				f();
				setState(200);
				match(DECIMAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				f();
				setState(203);
				match(CHARACTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				match(ID);
				setState(206);
				f();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(reglasParser.SUM, 0); }
		public TerminalNode RES() { return getToken(reglasParser.RES, 0); }
		public TerminalNode NOT() { return getToken(reglasParser.NOT, 0); }
		public TerminalNode INCREMENT() { return getToken(reglasParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(reglasParser.DECREMENT, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_f);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(SUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(RES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(NOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(INCREMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(DECREMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ParametrosFuncionContext parametrosFuncion() {
			return getRuleContext(ParametrosFuncionContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			tipodato();
			setState(218);
			match(ID);
			setState(219);
			match(PA);
			setState(220);
			parametrosFuncion();
			setState(221);
			match(PC);
			setState(222);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrototipoFuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ParametrosFuncionContext parametrosFuncion() {
			return getRuleContext(ParametrosFuncionContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public PrototipoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototipoFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterPrototipoFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitPrototipoFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitPrototipoFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrototipoFuncionContext prototipoFuncion() throws RecognitionException {
		PrototipoFuncionContext _localctx = new PrototipoFuncionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_prototipoFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			tipodato();
			setState(225);
			match(ID);
			setState(226);
			match(PA);
			setState(227);
			parametrosFuncion();
			setState(228);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosFuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode COMA() { return getToken(reglasParser.COMA, 0); }
		public ParametrosFuncionContext parametrosFuncion() {
			return getRuleContext(ParametrosFuncionContext.class,0);
		}
		public ParametrosFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterParametrosFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitParametrosFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitParametrosFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosFuncionContext parametrosFuncion() throws RecognitionException {
		ParametrosFuncionContext _localctx = new ParametrosFuncionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parametrosFuncion);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				tipodato();
				setState(231);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				tipodato();
				setState(234);
				match(ID);
				setState(235);
				match(COMA);
				setState(236);
				parametrosFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public ParametrosLlamadaContext parametrosLlamada() {
			return getRuleContext(ParametrosLlamadaContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_llamadaFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			match(PA);
			setState(243);
			parametrosLlamada();
			setState(244);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosLlamadaContext extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(reglasParser.COMA, 0); }
		public ParametrosLlamadaContext parametrosLlamada() {
			return getRuleContext(ParametrosLlamadaContext.class,0);
		}
		public ParametrosLlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosLlamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterParametrosLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitParametrosLlamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitParametrosLlamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosLlamadaContext parametrosLlamada() throws RecognitionException {
		ParametrosLlamadaContext _localctx = new ParametrosLlamadaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parametrosLlamada);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				operacion();
				setState(247);
				match(COMA);
				setState(248);
				parametrosLlamada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				operacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(reglasParser.FOR, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(reglasParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(reglasParser.PYC, i);
		}

		/*ctx.getChild(6).getText() + "\n"; */
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public CicloForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterCicloFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitCicloFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitCicloFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloForContext cicloFor() throws RecognitionException {
		CicloForContext _localctx = new CicloForContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cicloFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FOR);
			setState(255);
			match(PA);
			setState(256);
			asignacion();
			setState(257);
			match(PYC);
			setState(258);
			operacion();
			setState(259);
			match(PYC);
			setState(260);
			operacion();
			setState(261);
			match(PC);
			setState(262);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(reglasParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public CicloWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterCicloWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitCicloWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitCicloWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloWhileContext cicloWhile() throws RecognitionException {
		CicloWhileContext _localctx = new CicloWhileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cicloWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(WHILE);
			setState(265);
			match(PA);
			setState(266);
			operacion();
			setState(267);
			match(PC);
			setState(268);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(reglasParser.IF, 0); }
		public TerminalNode PA() { return getToken(reglasParser.PA, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(reglasParser.PC, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(reglasParser.ELSE, 0); }
		public CicloIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterCicloIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitCicloIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitCicloIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloIfContext cicloIf() throws RecognitionException {
		CicloIfContext _localctx = new CicloIfContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cicloIf);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(IF);
				setState(271);
				match(PA);
				setState(272);
				operacion();
				setState(273);
				match(PC);
				setState(274);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(IF);
				setState(277);
				match(PA);
				setState(278);
				operacion();
				setState(279);
				match(PC);
				setState(280);
				bloque();
				setState(281);
				match(ELSE);
				setState(282);
				bloque();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(IF);
				setState(285);
				match(PA);
				setState(286);
				operacion();
				setState(287);
				match(PC);
				setState(288);
				instruccion();
				setState(289);
				match(ELSE);
				setState(290);
				instruccion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnDContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(reglasParser.RETURN, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ReturnDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterReturnD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitReturnD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitReturnD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnDContext returnD() throws RecognitionException {
		ReturnDContext _localctx = new ReturnDContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(RETURN);
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(295);
				operacion();
				}
				break;
			case 2:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u012e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\5\13z\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0084"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0098\n\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a8\n\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00ba\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d2\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00da\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00f2\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u00ff\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0127\n \3!\3!\3!\5!\u012c\n"+
		"!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@\2\4\3\2#&\3\2\22\27\2\u0133\2B\3\2\2\2\4I\3\2\2\2\6_\3\2\2\2\ba"+
		"\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16p\3\2\2\2\20r\3\2\2\2\22u\3\2\2\2\24"+
		"y\3\2\2\2\26{\3\2\2\2\30\u0083\3\2\2\2\32\u0085\3\2\2\2\34\u008d\3\2\2"+
		"\2\36\u008f\3\2\2\2 \u0097\3\2\2\2\"\u0099\3\2\2\2$\u009b\3\2\2\2&\u00a7"+
		"\3\2\2\2(\u00a9\3\2\2\2*\u00b9\3\2\2\2,\u00d1\3\2\2\2.\u00d9\3\2\2\2\60"+
		"\u00db\3\2\2\2\62\u00e2\3\2\2\2\64\u00f1\3\2\2\2\66\u00f3\3\2\2\28\u00fe"+
		"\3\2\2\2:\u0100\3\2\2\2<\u010a\3\2\2\2>\u0126\3\2\2\2@\u0128\3\2\2\2B"+
		"C\5\4\3\2CD\7\2\2\3D\3\3\2\2\2EF\5\6\4\2FG\5\4\3\2GJ\3\2\2\2HJ\3\2\2\2"+
		"IE\3\2\2\2IH\3\2\2\2J\5\3\2\2\2K`\5\b\5\2LM\5\16\b\2MN\7,\2\2N`\3\2\2"+
		"\2OP\5\f\7\2PQ\7,\2\2Q`\3\2\2\2RS\5\62\32\2ST\7,\2\2T`\3\2\2\2U`\5\60"+
		"\31\2VW\5\66\34\2WX\7,\2\2X`\3\2\2\2Y`\5:\36\2Z`\5<\37\2[`\5> \2\\]\5"+
		"@!\2]^\7,\2\2^`\3\2\2\2_K\3\2\2\2_L\3\2\2\2_O\3\2\2\2_R\3\2\2\2_U\3\2"+
		"\2\2_V\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2`\7\3\2\2\2ab\7"+
		"\7\2\2bc\5\4\3\2cd\7\b\2\2d\t\3\2\2\2ef\t\2\2\2f\13\3\2\2\2gh\7.\2\2h"+
		"i\5\20\t\2i\r\3\2\2\2jk\5\n\6\2kl\7.\2\2lq\3\2\2\2mn\5\n\6\2no\5\f\7\2"+
		"oq\3\2\2\2pj\3\2\2\2pm\3\2\2\2q\17\3\2\2\2rs\7\"\2\2st\5\22\n\2t\21\3"+
		"\2\2\2uv\5\24\13\2v\23\3\2\2\2wz\5\26\f\2xz\3\2\2\2yw\3\2\2\2yx\3\2\2"+
		"\2z\25\3\2\2\2{|\5\32\16\2|}\5\30\r\2}\27\3\2\2\2~\177\7\30\2\2\177\u0080"+
		"\5\32\16\2\u0080\u0081\5\30\r\2\u0081\u0084\3\2\2\2\u0082\u0084\3\2\2"+
		"\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\31\3\2\2\2\u0085\u0086\5\36"+
		"\20\2\u0086\u0087\5\34\17\2\u0087\33\3\2\2\2\u0088\u0089\7\31\2\2\u0089"+
		"\u008a\5\36\20\2\u008a\u008b\5\34\17\2\u008b\u008e\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u008c\3\2\2\2\u008e\35\3\2\2\2\u008f"+
		"\u0090\5$\23\2\u0090\u0091\5 \21\2\u0091\37\3\2\2\2\u0092\u0093\5\"\22"+
		"\2\u0093\u0094\5$\23\2\u0094\u0095\5 \21\2\u0095\u0098\3\2\2\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0096\3\2\2\2\u0098!\3\2\2\2\u0099"+
		"\u009a\t\3\2\2\u009a#\3\2\2\2\u009b\u009c\5(\25\2\u009c\u009d\5&\24\2"+
		"\u009d%\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a0\5(\25\2\u00a0\u00a1\5"+
		"&\24\2\u00a1\u00a8\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\5(\25\2\u00a4"+
		"\u00a5\5&\24\2\u00a5\u00a8\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009e\3\2"+
		"\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\'\3\2\2\2\u00a9\u00aa"+
		"\5,\27\2\u00aa\u00ab\5*\26\2\u00ab)\3\2\2\2\u00ac\u00ad\7\r\2\2\u00ad"+
		"\u00ae\5,\27\2\u00ae\u00af\5*\26\2\u00af\u00ba\3\2\2\2\u00b0\u00b1\7\16"+
		"\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b3\5*\26\2\u00b3\u00ba\3\2\2\2\u00b4"+
		"\u00b5\7\17\2\2\u00b5\u00b6\5,\27\2\u00b6\u00b7\5*\26\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00ac\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9"+
		"\u00b4\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba+\3\2\2\2\u00bb\u00bc\5.\30\2"+
		"\u00bc\u00bd\7\5\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf\7\6\2\2\u00bf\u00d2"+
		"\3\2\2\2\u00c0\u00c1\5.\30\2\u00c1\u00c2\5\66\34\2\u00c2\u00d2\3\2\2\2"+
		"\u00c3\u00c4\5.\30\2\u00c4\u00c5\7/\2\2\u00c5\u00d2\3\2\2\2\u00c6\u00c7"+
		"\5.\30\2\u00c7\u00c8\7.\2\2\u00c8\u00d2\3\2\2\2\u00c9\u00ca\5.\30\2\u00ca"+
		"\u00cb\7\60\2\2\u00cb\u00d2\3\2\2\2\u00cc\u00cd\5.\30\2\u00cd\u00ce\7"+
		"\61\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00d0\7.\2\2\u00d0\u00d2\5.\30\2\u00d1"+
		"\u00bb\3\2\2\2\u00d1\u00c0\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00c6\3\2"+
		"\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"-\3\2\2\2\u00d3\u00da\7\13\2\2\u00d4\u00da\7\f\2\2\u00d5\u00da\7\32\2"+
		"\2\u00d6\u00da\7\20\2\2\u00d7\u00da\7\21\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da/\3\2\2\2\u00db\u00dc"+
		"\5\n\6\2\u00dc\u00dd\7.\2\2\u00dd\u00de\7\5\2\2\u00de\u00df\5\64\33\2"+
		"\u00df\u00e0\7\6\2\2\u00e0\u00e1\5\b\5\2\u00e1\61\3\2\2\2\u00e2\u00e3"+
		"\5\n\6\2\u00e3\u00e4\7.\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5\64\33\2"+
		"\u00e6\u00e7\7\6\2\2\u00e7\63\3\2\2\2\u00e8\u00e9\5\n\6\2\u00e9\u00ea"+
		"\7.\2\2\u00ea\u00f2\3\2\2\2\u00eb\u00ec\5\n\6\2\u00ec\u00ed\7.\2\2\u00ed"+
		"\u00ee\7+\2\2\u00ee\u00ef\5\64\33\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\3"+
		"\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\65\3\2\2\2\u00f3\u00f4\7.\2\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6\58\35\2"+
		"\u00f6\u00f7\7\6\2\2\u00f7\67\3\2\2\2\u00f8\u00f9\5\22\n\2\u00f9\u00fa"+
		"\7+\2\2\u00fa\u00fb\58\35\2\u00fb\u00ff\3\2\2\2\u00fc\u00ff\5\22\n\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff9\3\2\2\2\u0100\u0101\7\'\2\2\u0101\u0102\7\5\2\2\u0102\u0103"+
		"\5\16\b\2\u0103\u0104\7,\2\2\u0104\u0105\5\22\n\2\u0105\u0106\7,\2\2\u0106"+
		"\u0107\5\22\n\2\u0107\u0108\7\6\2\2\u0108\u0109\5\6\4\2\u0109;\3\2\2\2"+
		"\u010a\u010b\7)\2\2\u010b\u010c\7\5\2\2\u010c\u010d\5\22\n\2\u010d\u010e"+
		"\7\6\2\2\u010e\u010f\5\b\5\2\u010f=\3\2\2\2\u0110\u0111\7(\2\2\u0111\u0112"+
		"\7\5\2\2\u0112\u0113\5\22\n\2\u0113\u0114\7\6\2\2\u0114\u0115\5\6\4\2"+
		"\u0115\u0127\3\2\2\2\u0116\u0117\7(\2\2\u0117\u0118\7\5\2\2\u0118\u0119"+
		"\5\22\n\2\u0119\u011a\7\6\2\2\u011a\u011b\5\b\5\2\u011b\u011c\7*\2\2\u011c"+
		"\u011d\5\b\5\2\u011d\u0127\3\2\2\2\u011e\u011f\7(\2\2\u011f\u0120\7\5"+
		"\2\2\u0120\u0121\5\22\n\2\u0121\u0122\7\6\2\2\u0122\u0123\5\6\4\2\u0123"+
		"\u0124\7*\2\2\u0124\u0125\5\6\4\2\u0125\u0127\3\2\2\2\u0126\u0110\3\2"+
		"\2\2\u0126\u0116\3\2\2\2\u0126\u011e\3\2\2\2\u0127?\3\2\2\2\u0128\u012b"+
		"\7-\2\2\u0129\u012c\5\22\n\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012cA\3\2\2\2\21I_py\u0083\u008d\u0097\u00a7\u00b9\u00d1"+
		"\u00d9\u00f1\u00fe\u0126\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}