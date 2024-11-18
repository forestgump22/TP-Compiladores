// Generated from c:/antlr4/TP-Compiladores/tp/tpCompiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class tpCompiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, COMMENT_SINGLE=48, COMMENT_MULTI=49, ID=50, NUM=51, 
		STRING=52, WS=53;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_ternaCall = 2, RULE_declaration = 3, 
		RULE_assignment = 4, RULE_expr = 5, RULE_operMathExpr = 6, RULE_operAndOr = 7, 
		RULE_operMathIndiv = 8, RULE_operMathIndivFor = 9, RULE_operCompExpr = 10, 
		RULE_ifStatement = 11, RULE_ternarioOper = 12, RULE_forStatement = 13, 
		RULE_forInit = 14, RULE_forInterme = 15, RULE_forUpdate = 16, RULE_whileStatement = 17, 
		RULE_funcDeclaration = 18, RULE_funCall = 19, RULE_parameterList = 20, 
		RULE_parameterListCallFun = 21, RULE_ioStatement = 22, RULE_block = 23, 
		RULE_type = 24, RULE_solos = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "ternaCall", "declaration", "assignment", "expr", 
			"operMathExpr", "operAndOr", "operMathIndiv", "operMathIndivFor", "operCompExpr", 
			"ifStatement", "ternarioOper", "forStatement", "forInit", "forInterme", 
			"forUpdate", "whileStatement", "funcDeclaration", "funCall", "parameterList", 
			"parameterListCallFun", "ioStatement", "block", "type", "solos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'return'", "'='", "','", "'+='", "'-='", "'('", "')'", 
			"'*'", "'/'", "'^'", "'%'", "'+'", "'-'", "'=='", "'>='", "'<='", "'>'", 
			"'<'", "'&&'", "'||'", "'and'", "'or'", "'&'", "'|'", "'++'", "'--'", 
			"'!='", "'if'", "'else'", "'?'", "':'", "'for'", "'while'", "'cin'", 
			"'>>'", "'mostrar'", "'<<'", "'{'", "'}'", "'entero'", "'float'", "'double'", 
			"'char'", "'bool'", "'void'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"COMMENT_SINGLE", "COMMENT_MULTI", "ID", "NUM", "STRING", "WS"
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
	public String getGrammarFileName() { return "tpCompiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tpCompiladoresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tpCompiladoresParser.EOF, 0); }
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3657173980676228L) != 0)) {
				{
				{
				setState(52);
				stat();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TernarioOperContext ternarioOper() {
			return getRuleContext(TernarioOperContext.class,0);
		}
		public IoStatementContext ioStatement() {
			return getRuleContext(IoStatementContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				declaration();
				setState(61);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				assignment();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(64);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				funcDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				expr();
				setState(72);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				ternarioOper();
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(75);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				ioStatement();
				setState(79);
				match(T__0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(81);
				match(T__1);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3377699921854592L) != 0)) {
					{
					setState(82);
					expr();
					}
				}

				setState(85);
				match(T__0);
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
	public static class TernaCallContext extends ParserRuleContext {
		public IoStatementContext ioStatement() {
			return getRuleContext(IoStatementContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public TernaCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaCall; }
	}

	public final TernaCallContext ternaCall() throws RecognitionException {
		TernaCallContext _localctx = new TernaCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ternaCall);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				ioStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				funCall();
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
	public static class DeclarationContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(tpCompiladoresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tpCompiladoresParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TernarioOperContext ternarioOper() {
			return getRuleContext(TernarioOperContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			type();
			setState(93);
			((DeclarationContext)_localctx).ID = match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(94);
				match(T__2);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(95);
					((DeclarationContext)_localctx).expr = expr();
					}
					break;
				case 2:
					{
					setState(96);
					ternarioOper();
					}
					break;
				}
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(101);
				match(T__3);
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(102);
					assignment();
					}
					break;
				case 2:
					{
					setState(103);
					((DeclarationContext)_localctx).ID = match(ID);
					}
					break;
				}
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if (((DeclarationContext)_localctx).expr.v != 0) {
			            memory[((DeclarationContext)_localctx).ID->getText()] = ((DeclarationContext)_localctx).expr.v;  // Almacenamos la variable 
			        } else {
			            memory[((DeclarationContext)_localctx).ID->getText()] = 0;  // Valor por defecto es 0
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
	public static class AssignmentContext extends ParserRuleContext {
		public Token ID;
		public Token op;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(tpCompiladoresParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TernarioOperContext ternarioOper() {
			return getRuleContext(TernarioOperContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(114);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 104L) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				((AssignmentContext)_localctx).expr = expr();

				        std::string var = ((AssignmentContext)_localctx).ID->getText();
				        if (memory.find(var) != memory.end()) {
				            if ((((AssignmentContext)_localctx).op!=null?((AssignmentContext)_localctx).op.getText():null) == "="){
				                memory[var] = ((AssignmentContext)_localctx).expr.v;
				            } else if ((((AssignmentContext)_localctx).op!=null?((AssignmentContext)_localctx).op.getText():null) == "+="){
				                memory[var] += ((AssignmentContext)_localctx).expr.v;
				            } else if ((((AssignmentContext)_localctx).op!=null?((AssignmentContext)_localctx).op.getText():null) == "-="){
				                memory[var] -= ((AssignmentContext)_localctx).expr.v;
				            }
				        } else {
				            std::cerr << "Variable " << var << " no esta declarada.\n";
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(119);
				match(T__2);
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(120);
					ternarioOper();
					}
					break;
				}

				        std::string var = ((AssignmentContext)_localctx).ID->getText();
				        if (memory.find(var) != memory.end()) {
				            // Manejo de operadores ternarios
				        } else {
				            std::cerr << "Variable" << var << " no esta declarada.\n";
				        }
				    
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
	public static class ExprContext extends ParserRuleContext {
		public double v;
		public ExprContext e;
		public OperMathExprContext operMathExpr;
		public OperCompExprContext operCompExpr;
		public OperAndOrContext operAndOr;
		public FunCallContext funCall;
		public SolosContext solos;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperMathExprContext operMathExpr() {
			return getRuleContext(OperMathExprContext.class,0);
		}
		public OperCompExprContext operCompExpr() {
			return getRuleContext(OperCompExprContext.class,0);
		}
		public OperAndOrContext operAndOr() {
			return getRuleContext(OperAndOrContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public SolosContext solos() {
			return getRuleContext(SolosContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__6);
				setState(127);
				((ExprContext)_localctx).e = expr();
				setState(128);
				match(T__7);
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).e.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((ExprContext)_localctx).operMathExpr = operMathExpr(0);
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).operMathExpr.v;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				((ExprContext)_localctx).operCompExpr = operCompExpr();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).operCompExpr.v;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				((ExprContext)_localctx).operAndOr = operAndOr(0);
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).operAndOr.v;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				((ExprContext)_localctx).funCall = funCall();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).funCall.v;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				((ExprContext)_localctx).solos = solos();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).solos.v;
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
	public static class OperMathExprContext extends ParserRuleContext {
		public double v;
		public OperMathExprContext a;
		public OperMathExprContext e;
		public OperMathIndivContext operMathIndiv;
		public FunCallContext funCall;
		public Token NUM;
		public Token ID;
		public Token op;
		public OperMathExprContext b;
		public List<OperMathExprContext> operMathExpr() {
			return getRuleContexts(OperMathExprContext.class);
		}
		public OperMathExprContext operMathExpr(int i) {
			return getRuleContext(OperMathExprContext.class,i);
		}
		public OperMathIndivContext operMathIndiv() {
			return getRuleContext(OperMathIndivContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public TerminalNode NUM() { return getToken(tpCompiladoresParser.NUM, 0); }
		public TerminalNode ID() { return getToken(tpCompiladoresParser.ID, 0); }
		public OperMathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operMathExpr; }
	}

	public final OperMathExprContext operMathExpr() throws RecognitionException {
		return operMathExpr(0);
	}

	private OperMathExprContext operMathExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperMathExprContext _localctx = new OperMathExprContext(_ctx, _parentState);
		OperMathExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operMathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(149);
				match(T__6);
				setState(150);
				((OperMathExprContext)_localctx).e = operMathExpr(0);
				setState(151);
				match(T__7);
				((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).e.v;
				}
				break;
			case 2:
				{
				setState(154);
				((OperMathExprContext)_localctx).operMathIndiv = operMathIndiv();
				((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).operMathIndiv.v;
				}
				break;
			case 3:
				{
				setState(157);
				((OperMathExprContext)_localctx).funCall = funCall();
				((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).funCall.v;
				}
				break;
			case 4:
				{
				setState(160);
				((OperMathExprContext)_localctx).NUM = match(NUM);
				((OperMathExprContext)_localctx).v =  std::stod(((OperMathExprContext)_localctx).NUM->getText());
				}
				break;
			case 5:
				{
				setState(162);
				((OperMathExprContext)_localctx).ID = match(ID);

				        std::string var = ((OperMathExprContext)_localctx).ID->getText();
				        if (memory.find(var) != memory.end()){
				            ((OperMathExprContext)_localctx).v =  memory[var];
				            std::cerr << "Variable " << var << " esta declarada es ->" << memory[var] << ".\n";
				        } else {
				            std::cerr << "Variable " << var << " no esta declarada.\n";
				            ((OperMathExprContext)_localctx).v =  0;
				        }
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new OperMathExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operMathExpr);
						setState(166);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(167);
						((OperMathExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0)) ) {
							((OperMathExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(168);
						((OperMathExprContext)_localctx).b = operMathExpr(9);

						                  if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "*")      ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v * ((OperMathExprContext)_localctx).b.v;
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "/") ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v / ((OperMathExprContext)_localctx).b.v;
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "^") ((OperMathExprContext)_localctx).v =  std::pow(((OperMathExprContext)_localctx).a.v, ((OperMathExprContext)_localctx).b.v);
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "%") ((OperMathExprContext)_localctx).v =  std::fmod(((OperMathExprContext)_localctx).a.v, ((OperMathExprContext)_localctx).b.v);
						              
						}
						break;
					case 2:
						{
						_localctx = new OperMathExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operMathExpr);
						setState(171);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(172);
						((OperMathExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
							((OperMathExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						((OperMathExprContext)_localctx).b = operMathExpr(8);

						                  if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "+")      ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v + ((OperMathExprContext)_localctx).b.v;
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "-") ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v - ((OperMathExprContext)_localctx).b.v;
						              
						}
						break;
					case 3:
						{
						_localctx = new OperMathExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operMathExpr);
						setState(176);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(177);
						((OperMathExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0)) ) {
							((OperMathExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						((OperMathExprContext)_localctx).b = operMathExpr(7);

						                  if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "==")      ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v == ((OperMathExprContext)_localctx).b.v;
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == ">=") ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v >= ((OperMathExprContext)_localctx).b.v;
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "<=") ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v <= ((OperMathExprContext)_localctx).b.v;
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == ">")  ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v > ((OperMathExprContext)_localctx).b.v;
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "<")  ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v < ((OperMathExprContext)_localctx).b.v;
						              
						}
						break;
					case 4:
						{
						_localctx = new OperMathExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operMathExpr);
						setState(181);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(182);
						((OperMathExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
							((OperMathExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						((OperMathExprContext)_localctx).b = operMathExpr(6);

						                  if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "&&" || (((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "and" ) { ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v && ((OperMathExprContext)_localctx).b.v; }
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "||" || (((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "or") { ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v || ((OperMathExprContext)_localctx).b.v; }
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "&") { ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v && ((OperMathExprContext)_localctx).b.v; }
						                  else if ((((OperMathExprContext)_localctx).op!=null?((OperMathExprContext)_localctx).op.getText():null) == "|") { ((OperMathExprContext)_localctx).v =  ((OperMathExprContext)_localctx).a.v || ((OperMathExprContext)_localctx).b.v; }
						              
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class OperAndOrContext extends ParserRuleContext {
		public double v;
		public OperAndOrContext a;
		public OperAndOrContext operAndOr;
		public OperCompExprContext operCompExpr;
		public SolosContext solos;
		public Token op;
		public OperAndOrContext b;
		public List<OperAndOrContext> operAndOr() {
			return getRuleContexts(OperAndOrContext.class);
		}
		public OperAndOrContext operAndOr(int i) {
			return getRuleContext(OperAndOrContext.class,i);
		}
		public OperCompExprContext operCompExpr() {
			return getRuleContext(OperCompExprContext.class,0);
		}
		public SolosContext solos() {
			return getRuleContext(SolosContext.class,0);
		}
		public OperAndOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operAndOr; }
	}

	public final OperAndOrContext operAndOr() throws RecognitionException {
		return operAndOr(0);
	}

	private OperAndOrContext operAndOr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperAndOrContext _localctx = new OperAndOrContext(_ctx, _parentState);
		OperAndOrContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_operAndOr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(192);
				match(T__6);
				setState(193);
				((OperAndOrContext)_localctx).operAndOr = operAndOr(0);
				setState(194);
				match(T__7);
				((OperAndOrContext)_localctx).v =  ((OperAndOrContext)_localctx).operAndOr.v;
				}
				break;
			case 2:
				{
				setState(197);
				((OperAndOrContext)_localctx).operCompExpr = operCompExpr();
				((OperAndOrContext)_localctx).v =  ((OperAndOrContext)_localctx).operCompExpr.v;
				}
				break;
			case 3:
				{
				setState(200);
				((OperAndOrContext)_localctx).solos = solos();
				((OperAndOrContext)_localctx).v =  ((OperAndOrContext)_localctx).solos.v;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperAndOrContext(_parentctx, _parentState);
					_localctx.a = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_operAndOr);
					setState(205);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(206);
					((OperAndOrContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
						((OperAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(207);
					((OperAndOrContext)_localctx).b = ((OperAndOrContext)_localctx).operAndOr = operAndOr(5);

					                  if ((((OperAndOrContext)_localctx).op!=null?((OperAndOrContext)_localctx).op.getText():null) == "&&" || (((OperAndOrContext)_localctx).op!=null?((OperAndOrContext)_localctx).op.getText():null) == "and" ) { ((OperAndOrContext)_localctx).v =  ((OperAndOrContext)_localctx).a.v && ((OperAndOrContext)_localctx).b.v; }
					                  else if ((((OperAndOrContext)_localctx).op!=null?((OperAndOrContext)_localctx).op.getText():null) == "||" || (((OperAndOrContext)_localctx).op!=null?((OperAndOrContext)_localctx).op.getText():null) == "or") { ((OperAndOrContext)_localctx).v =  ((OperAndOrContext)_localctx).a.v || ((OperAndOrContext)_localctx).b.v; }
					                  else if ((((OperAndOrContext)_localctx).op!=null?((OperAndOrContext)_localctx).op.getText():null) == "&") { ((OperAndOrContext)_localctx).v =  ((OperAndOrContext)_localctx).a.v && ((OperAndOrContext)_localctx).b.v; }
					                  else if ((((OperAndOrContext)_localctx).op!=null?((OperAndOrContext)_localctx).op.getText():null) == "|") { ((OperAndOrContext)_localctx).v =  ((OperAndOrContext)_localctx).a.v || ((OperAndOrContext)_localctx).b.v; }
					              
					}
					} 
				}
				setState(214);
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
	public static class OperMathIndivContext extends ParserRuleContext {
		public double v;
		public Token ID;
		public Token op;
		public TerminalNode ID() { return getToken(tpCompiladoresParser.ID, 0); }
		public OperMathIndivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operMathIndiv; }
	}

	public final OperMathIndivContext operMathIndiv() throws RecognitionException {
		OperMathIndivContext _localctx = new OperMathIndivContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operMathIndiv);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((OperMathIndivContext)_localctx).ID = match(ID);
				setState(216);
				((OperMathIndivContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
					((OperMathIndivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        std::string var = ((OperMathIndivContext)_localctx).ID->getText();
				        if (memory.find(var) != memory.end()){
				            ((OperMathIndivContext)_localctx).v =  memory[var];
				            std::cerr << "Variable " << var << " esta declarada es ->" << memory[var] << ".\n";
				            if ((((OperMathIndivContext)_localctx).op!=null?((OperMathIndivContext)_localctx).op.getText():null) == "++")     { memory[var]++; }
				            else if ((((OperMathIndivContext)_localctx).op!=null?((OperMathIndivContext)_localctx).op.getText():null) == "--"){ memory[var]--; }
				        } else {
				            std::cerr << "Variable " << var << " no esta declarada.\n";
				            ((OperMathIndivContext)_localctx).v =  0;
				        }
				    
				}
				break;
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				((OperMathIndivContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
					((OperMathIndivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				((OperMathIndivContext)_localctx).ID = match(ID);

				        std::string var = ((OperMathIndivContext)_localctx).ID->getText();
				        if (memory.find(var) != memory.end()){
				            std::cerr << "Variable " << var << " esta declarada es ->" << memory[var] << ".\n";
				            if ((((OperMathIndivContext)_localctx).op!=null?((OperMathIndivContext)_localctx).op.getText():null) == "++")     { memory[var]++; }
				            else if ((((OperMathIndivContext)_localctx).op!=null?((OperMathIndivContext)_localctx).op.getText():null) == "--"){ memory[var]--; }
				            ((OperMathIndivContext)_localctx).v =  memory[var];
				        } else {
				            std::cerr << "Variable " << var << " no esta declarada.\n";
				            ((OperMathIndivContext)_localctx).v =  0;
				        }
				        
				    
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
	public static class OperMathIndivForContext extends ParserRuleContext {
		public Token ID;
		public OperMathExprContext b;
		public OperMathIndivContext operMathIndiv() {
			return getRuleContext(OperMathIndivContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(tpCompiladoresParser.ID, 0); }
		public OperMathExprContext operMathExpr() {
			return getRuleContext(OperMathExprContext.class,0);
		}
		public OperMathIndivForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operMathIndivFor; }
	}

	public final OperMathIndivForContext operMathIndivFor() throws RecognitionException {
		OperMathIndivForContext _localctx = new OperMathIndivForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operMathIndivFor);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				operMathIndiv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				((OperMathIndivForContext)_localctx).ID = match(ID);
				{
				setState(226);
				match(T__2);
				}
				setState(227);
				((OperMathIndivForContext)_localctx).b = operMathExpr(0);

				        std::string var = ((OperMathIndivForContext)_localctx).ID->getText();
				        if (memory.find(var) != memory.end()) {
				            memory[var] = ((OperMathIndivForContext)_localctx).b.v;
				            std::cerr << "Variable " << memory[var] << " esta declarada.\n";
				        } else {
				            std::cerr << "Variable " << var << " no esta declarada.\n";
				        }
				    
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
	public static class OperCompExprContext extends ParserRuleContext {
		public bool v;
		public SolosContext solos;
		public Token op;
		public OperMathExprContext operMathExpr;
		public SolosContext solos() {
			return getRuleContext(SolosContext.class,0);
		}
		public OperMathExprContext operMathExpr() {
			return getRuleContext(OperMathExprContext.class,0);
		}
		public OperCompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operCompExpr; }
	}

	public final OperCompExprContext operCompExpr() throws RecognitionException {
		OperCompExprContext _localctx = new OperCompExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operCompExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((OperCompExprContext)_localctx).solos = solos();
			setState(233);
			((OperCompExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 269451264L) != 0)) ) {
				((OperCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
			((OperCompExprContext)_localctx).operMathExpr = operMathExpr(0);

			        if ((((OperCompExprContext)_localctx).op!=null?((OperCompExprContext)_localctx).op.getText():null) == "<"){
			            ((OperCompExprContext)_localctx).v =  ((OperCompExprContext)_localctx).solos.v < ((OperCompExprContext)_localctx).operMathExpr.v;
			        } else if ((((OperCompExprContext)_localctx).op!=null?((OperCompExprContext)_localctx).op.getText():null) == ">"){
			            ((OperCompExprContext)_localctx).v =  ((OperCompExprContext)_localctx).solos.v > ((OperCompExprContext)_localctx).operMathExpr.v;
			        } else if ((((OperCompExprContext)_localctx).op!=null?((OperCompExprContext)_localctx).op.getText():null) == "=="){
			            ((OperCompExprContext)_localctx).v =  ((OperCompExprContext)_localctx).solos.v == ((OperCompExprContext)_localctx).operMathExpr.v;
			        } else if ((((OperCompExprContext)_localctx).op!=null?((OperCompExprContext)_localctx).op.getText():null) == "!="){
			            ((OperCompExprContext)_localctx).v =  ((OperCompExprContext)_localctx).solos.v != ((OperCompExprContext)_localctx).operMathExpr.v;
			        } else if ((((OperCompExprContext)_localctx).op!=null?((OperCompExprContext)_localctx).op.getText():null) == ">="){
			            ((OperCompExprContext)_localctx).v =  ((OperCompExprContext)_localctx).solos.v >= ((OperCompExprContext)_localctx).operMathExpr.v;
			        } else if ((((OperCompExprContext)_localctx).op!=null?((OperCompExprContext)_localctx).op.getText():null) == "<="){
			            ((OperCompExprContext)_localctx).v =  ((OperCompExprContext)_localctx).solos.v <= ((OperCompExprContext)_localctx).operMathExpr.v;
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
	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__28);
			setState(238);
			match(T__6);
			setState(239);
			expr();
			setState(240);
			match(T__7);
			setState(241);
			block();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(242);
				match(T__29);
				setState(243);
				block();
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
	public static class TernarioOperContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TernaCallContext ternaCall() {
			return getRuleContext(TernaCallContext.class,0);
		}
		public TernarioOperContext ternarioOper() {
			return getRuleContext(TernarioOperContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TernarioOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternarioOper; }
	}

	public final TernarioOperContext ternarioOper() throws RecognitionException {
		TernarioOperContext _localctx = new TernarioOperContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ternarioOper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__6);
			setState(247);
			expr();
			setState(248);
			match(T__7);
			setState(249);
			match(T__30);
			setState(250);
			ternaCall();
			setState(251);
			match(T__31);
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(252);
				ternarioOper();
				}
				break;
			case 2:
				{
				setState(253);
				stat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForIntermeContext forInterme() {
			return getRuleContext(ForIntermeContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__32);
			setState(257);
			match(T__6);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1405175860297728L) != 0)) {
				{
				setState(258);
				forInit();
				}
			}

			setState(261);
			match(T__0);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUM) {
				{
				setState(262);
				forInterme();
				}
			}

			setState(265);
			match(T__0);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900108169216L) != 0)) {
				{
				setState(266);
				forUpdate();
				}
			}

			setState(269);
			match(T__7);
			setState(270);
			block();
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
	public static class ForInitContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forInit);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				assignment();
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
	public static class ForIntermeContext extends ParserRuleContext {
		public bool v;
		public OperCompExprContext a;
		public OperCompExprContext operCompExpr;
		public List<OperCompExprContext> b = new ArrayList<OperCompExprContext>();
		public List<OperCompExprContext> operCompExpr() {
			return getRuleContexts(OperCompExprContext.class);
		}
		public OperCompExprContext operCompExpr(int i) {
			return getRuleContext(OperCompExprContext.class,i);
		}
		public ForIntermeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInterme; }
	}

	public final ForIntermeContext forInterme() throws RecognitionException {
		ForIntermeContext _localctx = new ForIntermeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forInterme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((ForIntermeContext)_localctx).a = operCompExpr();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(277);
				match(T__3);
				setState(278);
				((ForIntermeContext)_localctx).operCompExpr = operCompExpr();
				((ForIntermeContext)_localctx).b.add(((ForIntermeContext)_localctx).operCompExpr);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((ForIntermeContext)_localctx).v =  ((ForIntermeContext)_localctx).a.v;  
			        for (auto bCtx : ((ForIntermeContext)_localctx).b) {
			            if (!bCtx->v) {
			                ((ForIntermeContext)_localctx).v =  false; 
			                break;
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
	public static class ForUpdateContext extends ParserRuleContext {
		public List<OperMathIndivForContext> operMathIndivFor() {
			return getRuleContexts(OperMathIndivForContext.class);
		}
		public OperMathIndivForContext operMathIndivFor(int i) {
			return getRuleContext(OperMathIndivForContext.class,i);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			operMathIndivFor();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(287);
				match(T__3);
				setState(288);
				operMathIndivFor();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ForIntermeContext forInterme() {
			return getRuleContext(ForIntermeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__33);
			setState(295);
			match(T__6);
			setState(296);
			forInterme();
			setState(297);
			match(T__7);
			setState(298);
			block();
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
	public static class FuncDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(tpCompiladoresParser.ID, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			type();
			setState(301);
			match(ID);
			setState(302);
			match(T__6);
			setState(303);
			parameterList();
			setState(304);
			match(T__7);
			setState(305);
			block();
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
	public static class FunCallContext extends ParserRuleContext {
		public double v;
		public TerminalNode ID() { return getToken(tpCompiladoresParser.ID, 0); }
		public ParameterListCallFunContext parameterListCallFun() {
			return getRuleContext(ParameterListCallFunContext.class,0);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ID);
			setState(308);
			match(T__6);
			setState(309);
			parameterListCallFun();
			setState(310);
			match(T__7);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(tpCompiladoresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tpCompiladoresParser.ID, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279275953455104L) != 0)) {
				{
				setState(312);
				type();
				setState(313);
				match(ID);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(314);
					match(T__3);
					setState(315);
					type();
					setState(316);
					match(ID);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class ParameterListCallFunContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParameterListCallFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterListCallFun; }
	}

	public final ParameterListCallFunContext parameterListCallFun() throws RecognitionException {
		ParameterListCallFunContext _localctx = new ParameterListCallFunContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterListCallFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3377699921854592L) != 0)) {
				{
				setState(325);
				expr();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(326);
					match(T__3);
					setState(327);
					expr();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class IoStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tpCompiladoresParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStatement; }
	}

	public final IoStatementContext ioStatement() throws RecognitionException {
		IoStatementContext _localctx = new IoStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ioStatement);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(T__34);
				setState(336);
				match(T__35);
				setState(337);
				match(ID);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(T__36);
				setState(339);
				match(T__37);
				{
				setState(340);
				expr();
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(341);
					match(T__37);
					setState(342);
					expr();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        // Si todas las condiciones se cumplieron, procede con la impresión
				        for (size_t i = 2; i < _localctx->children.size(); i += 2) {
				            if (_localctx->children[i]->getText() == "<<") continue;
				            if (dynamic_cast<ExprContext*>(_localctx->children[i]) != nullptr) {
				                std::cerr << ((ExprContext*)_localctx->children[i])->v;
				            } else {
				                std::cerr << _localctx->children[i]->getText();
				            }
				        }
				    
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__38);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3657173980676228L) != 0)) {
					{
					{
					setState(353);
					stat();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
				match(T__39);
				}
				break;
			case T__6:
			case T__25:
			case T__26:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				expr();
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 279275953455104L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SolosContext extends ParserRuleContext {
		public double v;
		public Token ID;
		public Token NUM;
		public TerminalNode ID() { return getToken(tpCompiladoresParser.ID, 0); }
		public TerminalNode NUM() { return getToken(tpCompiladoresParser.NUM, 0); }
		public SolosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solos; }
	}

	public final SolosContext solos() throws RecognitionException {
		SolosContext _localctx = new SolosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_solos);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				((SolosContext)_localctx).ID = match(ID);

				        std::string var = ((SolosContext)_localctx).ID->getText();
				        if (memory.find(var) != memory.end()) {
				            ((SolosContext)_localctx).v =  memory[var];
				            std::cerr << "Variable " << memory[var] << " esta declarada.\n";
				        } else {
				            std::cerr << "Variable " << var << " no esta declarada.\n";
				        }
				    
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				((SolosContext)_localctx).NUM = match(NUM);
				((SolosContext)_localctx).v =  std::stod(((SolosContext)_localctx).NUM->getText());
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return operMathExpr_sempred((OperMathExprContext)_localctx, predIndex);
		case 7:
			return operAndOr_sempred((OperAndOrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operMathExpr_sempred(OperMathExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean operAndOr_sempred(OperAndOrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0174\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001T\b\u0001\u0001\u0001\u0003\u0001"+
		"W\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0003"+
		"\u0003d\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003"+
		"\u0005\u0003k\b\u0003\n\u0003\f\u0003n\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004z\b\u0004\u0001\u0004\u0003\u0004"+
		"}\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0093\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a5\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00bb\b\u0006\n\u0006\f\u0006\u00be\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00cc\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00d3\b\u0007\n\u0007\f\u0007\u00d6\t\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e7\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f5\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ff"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u0104\b\r\u0001\r\u0001\r\u0003\r"+
		"\u0108\b\r\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0113\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0118\b\u000f\n\u000f\f\u000f\u011b\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0122\b\u0010"+
		"\n\u0010\f\u0010\u0125\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u013f\b\u0014\n\u0014\f\u0014"+
		"\u0142\t\u0014\u0003\u0014\u0144\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u0149\b\u0015\n\u0015\f\u0015\u014c\t\u0015\u0003\u0015"+
		"\u014e\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0158\b\u0016\n\u0016"+
		"\f\u0016\u015b\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u015f\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0163\b\u0017\n\u0017\f\u0017\u0166"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u016a\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0172\b\u0019\u0001\u0019\u0000\u0002\f\u000e\u001a\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02\u0000\b\u0002\u0000\u0003\u0003\u0005\u0006\u0001\u0000\t\f\u0001"+
		"\u0000\r\u000e\u0001\u0000\u000f\u0013\u0001\u0000\u0014\u0019\u0001\u0000"+
		"\u001a\u001b\u0002\u0000\u000f\u0013\u001c\u001c\u0001\u0000)/\u0191\u0000"+
		"7\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000\u0004Z\u0001"+
		"\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\b|\u0001\u0000\u0000"+
		"\u0000\n\u0092\u0001\u0000\u0000\u0000\f\u00a4\u0001\u0000\u0000\u0000"+
		"\u000e\u00cb\u0001\u0000\u0000\u0000\u0010\u00dd\u0001\u0000\u0000\u0000"+
		"\u0012\u00e6\u0001\u0000\u0000\u0000\u0014\u00e8\u0001\u0000\u0000\u0000"+
		"\u0016\u00ed\u0001\u0000\u0000\u0000\u0018\u00f6\u0001\u0000\u0000\u0000"+
		"\u001a\u0100\u0001\u0000\u0000\u0000\u001c\u0112\u0001\u0000\u0000\u0000"+
		"\u001e\u0114\u0001\u0000\u0000\u0000 \u011e\u0001\u0000\u0000\u0000\""+
		"\u0126\u0001\u0000\u0000\u0000$\u012c\u0001\u0000\u0000\u0000&\u0133\u0001"+
		"\u0000\u0000\u0000(\u0143\u0001\u0000\u0000\u0000*\u014d\u0001\u0000\u0000"+
		"\u0000,\u015e\u0001\u0000\u0000\u0000.\u0169\u0001\u0000\u0000\u00000"+
		"\u016b\u0001\u0000\u0000\u00002\u0171\u0001\u0000\u0000\u000046\u0003"+
		"\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000\u0000\u0001;\u0001\u0001"+
		"\u0000\u0000\u0000<=\u0003\u0006\u0003\u0000=>\u0005\u0001\u0000\u0000"+
		">W\u0001\u0000\u0000\u0000?A\u0003\b\u0004\u0000@B\u0005\u0001\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BW\u0001\u0000\u0000"+
		"\u0000CW\u0003$\u0012\u0000DW\u0003\u0016\u000b\u0000EW\u0003\u001a\r"+
		"\u0000FW\u0003\"\u0011\u0000GH\u0003\n\u0005\u0000HI\u0005\u0001\u0000"+
		"\u0000IW\u0001\u0000\u0000\u0000JL\u0003\u0018\f\u0000KM\u0005\u0001\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MW\u0001\u0000"+
		"\u0000\u0000NO\u0003,\u0016\u0000OP\u0005\u0001\u0000\u0000PW\u0001\u0000"+
		"\u0000\u0000QS\u0005\u0002\u0000\u0000RT\u0003\n\u0005\u0000SR\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0005"+
		"\u0001\u0000\u0000V<\u0001\u0000\u0000\u0000V?\u0001\u0000\u0000\u0000"+
		"VC\u0001\u0000\u0000\u0000VD\u0001\u0000\u0000\u0000VE\u0001\u0000\u0000"+
		"\u0000VF\u0001\u0000\u0000\u0000VG\u0001\u0000\u0000\u0000VJ\u0001\u0000"+
		"\u0000\u0000VN\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000W\u0003"+
		"\u0001\u0000\u0000\u0000X[\u0003,\u0016\u0000Y[\u0003&\u0013\u0000ZX\u0001"+
		"\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0005\u0001\u0000\u0000"+
		"\u0000\\]\u00030\u0018\u0000]c\u00052\u0000\u0000^a\u0005\u0003\u0000"+
		"\u0000_b\u0003\n\u0005\u0000`b\u0003\u0018\f\u0000a_\u0001\u0000\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000c^\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000dl\u0001\u0000\u0000\u0000eh\u0005"+
		"\u0004\u0000\u0000fi\u0003\b\u0004\u0000gi\u00052\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"je\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000op\u0006\u0003\uffff\uffff\u0000p\u0007\u0001\u0000\u0000"+
		"\u0000qr\u00052\u0000\u0000rs\u0007\u0000\u0000\u0000st\u0003\n\u0005"+
		"\u0000tu\u0006\u0004\uffff\uffff\u0000u}\u0001\u0000\u0000\u0000vw\u0005"+
		"2\u0000\u0000wy\u0005\u0003\u0000\u0000xz\u0003\u0018\f\u0000yx\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{}\u0006\u0004\uffff\uffff\u0000|q\u0001\u0000\u0000\u0000|v\u0001\u0000"+
		"\u0000\u0000}\t\u0001\u0000\u0000\u0000~\u007f\u0005\u0007\u0000\u0000"+
		"\u007f\u0080\u0003\n\u0005\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081"+
		"\u0082\u0006\u0005\uffff\uffff\u0000\u0082\u0093\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0003\f\u0006\u0000\u0084\u0085\u0006\u0005\uffff\uffff\u0000"+
		"\u0085\u0093\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0014\n\u0000\u0087"+
		"\u0088\u0006\u0005\uffff\uffff\u0000\u0088\u0093\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0003\u000e\u0007\u0000\u008a\u008b\u0006\u0005\uffff\uffff"+
		"\u0000\u008b\u0093\u0001\u0000\u0000\u0000\u008c\u008d\u0003&\u0013\u0000"+
		"\u008d\u008e\u0006\u0005\uffff\uffff\u0000\u008e\u0093\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u00032\u0019\u0000\u0090\u0091\u0006\u0005\uffff\uffff"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092~\u0001\u0000\u0000\u0000"+
		"\u0092\u0083\u0001\u0000\u0000\u0000\u0092\u0086\u0001\u0000\u0000\u0000"+
		"\u0092\u0089\u0001\u0000\u0000\u0000\u0092\u008c\u0001\u0000\u0000\u0000"+
		"\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u000b\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0006\u0006\uffff\uffff\u0000\u0095\u0096\u0005\u0007\u0000"+
		"\u0000\u0096\u0097\u0003\f\u0006\u0000\u0097\u0098\u0005\b\u0000\u0000"+
		"\u0098\u0099\u0006\u0006\uffff\uffff\u0000\u0099\u00a5\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0003\u0010\b\u0000\u009b\u009c\u0006\u0006\uffff\uffff"+
		"\u0000\u009c\u00a5\u0001\u0000\u0000\u0000\u009d\u009e\u0003&\u0013\u0000"+
		"\u009e\u009f\u0006\u0006\uffff\uffff\u0000\u009f\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u00053\u0000\u0000\u00a1\u00a5\u0006\u0006\uffff\uffff"+
		"\u0000\u00a2\u00a3\u00052\u0000\u0000\u00a3\u00a5\u0006\u0006\uffff\uffff"+
		"\u0000\u00a4\u0094\u0001\u0000\u0000\u0000\u00a4\u009a\u0001\u0000\u0000"+
		"\u0000\u00a4\u009d\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00bc\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\n\b\u0000\u0000\u00a7\u00a8\u0007\u0001\u0000\u0000"+
		"\u00a8\u00a9\u0003\f\u0006\t\u00a9\u00aa\u0006\u0006\uffff\uffff\u0000"+
		"\u00aa\u00bb\u0001\u0000\u0000\u0000\u00ab\u00ac\n\u0007\u0000\u0000\u00ac"+
		"\u00ad\u0007\u0002\u0000\u0000\u00ad\u00ae\u0003\f\u0006\b\u00ae\u00af"+
		"\u0006\u0006\uffff\uffff\u0000\u00af\u00bb\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\n\u0006\u0000\u0000\u00b1\u00b2\u0007\u0003\u0000\u0000\u00b2\u00b3"+
		"\u0003\f\u0006\u0007\u00b3\u00b4\u0006\u0006\uffff\uffff\u0000\u00b4\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\n\u0005\u0000\u0000\u00b6\u00b7\u0007"+
		"\u0004\u0000\u0000\u00b7\u00b8\u0003\f\u0006\u0006\u00b8\u00b9\u0006\u0006"+
		"\uffff\uffff\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ba\u00ab\u0001\u0000\u0000\u0000\u00ba\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\r\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0006\u0007\uffff\uffff\u0000\u00c0\u00c1\u0005"+
		"\u0007\u0000\u0000\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00c3\u0005"+
		"\b\u0000\u0000\u00c3\u00c4\u0006\u0007\uffff\uffff\u0000\u00c4\u00cc\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0003\u0014\n\u0000\u00c6\u00c7\u0006\u0007"+
		"\uffff\uffff\u0000\u00c7\u00cc\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003"+
		"2\u0019\u0000\u00c9\u00ca\u0006\u0007\uffff\uffff\u0000\u00ca\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cb\u00bf\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cc\u00d4\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\n\u0004\u0000\u0000\u00ce\u00cf\u0007\u0004"+
		"\u0000\u0000\u00cf\u00d0\u0003\u000e\u0007\u0005\u00d0\u00d1\u0006\u0007"+
		"\uffff\uffff\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u000f\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"2\u0000\u0000\u00d8\u00d9\u0007\u0005\u0000\u0000\u00d9\u00de\u0006\b"+
		"\uffff\uffff\u0000\u00da\u00db\u0007\u0005\u0000\u0000\u00db\u00dc\u0005"+
		"2\u0000\u0000\u00dc\u00de\u0006\b\uffff\uffff\u0000\u00dd\u00d7\u0001"+
		"\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\u0011\u0001"+
		"\u0000\u0000\u0000\u00df\u00e7\u0003\u0010\b\u0000\u00e0\u00e7\u0003\b"+
		"\u0004\u0000\u00e1\u00e2\u00052\u0000\u0000\u00e2\u00e3\u0005\u0003\u0000"+
		"\u0000\u00e3\u00e4\u0003\f\u0006\u0000\u00e4\u00e5\u0006\t\uffff\uffff"+
		"\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00df\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e0\u0001\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e7\u0013\u0001\u0000\u0000\u0000\u00e8\u00e9\u00032\u0019\u0000"+
		"\u00e9\u00ea\u0007\u0006\u0000\u0000\u00ea\u00eb\u0003\f\u0006\u0000\u00eb"+
		"\u00ec\u0006\n\uffff\uffff\u0000\u00ec\u0015\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\u001d\u0000\u0000\u00ee\u00ef\u0005\u0007\u0000\u0000\u00ef"+
		"\u00f0\u0003\n\u0005\u0000\u00f0\u00f1\u0005\b\u0000\u0000\u00f1\u00f4"+
		"\u0003.\u0017\u0000\u00f2\u00f3\u0005\u001e\u0000\u0000\u00f3\u00f5\u0003"+
		".\u0017\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u0017\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0007"+
		"\u0000\u0000\u00f7\u00f8\u0003\n\u0005\u0000\u00f8\u00f9\u0005\b\u0000"+
		"\u0000\u00f9\u00fa\u0005\u001f\u0000\u0000\u00fa\u00fb\u0003\u0004\u0002"+
		"\u0000\u00fb\u00fe\u0005 \u0000\u0000\u00fc\u00ff\u0003\u0018\f\u0000"+
		"\u00fd\u00ff\u0003\u0002\u0001\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0019\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005!\u0000\u0000\u0101\u0103\u0005\u0007\u0000\u0000\u0102"+
		"\u0104\u0003\u001c\u000e\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u0107\u0005\u0001\u0000\u0000\u0106\u0108\u0003\u001e\u000f\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0005\u0001\u0000\u0000\u010a"+
		"\u010c\u0003 \u0010\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005\b\u0000\u0000\u010e\u010f\u0003.\u0017\u0000\u010f\u001b\u0001"+
		"\u0000\u0000\u0000\u0110\u0113\u0003\u0006\u0003\u0000\u0111\u0113\u0003"+
		"\b\u0004\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u001d\u0001\u0000\u0000\u0000\u0114\u0119\u0003\u0014"+
		"\n\u0000\u0115\u0116\u0005\u0004\u0000\u0000\u0116\u0118\u0003\u0014\n"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0006\u000f\uffff\uffff\u0000\u011d\u001f\u0001\u0000"+
		"\u0000\u0000\u011e\u0123\u0003\u0012\t\u0000\u011f\u0120\u0005\u0004\u0000"+
		"\u0000\u0120\u0122\u0003\u0012\t\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124!\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0005\"\u0000\u0000\u0127\u0128"+
		"\u0005\u0007\u0000\u0000\u0128\u0129\u0003\u001e\u000f\u0000\u0129\u012a"+
		"\u0005\b\u0000\u0000\u012a\u012b\u0003.\u0017\u0000\u012b#\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u00030\u0018\u0000\u012d\u012e\u00052\u0000\u0000"+
		"\u012e\u012f\u0005\u0007\u0000\u0000\u012f\u0130\u0003(\u0014\u0000\u0130"+
		"\u0131\u0005\b\u0000\u0000\u0131\u0132\u0003.\u0017\u0000\u0132%\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u00052\u0000\u0000\u0134\u0135\u0005\u0007"+
		"\u0000\u0000\u0135\u0136\u0003*\u0015\u0000\u0136\u0137\u0005\b\u0000"+
		"\u0000\u0137\'\u0001\u0000\u0000\u0000\u0138\u0139\u00030\u0018\u0000"+
		"\u0139\u0140\u00052\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b"+
		"\u013c\u00030\u0018\u0000\u013c\u013d\u00052\u0000\u0000\u013d\u013f\u0001"+
		"\u0000\u0000\u0000\u013e\u013a\u0001\u0000\u0000\u0000\u013f\u0142\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0143\u0138\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144)\u0001\u0000\u0000\u0000\u0145\u014a\u0003\n"+
		"\u0005\u0000\u0146\u0147\u0005\u0004\u0000\u0000\u0147\u0149\u0003\n\u0005"+
		"\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000"+
		"\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014d\u0145\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e+\u0001\u0000\u0000\u0000\u014f\u0150\u0005#\u0000\u0000\u0150"+
		"\u0151\u0005$\u0000\u0000\u0151\u015f\u00052\u0000\u0000\u0152\u0153\u0005"+
		"%\u0000\u0000\u0153\u0154\u0005&\u0000\u0000\u0154\u0159\u0003\n\u0005"+
		"\u0000\u0155\u0156\u0005&\u0000\u0000\u0156\u0158\u0003\n\u0005\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0006\u0016\uffff\uffff\u0000\u015d\u015f\u0001\u0000\u0000"+
		"\u0000\u015e\u014f\u0001\u0000\u0000\u0000\u015e\u0152\u0001\u0000\u0000"+
		"\u0000\u015f-\u0001\u0000\u0000\u0000\u0160\u0164\u0005\'\u0000\u0000"+
		"\u0161\u0163\u0003\u0002\u0001\u0000\u0162\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000"+
		"\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a\u0005(\u0000\u0000\u0168"+
		"\u016a\u0003\n\u0005\u0000\u0169\u0160\u0001\u0000\u0000\u0000\u0169\u0168"+
		"\u0001\u0000\u0000\u0000\u016a/\u0001\u0000\u0000\u0000\u016b\u016c\u0007"+
		"\u0007\u0000\u0000\u016c1\u0001\u0000\u0000\u0000\u016d\u016e\u00052\u0000"+
		"\u0000\u016e\u0172\u0006\u0019\uffff\uffff\u0000\u016f\u0170\u00053\u0000"+
		"\u0000\u0170\u0172\u0006\u0019\uffff\uffff\u0000\u0171\u016d\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u01723\u0001\u0000\u0000"+
		"\u0000%7ALSVZachly|\u0092\u00a4\u00ba\u00bc\u00cb\u00d4\u00dd\u00e6\u00f4"+
		"\u00fe\u0103\u0107\u010b\u0112\u0119\u0123\u0140\u0143\u014a\u014d\u0159"+
		"\u015e\u0164\u0169\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}