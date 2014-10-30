// Generated from E:\generuse-project\generuse\src\grammar\GeneruseLexerRules.g4 by ANTLR 4.1
package com.generuse.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneruseLexerRules extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LB=2, RB=3, LP=4, RP=5, LC=6, RC=7, PERIOD=8, USECASE=9, STATE=10, 
		ACTION=11, OBJECT=12, FORMULA=13, IMPORT=14, NEEDS=15, PRECONDITION=16, 
		MEMBER_SEP=17, WITH=18, USING=19, DO=20, GIVING=21, GROUP=22, BE=23, COLON=24, 
		SEMI=25, BRANCH=26, TRUE=27, FALSE=28, DIV=29, MUL=30, MOD=31, PLUS=32, 
		MINUS=33, EQUALS=34, AND=35, OR=36, NOT=37, GT=38, LT=39, GTE=40, LTE=41, 
		NEQ=42, ACTORS=43, ARTICLE=44, AUX_VERB=45, INT=46, STRING=47, FLOAT=48, 
		WORD=49, WS=50, SEP=51, LETTER=52, DIGIT=53, ACTOR_SEP=54, ACTOR_WORD=55, 
		ACTOR_WS=56, ACTOR_RB=57;
	public static final int ACTORS_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "ACTORS_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "'['", "RB", "'('", "')'", "'{'", "'}'", "'.'", "'usecase'", 
		"'state'", "'action'", "'object'", "'formula'", "'import'", "'needs'", 
		"'pre-condition'", "''s'", "'with'", "'using'", "'do'", "'giving'", "'group'", 
		"'be'", "':'", "';'", "'branch'", "'true'", "'false'", "'/'", "'*'", "'mod'", 
		"'+'", "'-'", "'='", "'and'", "'or'", "'not'", "'>'", "'<'", "'>='", "'<='", 
		"'not='", "'actors'", "ARTICLE", "AUX_VERB", "INT", "STRING", "FLOAT", 
		"WORD", "WS", "SEP", "LETTER", "DIGIT", "ACTOR_SEP", "ACTOR_WORD", "ACTOR_WS", 
		"ACTOR_RB"
	};
	public static final String[] ruleNames = {
		"COMMENT", "LB", "RB", "LP", "RP", "LC", "RC", "PERIOD", "USECASE", "STATE", 
		"ACTION", "OBJECT", "FORMULA", "IMPORT", "NEEDS", "PRECONDITION", "MEMBER_SEP", 
		"WITH", "USING", "DO", "GIVING", "GROUP", "BE", "COLON", "SEMI", "BRANCH", 
		"TRUE", "FALSE", "DIV", "MUL", "MOD", "PLUS", "MINUS", "EQUALS", "AND", 
		"OR", "NOT", "GT", "LT", "GTE", "LTE", "NEQ", "ACTORS", "ARTICLE", "AUX_VERB", 
		"INT", "STRING", "FLOAT", "WORD", "WS", "SEP", "ESC", "LETTER", "DIGIT", 
		"ACTOR_SEP", "ACTOR_WORD", "ACTOR_WS", "ACTOR_RB"
	};


	public GeneruseLexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GeneruseLexerRules.g4"; }

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
		case 0: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 42: ACTORS_action((RuleContext)_localctx, actionIndex); break;

		case 49: WS_action((RuleContext)_localctx, actionIndex); break;

		case 56: ACTOR_WS_action((RuleContext)_localctx, actionIndex); break;

		case 57: ACTOR_RB_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ACTOR_RB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: popMode();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void ACTOR_WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void ACTORS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: pushMode(ACTORS_MODE);  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2;\u01be\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\7"+
		"\2{\n\2\f\2\16\2~\13\2\3\2\3\2\3\2\7\2\u0083\n\2\f\2\16\2\u0086\13\2\3"+
		"\2\5\2\u0089\n\2\3\2\5\2\u008c\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\5-\u014b\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0158\n.\5.\u015a"+
		"\n.\3/\6/\u015d\n/\r/\16/\u015e\3\60\3\60\3\60\7\60\u0164\n\60\f\60\16"+
		"\60\u0167\13\60\3\60\3\60\3\61\6\61\u016c\n\61\r\61\16\61\u016d\3\61\3"+
		"\61\6\61\u0172\n\61\r\61\16\61\u0173\3\61\3\61\6\61\u0178\n\61\r\61\16"+
		"\61\u0179\5\61\u017c\n\61\3\62\3\62\5\62\u0180\n\62\3\62\3\62\3\62\7\62"+
		"\u0185\n\62\f\62\16\62\u0188\13\62\3\63\6\63\u018b\n\63\r\63\16\63\u018c"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\6\64\u0195\n\64\r\64\16\64\u0196\3\65\3"+
		"\65\3\65\3\65\5\65\u019d\n\65\3\66\3\66\3\67\3\67\38\68\u01a4\n8\r8\16"+
		"8\u01a5\39\39\59\u01aa\n9\39\39\39\79\u01af\n9\f9\169\u01b2\139\3:\6:"+
		"\u01b5\n:\r:\16:\u01b6\3:\3:\3;\3;\3;\3;\3\u0165<\4\3\2\6\4\1\b\5\1\n"+
		"\6\1\f\7\1\16\b\1\20\t\1\22\n\1\24\13\1\26\f\1\30\r\1\32\16\1\34\17\1"+
		"\36\20\1 \21\1\"\22\1$\23\1&\24\1(\25\1*\26\1,\27\1.\30\1\60\31\1\62\32"+
		"\1\64\33\1\66\34\18\35\1:\36\1<\37\1> \1@!\1B\"\1D#\1F$\1H%\1J&\1L\'\1"+
		"N(\1P)\1R*\1T+\1V,\1X-\3Z.\1\\/\1^\60\1`\61\1b\62\1d\63\1f\64\4h\65\1"+
		"j\2\1l\66\1n\67\1p8\1r9\1t:\5v;\6\4\2\3\t\5\2\f\f\17\17%%\5\2##//AA\5"+
		"\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\4\2\13\13..\5\2\f\f\17\17\"\"\u01d9"+
		"\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2"+
		"\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2"+
		"\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2"+
		"\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2"+
		"\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2"+
		"\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2"+
		"\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V"+
		"\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3"+
		"\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\3p\3\2\2"+
		"\2\3r\3\2\2\2\3t\3\2\2\2\3v\3\2\2\2\4\u008b\3\2\2\2\6\u008f\3\2\2\2\b"+
		"\u0091\3\2\2\2\n\u0093\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2\2\20\u0099"+
		"\3\2\2\2\22\u009b\3\2\2\2\24\u009d\3\2\2\2\26\u00a5\3\2\2\2\30\u00ab\3"+
		"\2\2\2\32\u00b2\3\2\2\2\34\u00b9\3\2\2\2\36\u00c1\3\2\2\2 \u00c8\3\2\2"+
		"\2\"\u00ce\3\2\2\2$\u00dc\3\2\2\2&\u00df\3\2\2\2(\u00e4\3\2\2\2*\u00ea"+
		"\3\2\2\2,\u00ed\3\2\2\2.\u00f4\3\2\2\2\60\u00fa\3\2\2\2\62\u00fd\3\2\2"+
		"\2\64\u00ff\3\2\2\2\66\u0101\3\2\2\28\u0108\3\2\2\2:\u010d\3\2\2\2<\u0113"+
		"\3\2\2\2>\u0115\3\2\2\2@\u0117\3\2\2\2B\u011b\3\2\2\2D\u011d\3\2\2\2F"+
		"\u011f\3\2\2\2H\u0121\3\2\2\2J\u0125\3\2\2\2L\u0128\3\2\2\2N\u012c\3\2"+
		"\2\2P\u012e\3\2\2\2R\u0130\3\2\2\2T\u0133\3\2\2\2V\u0136\3\2\2\2X\u013b"+
		"\3\2\2\2Z\u014a\3\2\2\2\\\u0159\3\2\2\2^\u015c\3\2\2\2`\u0160\3\2\2\2"+
		"b\u017b\3\2\2\2d\u017f\3\2\2\2f\u018a\3\2\2\2h\u0194\3\2\2\2j\u019c\3"+
		"\2\2\2l\u019e\3\2\2\2n\u01a0\3\2\2\2p\u01a3\3\2\2\2r\u01a9\3\2\2\2t\u01b4"+
		"\3\2\2\2v\u01ba\3\2\2\2x|\7%\2\2y{\n\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u008c\7%\2\2\u0080\u0084\7%\2"+
		"\2\u0081\u0083\n\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0089\7\17\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u008c\7\f\2\2\u008bx\3\2\2\2\u008b\u0080\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\b\2\2\2\u008e\5\3\2\2\2\u008f\u0090\7]\2\2\u0090"+
		"\7\3\2\2\2\u0091\u0092\7_\2\2\u0092\t\3\2\2\2\u0093\u0094\7*\2\2\u0094"+
		"\13\3\2\2\2\u0095\u0096\7+\2\2\u0096\r\3\2\2\2\u0097\u0098\7}\2\2\u0098"+
		"\17\3\2\2\2\u0099\u009a\7\177\2\2\u009a\21\3\2\2\2\u009b\u009c\7\60\2"+
		"\2\u009c\23\3\2\2\2\u009d\u009e\7w\2\2\u009e\u009f\7u\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa\27\3\2\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7k\2\2"+
		"\u00af\u00b0\7q\2\2\u00b0\u00b1\7p\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\7"+
		"q\2\2\u00b3\u00b4\7d\2\2\u00b4\u00b5\7l\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7e\2\2\u00b7\u00b8\7v\2\2\u00b8\33\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7c\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7o\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7t\2\2"+
		"\u00c6\u00c7\7v\2\2\u00c7\37\3\2\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7"+
		"g\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7u\2\2\u00cd!"+
		"\3\2\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7/\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2"+
		"\u00d5\u00d6\7f\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2\u00db#\3\2\2\2\u00dc\u00dd"+
		"\7)\2\2\u00dd\u00de\7u\2\2\u00de%\3\2\2\2\u00df\u00e0\7y\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7j\2\2\u00e3\'\3\2\2\2\u00e4\u00e5"+
		"\7w\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7i\2\2\u00e9)\3\2\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"+\3\2\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7x\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7i\2\2\u00f3-\3\2\2\2\u00f4"+
		"\u00f5\7i\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7w\2\2"+
		"\u00f8\u00f9\7r\2\2\u00f9/\3\2\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7g\2"+
		"\2\u00fc\61\3\2\2\2\u00fd\u00fe\7<\2\2\u00fe\63\3\2\2\2\u00ff\u0100\7"+
		"=\2\2\u0100\65\3\2\2\2\u0101\u0102\7d\2\2\u0102\u0103\7t\2\2\u0103\u0104"+
		"\7c\2\2\u0104\u0105\7p\2\2\u0105\u0106\7e\2\2\u0106\u0107\7j\2\2\u0107"+
		"\67\3\2\2\2\u0108\u0109\7v\2\2\u0109\u010a\7t\2\2\u010a\u010b\7w\2\2\u010b"+
		"\u010c\7g\2\2\u010c9\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7c\2\2\u010f"+
		"\u0110\7n\2\2\u0110\u0111\7u\2\2\u0111\u0112\7g\2\2\u0112;\3\2\2\2\u0113"+
		"\u0114\7\61\2\2\u0114=\3\2\2\2\u0115\u0116\7,\2\2\u0116?\3\2\2\2\u0117"+
		"\u0118\7o\2\2\u0118\u0119\7q\2\2\u0119\u011a\7f\2\2\u011aA\3\2\2\2\u011b"+
		"\u011c\7-\2\2\u011cC\3\2\2\2\u011d\u011e\7/\2\2\u011eE\3\2\2\2\u011f\u0120"+
		"\7?\2\2\u0120G\3\2\2\2\u0121\u0122\7c\2\2\u0122\u0123\7p\2\2\u0123\u0124"+
		"\7f\2\2\u0124I\3\2\2\2\u0125\u0126\7q\2\2\u0126\u0127\7t\2\2\u0127K\3"+
		"\2\2\2\u0128\u0129\7p\2\2\u0129\u012a\7q\2\2\u012a\u012b\7v\2\2\u012b"+
		"M\3\2\2\2\u012c\u012d\7@\2\2\u012dO\3\2\2\2\u012e\u012f\7>\2\2\u012fQ"+
		"\3\2\2\2\u0130\u0131\7@\2\2\u0131\u0132\7?\2\2\u0132S\3\2\2\2\u0133\u0134"+
		"\7>\2\2\u0134\u0135\7?\2\2\u0135U\3\2\2\2\u0136\u0137\7p\2\2\u0137\u0138"+
		"\7q\2\2\u0138\u0139\7v\2\2\u0139\u013a\7?\2\2\u013aW\3\2\2\2\u013b\u013c"+
		"\7c\2\2\u013c\u013d\7e\2\2\u013d\u013e\7v\2\2\u013e\u013f\7q\2\2\u013f"+
		"\u0140\7t\2\2\u0140\u0141\7u\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b,\3"+
		"\2\u0143Y\3\2\2\2\u0144\u014b\7c\2\2\u0145\u0146\7c\2\2\u0146\u014b\7"+
		"p\2\2\u0147\u0148\7v\2\2\u0148\u0149\7j\2\2\u0149\u014b\7g\2\2\u014a\u0144"+
		"\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0147\3\2\2\2\u014b[\3\2\2\2\u014c"+
		"\u014d\7k\2\2\u014d\u015a\7u\2\2\u014e\u014f\7y\2\2\u014f\u0150\7c\2\2"+
		"\u0150\u015a\7u\2\2\u0151\u0152\7o\2\2\u0152\u0153\7w\2\2\u0153\u0154"+
		"\7u\2\2\u0154\u0155\7v\2\2\u0155\u0157\3\2\2\2\u0156\u0158\5\60\30\2\u0157"+
		"\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u014c\3\2"+
		"\2\2\u0159\u014e\3\2\2\2\u0159\u0151\3\2\2\2\u015a]\3\2\2\2\u015b\u015d"+
		"\5n\67\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f_\3\2\2\2\u0160\u0165\7$\2\2\u0161\u0164\5j\65\2\u0162"+
		"\u0164\13\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\7$\2\2\u0169a\3\2\2\2\u016a\u016c\5n\67\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0171\7\60\2\2\u0170\u0172\5n\67\2\u0171"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u017c\3\2\2\2\u0175\u0177\7\60\2\2\u0176\u0178\5n\67\2\u0177"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017c\3\2\2\2\u017b\u016b\3\2\2\2\u017b\u0175\3\2\2\2\u017c"+
		"c\3\2\2\2\u017d\u0180\5l\66\2\u017e\u0180\5n\67\2\u017f\u017d\3\2\2\2"+
		"\u017f\u017e\3\2\2\2\u0180\u0186\3\2\2\2\u0181\u0185\5l\66\2\u0182\u0185"+
		"\5n\67\2\u0183\u0185\t\3\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187e\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\t\4\2\2\u018a\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\b\63\4\2\u018fg\3\2\2\2\u0190\u0195\7.\2\2"+
		"\u0191\u0192\7c\2\2\u0192\u0193\7p\2\2\u0193\u0195\7f\2\2\u0194\u0190"+
		"\3\2\2\2\u0194\u0191\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197i\3\2\2\2\u0198\u0199\7^\2\2\u0199\u019d\7$\2\2\u019a"+
		"\u019b\7^\2\2\u019b\u019d\7^\2\2\u019c\u0198\3\2\2\2\u019c\u019a\3\2\2"+
		"\2\u019dk\3\2\2\2\u019e\u019f\t\5\2\2\u019fm\3\2\2\2\u01a0\u01a1\t\6\2"+
		"\2\u01a1o\3\2\2\2\u01a2\u01a4\t\7\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6q\3\2\2\2\u01a7"+
		"\u01aa\5l\66\2\u01a8\u01aa\5n\67\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2"+
		"\2\2\u01aa\u01b0\3\2\2\2\u01ab\u01af\5l\66\2\u01ac\u01af\5n\67\2\u01ad"+
		"\u01af\t\3\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2"+
		"\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"s\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\t\b\2\2\u01b4\u01b3\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b9\b:\5\2\u01b9u\3\2\2\2\u01ba\u01bb\7_\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\b;\6\2\u01bdw\3\2\2\2\36\2\3|\u0084\u0088\u008b\u014a"+
		"\u0157\u0159\u015e\u0163\u0165\u016d\u0173\u0179\u017b\u017f\u0184\u0186"+
		"\u018c\u0194\u0196\u019c\u01a5\u01a9\u01ae\u01b0\u01b6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}