// Generated from c:/antlr4/TP-Compiladores/tf.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class tfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, PC=33, ID=34, NUM=35, INT=36, FLOAT=37, STRING=38, NOMBRE=39, 
		COMMENTARIOS=40, COMMENTARIO=41, WS=42;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_declaracionCaja = 2, RULE_declaracionFuncion = 3, 
		RULE_retorno = 4, RULE_modificacionCaja = 5, RULE_parametro = 6, RULE_body = 7, 
		RULE_declaracionMientras = 8, RULE_exprBooleana = 9, RULE_expr = 10, RULE_exprNum = 11, 
		RULE_exprStr = 12, RULE_declaracionSiNo = 13, RULE_declaracionFor = 14, 
		RULE_tipo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "declaracionCaja", "declaracionFuncion", "retorno", 
			"modificacionCaja", "parametro", "body", "declaracionMientras", "exprBooleana", 
			"expr", "exprNum", "exprStr", "declaracionSiNo", "declaracionFor", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "','", "')'", "'{'", "'}'", "'retorno'", "'++'", 
			"'--'", "'+='", "'-='", "'mientras'", "'y'", "'o'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'si'", 
			"'sino'", "'recorrer'", "'entero'", "'decimal'", "'texto'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "PC", "ID", "NUM", 
			"INT", "FLOAT", "STRING", "NOMBRE", "COMMENTARIOS", "COMMENTARIO", "WS"
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
	public String getGrammarFileName() { return "tf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tfParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) {
				{
				{
				setState(32);
				stat();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public DeclaracionCajaContext declaracionCaja() {
			return getRuleContext(DeclaracionCajaContext.class,0);
		}
		public TerminalNode PC() { return getToken(tfParser.PC, 0); }
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declaracionCaja();
				setState(41);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				declaracionFuncion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionCajaContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(tfParser.ID, 0); }
		public ExprNumContext exprNum() {
			return getRuleContext(ExprNumContext.class,0);
		}
		public ExprStrContext exprStr() {
			return getRuleContext(ExprStrContext.class,0);
		}
		public DeclaracionCajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionCaja; }
	}

	public final DeclaracionCajaContext declaracionCaja() throws RecognitionException {
		DeclaracionCajaContext _localctx = new DeclaracionCajaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionCaja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			tipo();
			setState(47);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(48);
				match(T__0);
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(49);
					exprNum(0);
					}
					break;
				case 2:
					{
					setState(50);
					exprStr(0);
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(tfParser.ID, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public DeclaracionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion; }
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			tipo();
			setState(56);
			match(ID);
			setState(57);
			match(T__1);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) {
				{
				setState(58);
				parametro();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(59);
					match(T__2);
					setState(60);
					parametro();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(68);
			match(T__3);
			setState(69);
			match(T__4);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				body();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25367155456L) != 0) );
			setState(75);
			retorno();
			setState(76);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode PC() { return getToken(tfParser.PC, 0); }
		public ExprStrContext exprStr() {
			return getRuleContext(ExprStrContext.class,0);
		}
		public ExprNumContext exprNum() {
			return getRuleContext(ExprNumContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(79);
				exprStr(0);
				}
				break;
			case 2:
				{
				setState(80);
				exprNum(0);
				}
				break;
			}
			setState(83);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModificacionCajaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tfParser.ID, 0); }
		public ExprNumContext exprNum() {
			return getRuleContext(ExprNumContext.class,0);
		}
		public ExprStrContext exprStr() {
			return getRuleContext(ExprStrContext.class,0);
		}
		public ModificacionCajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificacionCaja; }
	}

	public final ModificacionCajaContext modificacionCaja() throws RecognitionException {
		ModificacionCajaContext _localctx = new ModificacionCajaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modificacionCaja);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(ID);
				setState(86);
				match(T__0);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(87);
					exprNum(0);
					}
					break;
				case 2:
					{
					setState(88);
					exprStr(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(ID);
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(ID);
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				exprNum(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public DeclaracionCajaContext declaracionCaja() {
			return getRuleContext(DeclaracionCajaContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			declaracionCaja();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public DeclaracionCajaContext declaracionCaja() {
			return getRuleContext(DeclaracionCajaContext.class,0);
		}
		public TerminalNode PC() { return getToken(tfParser.PC, 0); }
		public DeclaracionSiNoContext declaracionSiNo() {
			return getRuleContext(DeclaracionSiNoContext.class,0);
		}
		public DeclaracionForContext declaracionFor() {
			return getRuleContext(DeclaracionForContext.class,0);
		}
		public DeclaracionMientrasContext declaracionMientras() {
			return getRuleContext(DeclaracionMientrasContext.class,0);
		}
		public ModificacionCajaContext modificacionCaja() {
			return getRuleContext(ModificacionCajaContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				declaracionCaja();
				setState(103);
				match(PC);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				declaracionSiNo();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				declaracionFor();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				declaracionMientras();
				}
				break;
			case T__7:
			case T__8:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				modificacionCaja();
				setState(109);
				match(PC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionMientrasContext extends ParserRuleContext {
		public ExprBooleanaContext exprBooleana() {
			return getRuleContext(ExprBooleanaContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public DeclaracionMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionMientras; }
	}

	public final DeclaracionMientrasContext declaracionMientras() throws RecognitionException {
		DeclaracionMientrasContext _localctx = new DeclaracionMientrasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracionMientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__11);
			setState(114);
			match(T__1);
			setState(115);
			exprBooleana(0);
			setState(116);
			match(T__3);
			setState(117);
			match(T__4);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				body();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25367155456L) != 0) );
			setState(123);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprBooleanaContext> exprBooleana() {
			return getRuleContexts(ExprBooleanaContext.class);
		}
		public ExprBooleanaContext exprBooleana(int i) {
			return getRuleContext(ExprBooleanaContext.class,i);
		}
		public ExprBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBooleana; }
	}

	public final ExprBooleanaContext exprBooleana() throws RecognitionException {
		return exprBooleana(0);
	}

	private ExprBooleanaContext exprBooleana(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprBooleanaContext _localctx = new ExprBooleanaContext(_ctx, _parentState);
		ExprBooleanaContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exprBooleana, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(126);
				expr();
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				expr();
				}
				break;
			case 2:
				{
				setState(130);
				expr();
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				expr();
				}
				break;
			case 3:
				{
				setState(134);
				expr();
				setState(135);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
				expr();
				}
				break;
			case 4:
				{
				setState(138);
				expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBooleanaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprBooleana);
					setState(141);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(142);
					_la = _input.LA(1);
					if ( !(_la==T__12 || _la==T__13) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(143);
					exprBooleana(6);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprStrContext exprStr() {
			return getRuleContext(ExprStrContext.class,0);
		}
		public ExprNumContext exprNum() {
			return getRuleContext(ExprNumContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				exprStr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				exprNum(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumContext extends ParserRuleContext {
		public List<ExprNumContext> exprNum() {
			return getRuleContexts(ExprNumContext.class);
		}
		public ExprNumContext exprNum(int i) {
			return getRuleContext(ExprNumContext.class,i);
		}
		public TerminalNode NUM() { return getToken(tfParser.NUM, 0); }
		public TerminalNode ID() { return getToken(tfParser.ID, 0); }
		public ExprNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNum; }
	}

	public final ExprNumContext exprNum() throws RecognitionException {
		return exprNum(0);
	}

	private ExprNumContext exprNum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprNumContext _localctx = new ExprNumContext(_ctx, _parentState);
		ExprNumContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exprNum, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(154);
				match(T__1);
				setState(155);
				exprNum(0);
				setState(156);
				match(T__3);
				}
				break;
			case NUM:
				{
				setState(158);
				match(NUM);
				}
				break;
			case ID:
				{
				setState(159);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprNumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprNum);
						setState(162);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(163);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(164);
						exprNum(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprNumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprNum);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						exprNum(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprNumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprNum);
						setState(168);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(169);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						exprNum(4);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(tfParser.STRING, 0); }
		public TerminalNode ID() { return getToken(tfParser.ID, 0); }
		public List<ExprStrContext> exprStr() {
			return getRuleContexts(ExprStrContext.class);
		}
		public ExprStrContext exprStr(int i) {
			return getRuleContext(ExprStrContext.class,i);
		}
		public ExprStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStr; }
	}

	public final ExprStrContext exprStr() throws RecognitionException {
		return exprStr(0);
	}

	private ExprStrContext exprStr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprStrContext _localctx = new ExprStrContext(_ctx, _parentState);
		ExprStrContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exprStr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(177);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(178);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprStrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprStr);
					setState(181);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(182);
					match(T__20);
					setState(183);
					exprStr(4);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionSiNoContext extends ParserRuleContext {
		public ExprBooleanaContext exprBooleana() {
			return getRuleContext(ExprBooleanaContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public DeclaracionSiNoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionSiNo; }
	}

	public final DeclaracionSiNoContext declaracionSiNo() throws RecognitionException {
		DeclaracionSiNoContext _localctx = new DeclaracionSiNoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracionSiNo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__26);
			setState(190);
			match(T__1);
			setState(191);
			exprBooleana(0);
			setState(192);
			match(T__3);
			setState(193);
			match(T__4);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				body();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25367155456L) != 0) );
			setState(199);
			match(T__5);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(200);
				match(T__27);
				setState(201);
				match(T__4);
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					body();
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25367155456L) != 0) );
				setState(207);
				match(T__5);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionForContext extends ParserRuleContext {
		public DeclaracionCajaContext declaracionCaja() {
			return getRuleContext(DeclaracionCajaContext.class,0);
		}
		public List<TerminalNode> PC() { return getTokens(tfParser.PC); }
		public TerminalNode PC(int i) {
			return getToken(tfParser.PC, i);
		}
		public ExprBooleanaContext exprBooleana() {
			return getRuleContext(ExprBooleanaContext.class,0);
		}
		public ModificacionCajaContext modificacionCaja() {
			return getRuleContext(ModificacionCajaContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public DeclaracionForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFor; }
	}

	public final DeclaracionForContext declaracionFor() throws RecognitionException {
		DeclaracionForContext _localctx = new DeclaracionForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracionFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__28);
			setState(212);
			match(T__1);
			setState(213);
			declaracionCaja();
			setState(214);
			match(PC);
			setState(215);
			exprBooleana(0);
			setState(216);
			match(PC);
			setState(217);
			modificacionCaja();
			setState(218);
			match(T__3);
			setState(219);
			match(T__4);
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				body();
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25367155456L) != 0) );
			setState(225);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exprBooleana_sempred((ExprBooleanaContext)_localctx, predIndex);
		case 11:
			return exprNum_sempred((ExprNumContext)_localctx, predIndex);
		case 12:
			return exprStr_sempred((ExprStrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprBooleana_sempred(ExprBooleanaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean exprNum_sempred(ExprNumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprStr_sempred(ExprStrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00024\b\u0002\u0003\u00026\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003>\b\u0003\n\u0003"+
		"\f\u0003A\t\u0003\u0003\u0003C\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003H\b\u0003\u000b\u0003\f\u0003I\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004R\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005Z\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005c\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007p\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\bx\b\b\u000b\b\f\by\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008c\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0091\b\t\n\t\f\t\u0094\t\t\u0001\n\u0001\n"+
		"\u0003\n\u0098\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a1\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00ac\b\u000b\n\u000b\f\u000b\u00af\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00b4\b\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00b9\b\f\n\f\f\f\u00bc\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0004\r\u00c4\b\r\u000b\r\f\r\u00c5\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u00cc\b\r\u000b\r\f\r\u00cd\u0001\r\u0001\r\u0003\r\u00d2\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00de\b\u000e"+
		"\u000b\u000e\f\u000e\u00df\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0003\u0012\u0016\u0018\u0010\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\n\u0001"+
		"\u0000\b\t\u0001\u0000\n\u000b\u0001\u0000\u000f\u0010\u0001\u0000\u0011"+
		"\u0012\u0001\u0000\u0013\u0014\u0001\u0000\r\u000e\u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001a\u0001\u0000\u001e \u00f6"+
		"\u0000#\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004."+
		"\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\bN\u0001\u0000"+
		"\u0000\u0000\nb\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000e"+
		"o\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012\u008b\u0001"+
		"\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000\u0000\u0016\u00a0\u0001"+
		"\u0000\u0000\u0000\u0018\u00b3\u0001\u0000\u0000\u0000\u001a\u00bd\u0001"+
		"\u0000\u0000\u0000\u001c\u00d3\u0001\u0000\u0000\u0000\u001e\u00e3\u0001"+
		"\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000"+
		"\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\u0000"+
		"\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000()\u0003\u0004\u0002\u0000"+
		")*\u0005!\u0000\u0000*-\u0001\u0000\u0000\u0000+-\u0003\u0006\u0003\u0000"+
		",(\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0003\u0001\u0000"+
		"\u0000\u0000./\u0003\u001e\u000f\u0000/5\u0005\"\u0000\u000003\u0005\u0001"+
		"\u0000\u000014\u0003\u0016\u000b\u000024\u0003\u0018\f\u000031\u0001\u0000"+
		"\u0000\u000032\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000050\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000"+
		"\u000078\u0003\u001e\u000f\u000089\u0005\"\u0000\u00009B\u0005\u0002\u0000"+
		"\u0000:?\u0003\f\u0006\u0000;<\u0005\u0003\u0000\u0000<>\u0003\f\u0006"+
		"\u0000=;\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000B:\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0005\u0004\u0000\u0000EG\u0005\u0005\u0000"+
		"\u0000FH\u0003\u000e\u0007\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KL\u0003\b\u0004\u0000LM\u0005\u0006\u0000\u0000M\u0007"+
		"\u0001\u0000\u0000\u0000NQ\u0005\u0007\u0000\u0000OR\u0003\u0018\f\u0000"+
		"PR\u0003\u0016\u000b\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0005!\u0000\u0000T\t\u0001\u0000\u0000"+
		"\u0000UV\u0005\"\u0000\u0000VY\u0005\u0001\u0000\u0000WZ\u0003\u0016\u000b"+
		"\u0000XZ\u0003\u0018\f\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Zc\u0001\u0000\u0000\u0000[\\\u0005\"\u0000\u0000\\c\u0007\u0000"+
		"\u0000\u0000]^\u0007\u0000\u0000\u0000^c\u0005\"\u0000\u0000_`\u0005\""+
		"\u0000\u0000`a\u0007\u0001\u0000\u0000ac\u0003\u0016\u000b\u0000bU\u0001"+
		"\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000"+
		"b_\u0001\u0000\u0000\u0000c\u000b\u0001\u0000\u0000\u0000de\u0003\u0004"+
		"\u0002\u0000e\r\u0001\u0000\u0000\u0000fg\u0003\u0004\u0002\u0000gh\u0005"+
		"!\u0000\u0000hp\u0001\u0000\u0000\u0000ip\u0003\u001a\r\u0000jp\u0003"+
		"\u001c\u000e\u0000kp\u0003\u0010\b\u0000lm\u0003\n\u0005\u0000mn\u0005"+
		"!\u0000\u0000np\u0001\u0000\u0000\u0000of\u0001\u0000\u0000\u0000oi\u0001"+
		"\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000"+
		"ol\u0001\u0000\u0000\u0000p\u000f\u0001\u0000\u0000\u0000qr\u0005\f\u0000"+
		"\u0000rs\u0005\u0002\u0000\u0000st\u0003\u0012\t\u0000tu\u0005\u0004\u0000"+
		"\u0000uw\u0005\u0005\u0000\u0000vx\u0003\u000e\u0007\u0000wv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u0006\u0000\u0000"+
		"|\u0011\u0001\u0000\u0000\u0000}~\u0006\t\uffff\uffff\u0000~\u007f\u0003"+
		"\u0014\n\u0000\u007f\u0080\u0007\u0002\u0000\u0000\u0080\u0081\u0003\u0014"+
		"\n\u0000\u0081\u008c\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0014\n"+
		"\u0000\u0083\u0084\u0007\u0003\u0000\u0000\u0084\u0085\u0003\u0014\n\u0000"+
		"\u0085\u008c\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0014\n\u0000\u0087"+
		"\u0088\u0007\u0004\u0000\u0000\u0088\u0089\u0003\u0014\n\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0014\n\u0000\u008b}\u0001"+
		"\u0000\u0000\u0000\u008b\u0082\u0001\u0000\u0000\u0000\u008b\u0086\u0001"+
		"\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0092\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\n\u0005\u0000\u0000\u008e\u008f\u0007\u0005"+
		"\u0000\u0000\u008f\u0091\u0003\u0012\t\u0006\u0090\u008d\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0013\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0003\u0018\f\u0000"+
		"\u0096\u0098\u0003\u0016\u000b\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0006\u000b\uffff\uffff\u0000\u009a\u009b\u0005\u0002\u0000"+
		"\u0000\u009b\u009c\u0003\u0016\u000b\u0000\u009c\u009d\u0005\u0004\u0000"+
		"\u0000\u009d\u00a1\u0001\u0000\u0000\u0000\u009e\u00a1\u0005#\u0000\u0000"+
		"\u009f\u00a1\u0005\"\u0000\u0000\u00a0\u0099\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00ad\u0001\u0000\u0000\u0000\u00a2\u00a3\n\u0005\u0000\u0000\u00a3\u00a4"+
		"\u0007\u0006\u0000\u0000\u00a4\u00ac\u0003\u0016\u000b\u0006\u00a5\u00a6"+
		"\n\u0004\u0000\u0000\u00a6\u00a7\u0007\u0007\u0000\u0000\u00a7\u00ac\u0003"+
		"\u0016\u000b\u0005\u00a8\u00a9\n\u0003\u0000\u0000\u00a9\u00aa\u0007\b"+
		"\u0000\u0000\u00aa\u00ac\u0003\u0016\u000b\u0004\u00ab\u00a2\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u0017\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0006\f\uffff"+
		"\uffff\u0000\u00b1\u00b4\u0005&\u0000\u0000\u00b2\u00b4\u0005\"\u0000"+
		"\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00ba\u0001\u0000\u0000\u0000\u00b5\u00b6\n\u0003\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0015\u0000\u0000\u00b7\u00b9\u0003\u0018\f\u0004\u00b8"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u0019\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u001b\u0000\u0000\u00be\u00bf\u0005\u0002\u0000\u0000\u00bf"+
		"\u00c0\u0003\u0012\t\u0000\u00c0\u00c1\u0005\u0004\u0000\u0000\u00c1\u00c3"+
		"\u0005\u0005\u0000\u0000\u00c2\u00c4\u0003\u000e\u0007\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00d1\u0005\u0006\u0000\u0000\u00c8\u00c9"+
		"\u0005\u001c\u0000\u0000\u00c9\u00cb\u0005\u0005\u0000\u0000\u00ca\u00cc"+
		"\u0003\u000e\u0007\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0005\u0006\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c8"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u001b"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u001d\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0002\u0000\u0000\u00d5\u00d6\u0003\u0004\u0002\u0000\u00d6\u00d7"+
		"\u0005!\u0000\u0000\u00d7\u00d8\u0003\u0012\t\u0000\u00d8\u00d9\u0005"+
		"!\u0000\u0000\u00d9\u00da\u0003\n\u0005\u0000\u00da\u00db\u0005\u0004"+
		"\u0000\u0000\u00db\u00dd\u0005\u0005\u0000\u0000\u00dc\u00de\u0003\u000e"+
		"\u0007\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0006"+
		"\u0000\u0000\u00e2\u001d\u0001\u0000\u0000\u0000\u00e3\u00e4\u0007\t\u0000"+
		"\u0000\u00e4\u001f\u0001\u0000\u0000\u0000\u0018#,35?BIQYboy\u008b\u0092"+
		"\u0097\u00a0\u00ab\u00ad\u00b3\u00ba\u00c5\u00cd\u00d1\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}