package com.xjtu.mvccalc.service;

// Generated from Calc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class CalcLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__1 = 1, T__0 = 2, NUMBER = 3, COMMENT = 4, LINE_COMMENT = 5, WS = 6, MUL = 7, DIV = 8,
			ADD = 9, SUB = 10;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'",
			"'\\u0005'", "'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'" };
	public static final String[] ruleNames = { "T__1", "T__0", "NUMBER", "COMMENT", "LINE_COMMENT", "WS", "MUL", "DIV",
			"ADD", "SUB" };

	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

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
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f^\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\3\2\3\2\3\3\3\3\3\4\6\4\35\n\4\r\4\16\4\36\3\4\3\4\6\4#\n\4\r\4\16"
			+ "\4$\5\4\'\n\4\5\4)\n\4\3\4\6\4,\n\4\r\4\16\4-\5\4\60\n\4\3\5\3\5\3\5\3"
			+ "\5\7\5\66\n\5\f\5\16\59\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6D"
			+ "\n\6\f\6\16\6G\13\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\6\3\7\6\7Q\n\7\r\7\16\7"
			+ "R\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\4\67E\2\f\3\3\5\4\7\5\t\6"
			+ "\13\7\r\b\17\t\21\n\23\13\25\f\3\2\4\3\2\62;\5\2\13\f\17\17\"\"g\2\3\3"
			+ "\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"
			+ "\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3"
			+ "\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13?\3\2\2\2\rP\3\2\2\2\17V\3\2\2\2\21X"
			+ "\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27\30\7*\2\2\30\4\3\2\2\2\31\32\7+\2"
			+ "\2\32\6\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2"
			+ "\2\36\37\3\2\2\2\37(\3\2\2\2 &\7\60\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2\2"
			+ "$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&\"\3\2\2\2&\'\3\2\2\2\')\3\2\2\2( \3"
			+ "\2\2\2()\3\2\2\2)\60\3\2\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-"
			+ ".\3\2\2\2.\60\3\2\2\2/\34\3\2\2\2/+\3\2\2\2\60\b\3\2\2\2\61\62\7\61\2"
			+ "\2\62\63\7,\2\2\63\67\3\2\2\2\64\66\13\2\2\2\65\64\3\2\2\2\669\3\2\2\2"
			+ "\678\3\2\2\2\67\65\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7,\2\2;<\7\61\2\2<"
			+ "=\3\2\2\2=>\b\5\2\2>\n\3\2\2\2?@\7\61\2\2@A\7\61\2\2AE\3\2\2\2BD\13\2"
			+ "\2\2CB\3\2\2\2DG\3\2\2\2EF\3\2\2\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2HJ\7\17"
			+ "\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\f\2\2LM\3\2\2\2MN\b\6\2\2N\f\3"
			+ "\2\2\2OQ\t\3\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b"
			+ "\7\2\2U\16\3\2\2\2VW\7,\2\2W\20\3\2\2\2XY\7\61\2\2Y\22\3\2\2\2Z[\7-\2"
			+ "\2[\24\3\2\2\2\\]\7/\2\2]\26\3\2\2\2\r\2\36$&(-/\67EIR\3\b\2\2";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}