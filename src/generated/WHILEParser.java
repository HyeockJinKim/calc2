// Generated from /Users/hyeockjinkim/dev/MyProjects/CalculationANTLR/src/generated/WHILE.g4 by ANTLR 4.7
package generated;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WHILEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, N=7, IDENT=8, WS=9;
	public static final int
		RULE_program = 0, RULE_stmts = 1, RULE_stmt = 2, RULE_aexpr = 3, RULE_aexpr2 = 4;
	public static final String[] ruleNames = {
		"program", "stmts", "stmt", "aexpr", "aexpr2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "N", "IDENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "WHILE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  Map<String, Integer> map = new HashMap<>();

	public WHILEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			stmts();
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

	public static class StmtsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		try {
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				stmt();
				setState(13);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				stmt();
				setState(16);
				match(T__0);
				setState(17);
				stmts();
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

	public static class StmtContext extends ParserRuleContext {
		public AexprContext aexpr;
		public Token IDENT;
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(WHILEParser.IDENT, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				((StmtContext)_localctx).aexpr = aexpr(0);
				 int result = ((StmtContext)_localctx).aexpr.sv; System.out.println(result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				((StmtContext)_localctx).IDENT = match(IDENT);
				setState(25);
				match(T__1);
				setState(26);
				((StmtContext)_localctx).aexpr = aexpr(0);
				 String id = ((StmtContext)_localctx).IDENT.getText(); map.put(id, ((StmtContext)_localctx).aexpr.sv); 
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

	public static class AexprContext extends ParserRuleContext {
		public int sv;
		public AexprContext a1;
		public Aexpr2Context aexpr2;
		public AexprContext a2;
		public Aexpr2Context aexpr2() {
			return getRuleContext(Aexpr2Context.class,0);
		}
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitAexpr(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		return aexpr(0);
	}

	private AexprContext aexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexprContext _localctx = new AexprContext(_ctx, _parentState);
		AexprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_aexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(32);
			((AexprContext)_localctx).aexpr2 = aexpr2(0);
			 ((AexprContext)_localctx).sv =  ((AexprContext)_localctx).aexpr2.sv; 
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(35);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(36);
						match(T__2);
						setState(37);
						((AexprContext)_localctx).a2 = aexpr(3);
						 ((AexprContext)_localctx).sv =  ((AexprContext)_localctx).a1.sv + ((AexprContext)_localctx).a2.sv; 
						}
						break;
					case 2:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(40);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(41);
						match(T__3);
						setState(42);
						((AexprContext)_localctx).a2 = aexpr(2);
						 ((AexprContext)_localctx).sv =  ((AexprContext)_localctx).a1.sv - ((AexprContext)_localctx).a2.sv; 
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Aexpr2Context extends ParserRuleContext {
		public int sv;
		public Aexpr2Context a1;
		public Token N;
		public Token IDENT;
		public Aexpr2Context a2;
		public TerminalNode N() { return getToken(WHILEParser.N, 0); }
		public TerminalNode IDENT() { return getToken(WHILEParser.IDENT, 0); }
		public List<Aexpr2Context> aexpr2() {
			return getRuleContexts(Aexpr2Context.class);
		}
		public Aexpr2Context aexpr2(int i) {
			return getRuleContext(Aexpr2Context.class,i);
		}
		public Aexpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterAexpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitAexpr2(this);
		}
	}

	public final Aexpr2Context aexpr2() throws RecognitionException {
		return aexpr2(0);
	}

	private Aexpr2Context aexpr2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Aexpr2Context _localctx = new Aexpr2Context(_ctx, _parentState);
		Aexpr2Context _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_aexpr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N:
				{
				setState(51);
				((Aexpr2Context)_localctx).N = match(N);
				 String n = ((Aexpr2Context)_localctx).N.getText(); ((Aexpr2Context)_localctx).sv =  Integer.parseInt(n); 
				}
				break;
			case IDENT:
				{
				setState(53);
				((Aexpr2Context)_localctx).IDENT = match(IDENT);
				 String id = ((Aexpr2Context)_localctx).IDENT.getText(); ((Aexpr2Context)_localctx).sv =  map.get(id); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Aexpr2Context(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr2);
						setState(57);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(58);
						match(T__4);
						setState(59);
						((Aexpr2Context)_localctx).a2 = aexpr2(3);
						 ((Aexpr2Context)_localctx).sv =  ((Aexpr2Context)_localctx).a1.sv * ((Aexpr2Context)_localctx).a2.sv; 
						}
						break;
					case 2:
						{
						_localctx = new Aexpr2Context(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr2);
						setState(62);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(63);
						match(T__5);
						setState(64);
						((Aexpr2Context)_localctx).a2 = aexpr2(2);
						 ((Aexpr2Context)_localctx).sv =  ((Aexpr2Context)_localctx).a1.sv / ((Aexpr2Context)_localctx).a2.sv; 
						}
						break;
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return aexpr_sempred((AexprContext)_localctx, predIndex);
		case 4:
			return aexpr2_sempred((Aexpr2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean aexpr2_sempred(Aexpr2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\26"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6:\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6F\n\6\f"+
		"\6\16\6I\13\6\3\6\2\4\b\n\7\2\4\6\b\n\2\2\2L\2\f\3\2\2\2\4\25\3\2\2\2"+
		"\6\37\3\2\2\2\b!\3\2\2\2\n9\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17\5\6"+
		"\4\2\17\20\7\3\2\2\20\26\3\2\2\2\21\22\5\6\4\2\22\23\7\3\2\2\23\24\5\4"+
		"\3\2\24\26\3\2\2\2\25\16\3\2\2\2\25\21\3\2\2\2\26\5\3\2\2\2\27\30\5\b"+
		"\5\2\30\31\b\4\1\2\31 \3\2\2\2\32\33\7\n\2\2\33\34\7\4\2\2\34\35\5\b\5"+
		"\2\35\36\b\4\1\2\36 \3\2\2\2\37\27\3\2\2\2\37\32\3\2\2\2 \7\3\2\2\2!\""+
		"\b\5\1\2\"#\5\n\6\2#$\b\5\1\2$\61\3\2\2\2%&\f\4\2\2&\'\7\5\2\2\'(\5\b"+
		"\5\5()\b\5\1\2)\60\3\2\2\2*+\f\3\2\2+,\7\6\2\2,-\5\b\5\4-.\b\5\1\2.\60"+
		"\3\2\2\2/%\3\2\2\2/*\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\t\3\2\2\2\63\61\3\2\2\2\64\65\b\6\1\2\65\66\7\t\2\2\66:\b\6\1\2\678\7"+
		"\n\2\28:\b\6\1\29\64\3\2\2\29\67\3\2\2\2:G\3\2\2\2;<\f\4\2\2<=\7\7\2\2"+
		"=>\5\n\6\5>?\b\6\1\2?F\3\2\2\2@A\f\3\2\2AB\7\b\2\2BC\5\n\6\4CD\b\6\1\2"+
		"DF\3\2\2\2E;\3\2\2\2E@\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2"+
		"\2IG\3\2\2\2\t\25\37/\619EG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}