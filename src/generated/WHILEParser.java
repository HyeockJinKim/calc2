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
		T__0=1, T__1=2, T__2=3, T__3=4, N=5, IDENT=6, WS=7;
	public static final int
		RULE_program = 0, RULE_aexpr = 1, RULE_aexpr2 = 2;
	public static final String[] ruleNames = {
		"program", "aexpr", "aexpr2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "N", "IDENT", "WS"
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
		public AexprContext aexpr;
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
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
			setState(6);
			((ProgramContext)_localctx).aexpr = aexpr(0);
			 int result = ((ProgramContext)_localctx).aexpr.sv; System.out.println(result); 
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_aexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(10);
			((AexprContext)_localctx).aexpr2 = aexpr2(0);
			 ((AexprContext)_localctx).sv =  ((AexprContext)_localctx).aexpr2.sv; 
			}
			_ctx.stop = _input.LT(-1);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(23);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(13);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(14);
						match(T__0);
						setState(15);
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
						setState(18);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(19);
						match(T__1);
						setState(20);
						((AexprContext)_localctx).a2 = aexpr(2);
						 ((AexprContext)_localctx).sv =  ((AexprContext)_localctx).a1.sv - ((AexprContext)_localctx).a2.sv; 
						}
						break;
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_aexpr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N:
				{
				setState(29);
				((Aexpr2Context)_localctx).N = match(N);
				 String n = ((Aexpr2Context)_localctx).N.getText(); ((Aexpr2Context)_localctx).sv =  Integer.parseInt(n); 
				}
				break;
			case IDENT:
				{
				setState(31);
				((Aexpr2Context)_localctx).IDENT = match(IDENT);
				 String id = ((Aexpr2Context)_localctx).IDENT.getText(); ((Aexpr2Context)_localctx).sv =  map.get(id); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Aexpr2Context(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr2);
						setState(35);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(36);
						match(T__2);
						setState(37);
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
						setState(40);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(41);
						match(T__3);
						setState(42);
						((Aexpr2Context)_localctx).a2 = aexpr2(2);
						 ((Aexpr2Context)_localctx).sv =  ((Aexpr2Context)_localctx).a1.sv / ((Aexpr2Context)_localctx).a2.sv; 
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		case 1:
			return aexpr_sempred((AexprContext)_localctx, predIndex);
		case 2:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4\3\4"+
		"\2\4\4\6\5\2\4\6\2\2\2\66\2\b\3\2\2\2\4\13\3\2\2\2\6#\3\2\2\2\b\t\5\4"+
		"\3\2\t\n\b\2\1\2\n\3\3\2\2\2\13\f\b\3\1\2\f\r\5\6\4\2\r\16\b\3\1\2\16"+
		"\33\3\2\2\2\17\20\f\4\2\2\20\21\7\3\2\2\21\22\5\4\3\5\22\23\b\3\1\2\23"+
		"\32\3\2\2\2\24\25\f\3\2\2\25\26\7\4\2\2\26\27\5\4\3\4\27\30\b\3\1\2\30"+
		"\32\3\2\2\2\31\17\3\2\2\2\31\24\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33"+
		"\34\3\2\2\2\34\5\3\2\2\2\35\33\3\2\2\2\36\37\b\4\1\2\37 \7\7\2\2 $\b\4"+
		"\1\2!\"\7\b\2\2\"$\b\4\1\2#\36\3\2\2\2#!\3\2\2\2$\61\3\2\2\2%&\f\4\2\2"+
		"&\'\7\5\2\2\'(\5\6\4\5()\b\4\1\2)\60\3\2\2\2*+\f\3\2\2+,\7\6\2\2,-\5\6"+
		"\4\4-.\b\4\1\2.\60\3\2\2\2/%\3\2\2\2/*\3\2\2\2\60\63\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62\7\3\2\2\2\63\61\3\2\2\2\7\31\33#/\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}