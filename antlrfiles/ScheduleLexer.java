// Generated from antlrfiles/Schedule.g4 by ANTLR 4.7.1
package antlrfiles;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BasicOperator=1, AssignmentOperator=2, OtherOperator=3, Kind=4, Name=5, 
		Facility=6, Capacity=7, Day=8, Time=9, WhiteSpace=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BasicOperator", "AssignmentOperator", "OtherOperator", "Kind", "Name", 
		"Facility", "Capacity", "Day", "Time", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BasicOperator", "AssignmentOperator", "OtherOperator", "Kind", 
		"Name", "Facility", "Capacity", "Day", "Time", "WhiteSpace"
	};
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


	public ScheduleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Schedule.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u008d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\6\6_\n\6\r\6\16\6`\3\7\3\7\3\7\3\7\3\7\6\7h\n\7\r\7\16"+
		"\7i\3\b\3\b\3\b\3\b\3\b\6\bq\n\b\r\b\16\br\3\t\3\t\3\t\3\t\3\t\6\tz\n"+
		"\t\r\t\16\t{\3\n\3\n\3\n\3\n\3\n\6\n\u0083\n\n\r\n\16\n\u0084\3\13\6\13"+
		"\u0088\n\13\r\13\16\13\u0089\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\3\2\6\5\2\62;C\\c|\4\2C\\c|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\3*\3\2\2\2\5,\3\2\2\2\7\63\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\rb\3\2\2\2"+
		"\17k\3\2\2\2\21t\3\2\2\2\23}\3\2\2\2\25\u0087\3\2\2\2\27\30\7C\2\2\30"+
		"\31\7F\2\2\31+\7F\2\2\32\33\7F\2\2\33\34\7G\2\2\34\35\7N\2\2\35\36\7G"+
		"\2\2\36\37\7V\2\2\37+\7G\2\2 !\7W\2\2!\"\7R\2\2\"#\7F\2\2#$\7C\2\2$%\7"+
		"V\2\2%+\7G\2\2&\'\7U\2\2\'(\7J\2\2()\7Q\2\2)+\7Y\2\2*\27\3\2\2\2*\32\3"+
		"\2\2\2* \3\2\2\2*&\3\2\2\2+\4\3\2\2\2,-\7C\2\2-.\7U\2\2./\7U\2\2/\60\7"+
		"K\2\2\60\61\7I\2\2\61\62\7P\2\2\62\6\3\2\2\2\63\64\7G\2\2\64\65\7Z\2\2"+
		"\65\66\7K\2\2\66\67\7V\2\2\67\b\3\2\2\289\7F\2\29:\7Q\2\2:;\7U\2\2;<\7"+
		"G\2\2<X\7P\2\2=>\7T\2\2>?\7W\2\2?@\7C\2\2@A\7P\2\2AB\7I\2\2BC\7C\2\2C"+
		"X\7P\2\2DE\7H\2\2EF\7C\2\2FG\7U\2\2GH\7K\2\2HI\7N\2\2IJ\7K\2\2JK\7V\2"+
		"\2KL\7C\2\2LX\7U\2\2MN\7O\2\2NO\7C\2\2OP\7V\2\2PQ\7C\2\2QR\7M\2\2RS\7"+
		"W\2\2ST\7N\2\2TU\7K\2\2UV\7C\2\2VX\7J\2\2W8\3\2\2\2W=\3\2\2\2WD\3\2\2"+
		"\2WM\3\2\2\2X\n\3\2\2\2YZ\7/\2\2Z[\7p\2\2[\\\7\"\2\2\\^\3\2\2\2]_\t\2"+
		"\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\f\3\2\2\2bc\7/\2\2cd\7h"+
		"\2\2de\7\"\2\2eg\3\2\2\2fh\t\3\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2j\16\3\2\2\2kl\7/\2\2lm\7e\2\2mn\7\"\2\2np\3\2\2\2oq\t\4\2\2po\3\2"+
		"\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\20\3\2\2\2tu\7/\2\2uv\7f\2\2vw\7\""+
		"\2\2wy\3\2\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\22\3"+
		"\2\2\2}~\7/\2\2~\177\7v\2\2\177\u0080\7\"\2\2\u0080\u0082\3\2\2\2\u0081"+
		"\u0083\t\4\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\24\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\b\13\2\2\u008c\26\3\2\2\2\13\2*W`ir{\u0084"+
		"\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}