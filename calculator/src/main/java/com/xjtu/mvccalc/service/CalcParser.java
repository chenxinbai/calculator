package com.xjtu.mvccalc.service;

// Generated from Calc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class CalcParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__1 = 1, T__0 = 2, NUMBER = 3, COMMENT = 4, LINE_COMMENT = 5, WS = 6, MUL = 7, DIV = 8,
			ADD = 9, SUB = 10;
	public static final String[] tokenNames = { "<INVALID>", "'('", "')'", "NUMBER", "COMMENT", "LINE_COMMENT", "WS",
			"'*'", "'/'", "'+'", "'-'" };
	public static final int RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	public static final String[] ruleNames = { "prog", "stat", "expr" };

	@Override
	public String getGrammarFileName() {
		return "Calc.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class, i);
		}

		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}

		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_prog;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitProg(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(6);
							stat();
						}
					}
					setState(9);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0
						&& ((1L << _la) & ((1L << T__1) | (1L << NUMBER) | (1L << ADD) | (1L << SUB))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stat;
		}

		public StatContext() {
		}

		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public PrintExprContext(StatContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitPrintExpr(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			_localctx = new PrintExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(11);
				expr(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		public ExprContext() {
		}

		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NumberContext extends ExprContext {
		public Token sign;

		public TerminalNode SUB() {
			return getToken(CalcParser.SUB, 0);
		}

		public TerminalNode ADD() {
			return getToken(CalcParser.ADD, 0);
		}

		public TerminalNode NUMBER() {
			return getToken(CalcParser.NUMBER, 0);
		}

		public NumberContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitNumber(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ParensContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitParens(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class MulDivContext extends ExprContext {
		public Token op;

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode DIV() {
			return getToken(CalcParser.DIV, 0);
		}

		public TerminalNode MUL() {
			return getToken(CalcParser.MUL, 0);
		}

		public MulDivContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitMulDiv(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public static class AddSubContext extends ExprContext {
		public Token op;

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode SUB() {
			return getToken(CalcParser.SUB, 0);
		}

		public TerminalNode ADD() {
			return getToken(CalcParser.ADD, 0);
		}

		public AddSubContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalcVisitor)
				return ((CalcVisitor<? extends T>) visitor).visitAddSub(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(22);
				switch (_input.LA(1)) {
				case NUMBER:
				case ADD:
				case SUB: {
					_localctx = new NumberContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;

					setState(15);
					_la = _input.LA(1);
					if (_la == ADD || _la == SUB) {
						{
							setState(14);
							((NumberContext) _localctx).sign = _input.LT(1);
							_la = _input.LA(1);
							if (!(_la == ADD || _la == SUB)) {
								((NumberContext) _localctx).sign = (Token) _errHandler.recoverInline(this);
							}
							consume();
						}
					}

					setState(17);
					match(NUMBER);
				}
					break;
				case T__1: {
					_localctx = new ParensContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(18);
					match(T__1);
					setState(19);
					expr(0);
					setState(20);
					match(T__0);
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(30);
							switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
							case 1: {
								_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
								pushNewRecursionContext(_localctx, _startState, RULE_expr);
								setState(24);
								if (!(precpred(_ctx, 4)))
									throw new FailedPredicateException(this, "precpred(_ctx, 4)");
								setState(25);
								((MulDivContext) _localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if (!(_la == MUL || _la == DIV)) {
									((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
								}
								consume();
								setState(26);
								expr(4);
							}
								break;
							case 2: {
								_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
								pushNewRecursionContext(_localctx, _startState, RULE_expr);
								setState(27);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this, "precpred(_ctx, 3)");
								setState(28);
								((AddSubContext) _localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if (!(_la == ADD || _la == SUB)) {
									((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
								}
								consume();
								setState(29);
								expr(4);
							}
								break;
							}
						}
					}
					setState(34);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f&\4\2\t\2\4\3\t"
			+ "\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\4\3\4\5\4\22\n\4\3\4\3"
			+ "\4\3\4\3\4\3\4\5\4\31\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13"
			+ "\4\3\4\2\3\6\5\2\4\6\2\4\3\2\13\f\3\2\t\n\'\2\t\3\2\2\2\4\r\3\2\2\2\6"
			+ "\30\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2"
			+ "\2\2\f\3\3\2\2\2\r\16\5\6\4\2\16\5\3\2\2\2\17\21\b\4\1\2\20\22\t\2\2\2"
			+ "\21\20\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\31\7\5\2\2\24\25\7\3\2\2"
			+ "\25\26\5\6\4\2\26\27\7\4\2\2\27\31\3\2\2\2\30\17\3\2\2\2\30\24\3\2\2\2"
			+ "\31\"\3\2\2\2\32\33\f\6\2\2\33\34\t\3\2\2\34!\5\6\4\6\35\36\f\5\2\2\36"
			+ "\37\t\2\2\2\37!\5\6\4\6 \32\3\2\2\2 \35\3\2\2\2!$\3\2\2\2\" \3\2\2\2\""
			+ "#\3\2\2\2#\7\3\2\2\2$\"\3\2\2\2\7\13\21\30 \"";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}