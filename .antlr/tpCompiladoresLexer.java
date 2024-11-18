// Generated from c:/antlr4/TP-Compiladores/tf.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class tpCompiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, INT=5, FLOAT=6, STRING=7, NUM=8, NOMBRE=9, 
		ENTERO=10, COMMENTS=11, COMMENT=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "INT", "FLOAT", "STRING", "NUM", "NOMBRE", 
			"ENTERO", "COMMENTS", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'caja_entero'", "'caja_decimal'", "'caja_texto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "INT", "FLOAT", "STRING", "NUM", "NOMBRE", 
			"ENTERO", "COMMENTS", "COMMENT", "WS"
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


	public tpCompiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\r\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003B\b"+
		"\u0003\n\u0003\f\u0003E\t\u0003\u0001\u0004\u0003\u0004H\b\u0004\u0001"+
		"\u0004\u0004\u0004K\b\u0004\u000b\u0004\f\u0004L\u0001\u0005\u0003\u0005"+
		"P\b\u0005\u0001\u0005\u0004\u0005S\b\u0005\u000b\u0005\f\u0005T\u0001"+
		"\u0005\u0001\u0005\u0004\u0005Y\b\u0005\u000b\u0005\f\u0005Z\u0001\u0006"+
		"\u0001\u0006\u0005\u0006_\b\u0006\n\u0006\f\u0006b\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0003\u0007g\b\u0007\u0001\u0007\u0004\u0007"+
		"j\b\u0007\u000b\u0007\f\u0007k\u0001\u0007\u0001\u0007\u0004\u0007p\b"+
		"\u0007\u000b\u0007\f\u0007q\u0003\u0007t\b\u0007\u0001\b\u0001\b\u0005"+
		"\bx\b\b\n\b\f\b{\t\b\u0001\t\u0004\t~\b\t\u000b\t\f\t\u007f\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n\n\f\n\u0089\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0094\b\u000b\n\u000b\f\u000b\u0097\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0004\f\u009c\b\f\u000b\f\f\f\u009d\u0001\f\u0001\f\u0001"+
		"\u0087\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u0001\u0000\b\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003"+
		"\u0000\n\n\r\r\"\"\u0005\u0000AZ__az\u00d1\u00d1\u00f1\u00f1\u0006\u0000"+
		"09AZ__az\u00d1\u00d1\u00f1\u00f1\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r"+
		"\r  \u00b0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000"+
		"\u0003\'\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000\u0007"+
		"?\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bO\u0001\u0000"+
		"\u0000\u0000\r\\\u0001\u0000\u0000\u0000\u000ff\u0001\u0000\u0000\u0000"+
		"\u0011u\u0001\u0000\u0000\u0000\u0013}\u0001\u0000\u0000\u0000\u0015\u0081"+
		"\u0001\u0000\u0000\u0000\u0017\u008f\u0001\u0000\u0000\u0000\u0019\u009b"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005c\u0000\u0000\u001c\u001d\u0005"+
		"a\u0000\u0000\u001d\u001e\u0005j\u0000\u0000\u001e\u001f\u0005a\u0000"+
		"\u0000\u001f \u0005_\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005n\u0000"+
		"\u0000\"#\u0005t\u0000\u0000#$\u0005e\u0000\u0000$%\u0005r\u0000\u0000"+
		"%&\u0005o\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005c\u0000\u0000"+
		"()\u0005a\u0000\u0000)*\u0005j\u0000\u0000*+\u0005a\u0000\u0000+,\u0005"+
		"_\u0000\u0000,-\u0005d\u0000\u0000-.\u0005e\u0000\u0000./\u0005c\u0000"+
		"\u0000/0\u0005i\u0000\u000001\u0005m\u0000\u000012\u0005a\u0000\u0000"+
		"23\u0005l\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005c\u0000\u0000"+
		"56\u0005a\u0000\u000067\u0005j\u0000\u000078\u0005a\u0000\u000089\u0005"+
		"_\u0000\u00009:\u0005t\u0000\u0000:;\u0005e\u0000\u0000;<\u0005x\u0000"+
		"\u0000<=\u0005t\u0000\u0000=>\u0005o\u0000\u0000>\u0006\u0001\u0000\u0000"+
		"\u0000?C\u0007\u0000\u0000\u0000@B\u0007\u0001\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\b\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FH\u0005-\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IK\u0007\u0002\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000M\n\u0001\u0000\u0000\u0000NP\u0005-\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QS\u0007"+
		"\u0002\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VX\u0005.\u0000\u0000WY\u0007\u0002\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\f\u0001\u0000\u0000\u0000\\`\u0005\"\u0000\u0000]_\b\u0003"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cd\u0005\"\u0000\u0000d\u000e\u0001\u0000\u0000"+
		"\u0000eg\u0005-\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hj\u0007\u0002\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000ls\u0001\u0000\u0000\u0000mo\u0005.\u0000\u0000np\u0007"+
		"\u0002\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000"+
		"\u0000sm\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0010\u0001"+
		"\u0000\u0000\u0000uy\u0007\u0004\u0000\u0000vx\u0007\u0005\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0012\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|~\u0007\u0002\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0014\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005/\u0000\u0000\u0082\u0083\u0005*\u0000\u0000\u0083\u0087\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\t\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005*\u0000\u0000"+
		"\u008b\u008c\u0005/\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0006\n\u0000\u0000\u008e\u0016\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005/\u0000\u0000\u0090\u0091\u0005/\u0000\u0000\u0091\u0095\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\b\u0006\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0006\u000b\u0000"+
		"\u0000\u0099\u0018\u0001\u0000\u0000\u0000\u009a\u009c\u0007\u0007\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0006\f\u0000\u0000"+
		"\u00a0\u001a\u0001\u0000\u0000\u0000\u0011\u0000CGLOTZ`fkqsy\u007f\u0087"+
		"\u0095\u009d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}