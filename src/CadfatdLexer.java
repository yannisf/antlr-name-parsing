// Generated from Cadfatd.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CadfatdLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, AKA_KEYWORD=3, AKA_VAR_1=4, AKA_VAR_2=5, BORN_KEYWORD=6, 
		BORN_ON=7, DOB=8, ALPHANUM=9, WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "AKA_KEYWORD", "'also known as '", "'known among others as '", 
		"BORN_KEYWORD", "'born on '", "'date of birth: '", "ALPHANUM", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "DIGIT", "CHAR", "AKA_KEYWORD", "AKA_VAR_1", "AKA_VAR_2", 
		"BORN_KEYWORD", "BORN_ON", "DOB", "ALPHANUM", "WS"
	};


	public CadfatdLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cadfatd.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\fw\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\5\6&\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tP\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\6\fm\n\f\r\f\16\fn\3\r\6\rr\n\r\r\r"+
		"\16\rs\3\r\3\r\2\16\3\3\1\5\4\1\7\2\1\t\2\1\13\5\1\r\6\1\17\7\1\21\b\1"+
		"\23\t\1\25\n\1\27\13\1\31\f\2\3\2\5\3\62;\6))//C\\c|\5\13\f\17\17\"\""+
		"y\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2"+
		"\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17\66"+
		"\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25Z\3\2\2\2\27l\3\2\2\2\31q\3\2\2\2\33"+
		"\34\7*\2\2\34\4\3\2\2\2\35\36\7+\2\2\36\6\3\2\2\2\37 \t\2\2\2 \b\3\2\2"+
		"\2!\"\t\3\2\2\"\n\3\2\2\2#&\5\r\7\2$&\5\17\b\2%#\3\2\2\2%$\3\2\2\2&\f"+
		"\3\2\2\2\'(\7c\2\2()\7n\2\2)*\7u\2\2*+\7q\2\2+,\7\"\2\2,-\7m\2\2-.\7p"+
		"\2\2./\7q\2\2/\60\7y\2\2\60\61\7p\2\2\61\62\7\"\2\2\62\63\7c\2\2\63\64"+
		"\7u\2\2\64\65\7\"\2\2\65\16\3\2\2\2\66\67\7m\2\2\678\7p\2\289\7q\2\29"+
		":\7y\2\2:;\7p\2\2;<\7\"\2\2<=\7c\2\2=>\7o\2\2>?\7q\2\2?@\7p\2\2@A\7i\2"+
		"\2AB\7\"\2\2BC\7q\2\2CD\7v\2\2DE\7j\2\2EF\7g\2\2FG\7t\2\2GH\7u\2\2HI\7"+
		"\"\2\2IJ\7c\2\2JK\7u\2\2KL\7\"\2\2L\20\3\2\2\2MP\5\23\n\2NP\5\25\13\2"+
		"OM\3\2\2\2ON\3\2\2\2P\22\3\2\2\2QR\7d\2\2RS\7q\2\2ST\7t\2\2TU\7p\2\2U"+
		"V\7\"\2\2VW\7q\2\2WX\7p\2\2XY\7\"\2\2Y\24\3\2\2\2Z[\7f\2\2[\\\7c\2\2\\"+
		"]\7v\2\2]^\7g\2\2^_\7\"\2\2_`\7q\2\2`a\7h\2\2ab\7\"\2\2bc\7d\2\2cd\7k"+
		"\2\2de\7t\2\2ef\7v\2\2fg\7j\2\2gh\7<\2\2hi\7\"\2\2i\26\3\2\2\2jm\5\t\5"+
		"\2km\5\7\4\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\30\3\2"+
		"\2\2pr\t\4\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\r"+
		"\2\2v\32\3\2\2\2\b\2%Olns";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}