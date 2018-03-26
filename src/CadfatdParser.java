// Generated from Cadfatd.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CadfatdParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, AKA_KEYWORD=3, AKA_VAR_1=4, AKA_VAR_2=5, BORN_KEYWORD=6, 
		BORN_ON=7, DOB=8, ALPHANUM=9, WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "AKA_KEYWORD", "'also known as '", "'known among others as '", 
		"BORN_KEYWORD", "'born on '", "'date of birth: '", "ALPHANUM", "WS"
	};
	public static final int
		RULE_line = 0, RULE_name = 1, RULE_remark = 2, RULE_aka = 3, RULE_born = 4, 
		RULE_text = 5;
	public static final String[] ruleNames = {
		"line", "name", "remark", "aka", "born", "text"
	};

	@Override
	public String getGrammarFileName() { return "Cadfatd.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CadfatdParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public AkaContext aka(int i) {
			return getRuleContext(AkaContext.class,i);
		}
		public List<AkaContext> aka() {
			return getRuleContexts(AkaContext.class);
		}
		public List<BornContext> born() {
			return getRuleContexts(BornContext.class);
		}
		public BornContext born(int i) {
			return getRuleContext(BornContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RemarkContext remark() {
			return getRuleContext(RemarkContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CadfatdVisitor ) return ((CadfatdVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); name();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1) {
				{
				setState(15);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(13); born();
					}
					break;

				case 2:
					{
					setState(14); aka();
					}
					break;
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			_la = _input.LA(1);
			if (_la==ALPHANUM) {
				{
				setState(20); remark();
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

	public static class NameContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CadfatdVisitor ) return ((CadfatdVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); text();
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

	public static class RemarkContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public RemarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).enterRemark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).exitRemark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CadfatdVisitor ) return ((CadfatdVisitor<? extends T>)visitor).visitRemark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemarkContext remark() throws RecognitionException {
		RemarkContext _localctx = new RemarkContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_remark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); text();
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

	public static class AkaContext extends ParserRuleContext {
		public TerminalNode AKA_KEYWORD() { return getToken(CadfatdParser.AKA_KEYWORD, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AkaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aka; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).enterAka(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).exitAka(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CadfatdVisitor ) return ((CadfatdVisitor<? extends T>)visitor).visitAka(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AkaContext aka() throws RecognitionException {
		AkaContext _localctx = new AkaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aka);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(1);
			setState(28); match(AKA_KEYWORD);
			setState(29); text();
			setState(30); match(2);
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

	public static class BornContext extends ParserRuleContext {
		public TerminalNode BORN_KEYWORD() { return getToken(CadfatdParser.BORN_KEYWORD, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public BornContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_born; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).enterBorn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).exitBorn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CadfatdVisitor ) return ((CadfatdVisitor<? extends T>)visitor).visitBorn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BornContext born() throws RecognitionException {
		BornContext _localctx = new BornContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_born);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(1);
			setState(33); match(BORN_KEYWORD);
			setState(34); text();
			setState(35); match(2);
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

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> ALPHANUM() { return getTokens(CadfatdParser.ALPHANUM); }
		public TerminalNode ALPHANUM(int i) {
			return getToken(CadfatdParser.ALPHANUM, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CadfatdListener ) ((CadfatdListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CadfatdVisitor ) return ((CadfatdVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37); match(ALPHANUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		"\2\3\f-\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7"+
		"\2\22\n\2\f\2\16\2\25\13\2\3\2\5\2\30\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\6\7)\n\7\r\7\16\7*\3\7\2\b\2\4\6\b\n"+
		"\f\2\2*\2\16\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b\35\3\2\2\2\n\"\3\2\2"+
		"\2\f(\3\2\2\2\16\23\5\4\3\2\17\22\5\n\6\2\20\22\5\b\5\2\21\17\3\2\2\2"+
		"\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\27\3\2\2\2"+
		"\25\23\3\2\2\2\26\30\5\6\4\2\27\26\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2"+
		"\31\32\5\f\7\2\32\5\3\2\2\2\33\34\5\f\7\2\34\7\3\2\2\2\35\36\7\3\2\2\36"+
		"\37\7\5\2\2\37 \5\f\7\2 !\7\4\2\2!\t\3\2\2\2\"#\7\3\2\2#$\7\b\2\2$%\5"+
		"\f\7\2%&\7\4\2\2&\13\3\2\2\2\')\7\13\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2"+
		"\2*+\3\2\2\2+\r\3\2\2\2\6\21\23\27*";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}