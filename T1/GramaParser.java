// Generated from Grama.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, DECLARE=2, LEIA=3, ESCREVA=4, FIM_ALGORITMO=5, LITERAL=6, 
		INTEIRO=7, REAL=8, SOMA=9, DIV=10, SUB=11, MULT=12, RESTO=13, ASSIGN=14, 
		E=15, LOGICO=16, NAO=17, OU=18, SENAO=19, ENTAO=20, FIMSE=21, SE=22, CASO=23, 
		SEJA=24, FIMCASO=25, PARA=26, ATE=27, FACA=28, FIMPARA=29, CONT=30, ENQUANTO=31, 
		FIMENQNT=32, ENDERECO=33, ENDERECAMEN=34, REGISTRO=35, FIMREGISTRO=36, 
		PROCEDIMENTO=37, FIMPROC=38, TIPO=39, VARIAVEL=40, FUNCAO=41, FIMFUNCAO=42, 
		RETORNE=43, CONSTANTE=44, TRUE=45, FALSE=46, PONTO=47, NUM_INT=48, NUM_REAL=49, 
		MAIOR=50, MENOR=51, MAIORIGUAL=52, MENORIGUAL=53, IGUAL=54, LESSMORE=55, 
		IDENT=56, CADEIA=57, OPEN_CADEIA=58, COLON=59, COMMA=60, LCOL=61, RCOL=62, 
		LPAREN=63, RPAREN=64, SEMICOLON=65, WS=66, COMMENT=67, OPEN_COMMENT=68, 
		ERRO=69;
	public static final int
		RULE_programa = 0, RULE_blocoAlgoritmo = 1, RULE_declaracoes = 2, RULE_tipo = 3, 
		RULE_comandos = 4, RULE_comando = 5, RULE_leia = 6, RULE_escreva = 7, 
		RULE_expr = 8, RULE_atribuicao = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "blocoAlgoritmo", "declaracoes", "tipo", "comandos", "comando", 
			"leia", "escreva", "expr", "atribuicao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'declare'", "'leia'", "'escreva'", "'fim_algoritmo'", 
			"'literal'", "'inteiro'", "'real'", "'+'", "'/'", "'-'", "'*'", "'%'", 
			"'<-'", "'e'", "'logico'", "'nao'", "'ou'", "'senao'", "'entao'", "'fim_se'", 
			"'se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'ate'", "'faca'", 
			"'fim_para'", "'..'", "'enquanto'", "'fim_enquanto'", "'^'", "'&'", "'registro'", 
			"'fim_registro'", "'procedimento'", "'fim_procedimento'", "'tipo'", "'var'", 
			"'funcao'", "'fim_funcao'", "'retorne'", "'constante'", "'verdadeiro'", 
			"'falso'", "'.'", null, null, "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", 
			null, null, null, "':'", "','", "'['", "']'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "DECLARE", "LEIA", "ESCREVA", "FIM_ALGORITMO", "LITERAL", 
			"INTEIRO", "REAL", "SOMA", "DIV", "SUB", "MULT", "RESTO", "ASSIGN", "E", 
			"LOGICO", "NAO", "OU", "SENAO", "ENTAO", "FIMSE", "SE", "CASO", "SEJA", 
			"FIMCASO", "PARA", "ATE", "FACA", "FIMPARA", "CONT", "ENQUANTO", "FIMENQNT", 
			"ENDERECO", "ENDERECAMEN", "REGISTRO", "FIMREGISTRO", "PROCEDIMENTO", 
			"FIMPROC", "TIPO", "VARIAVEL", "FUNCAO", "FIMFUNCAO", "RETORNE", "CONSTANTE", 
			"TRUE", "FALSE", "PONTO", "NUM_INT", "NUM_REAL", "MAIOR", "MENOR", "MAIORIGUAL", 
			"MENORIGUAL", "IGUAL", "LESSMORE", "IDENT", "CADEIA", "OPEN_CADEIA", 
			"COLON", "COMMA", "LCOL", "RCOL", "LPAREN", "RPAREN", "SEMICOLON", "WS", 
			"COMMENT", "OPEN_COMMENT", "ERRO"
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
	public String getGrammarFileName() { return "Grama.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BlocoAlgoritmoContext blocoAlgoritmo() {
			return getRuleContext(BlocoAlgoritmoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			blocoAlgoritmo();
			setState(21);
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
	public static class BlocoAlgoritmoContext extends ParserRuleContext {
		public TerminalNode ALGORITMO() { return getToken(GramaParser.ALGORITMO, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(GramaParser.FIM_ALGORITMO, 0); }
		public BlocoAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterBlocoAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitBlocoAlgoritmo(this);
		}
	}

	public final BlocoAlgoritmoContext blocoAlgoritmo() throws RecognitionException {
		BlocoAlgoritmoContext _localctx = new BlocoAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blocoAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(ALGORITMO);
			setState(24);
			declaracoes();
			setState(25);
			comandos();
			setState(26);
			match(FIM_ALGORITMO);
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
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<TerminalNode> DECLARE() { return getTokens(GramaParser.DECLARE); }
		public TerminalNode DECLARE(int i) {
			return getToken(GramaParser.DECLARE, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(GramaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GramaParser.IDENT, i);
		}
		public List<TerminalNode> COLON() { return getTokens(GramaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GramaParser.COLON, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaParser.SEMICOLON, i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE) {
				{
				{
				setState(28);
				match(DECLARE);
				setState(29);
				match(IDENT);
				setState(30);
				match(COLON);
				setState(31);
				tipo();
				setState(32);
				match(SEMICOLON);
				}
				}
				setState(38);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(GramaParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(GramaParser.INTEIRO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==INTEIRO) ) {
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
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaParser.SEMICOLON, i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594037927960L) != 0)) {
				{
				{
				setState(41);
				comando();
				setState(42);
				match(SEMICOLON);
				}
				}
				setState(48);
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
	public static class ComandoContext extends ParserRuleContext {
		public LeiaContext leia() {
			return getRuleContext(LeiaContext.class,0);
		}
		public EscrevaContext escreva() {
			return getRuleContext(EscrevaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comando);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				leia();
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				escreva();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				atribuicao();
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
	public static class LeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(GramaParser.LEIA, 0); }
		public TerminalNode LPAREN() { return getToken(GramaParser.LPAREN, 0); }
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public TerminalNode RPAREN() { return getToken(GramaParser.RPAREN, 0); }
		public LeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitLeia(this);
		}
	}

	public final LeiaContext leia() throws RecognitionException {
		LeiaContext _localctx = new LeiaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_leia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LEIA);
			setState(55);
			match(LPAREN);
			setState(56);
			match(IDENT);
			setState(57);
			match(RPAREN);
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
	public static class EscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(GramaParser.ESCREVA, 0); }
		public TerminalNode LPAREN() { return getToken(GramaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaParser.RPAREN, 0); }
		public EscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitEscreva(this);
		}
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ESCREVA);
			setState(60);
			match(LPAREN);
			setState(61);
			expr();
			setState(62);
			match(RPAREN);
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
		public TerminalNode CADEIA() { return getToken(GramaParser.CADEIA, 0); }
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==CADEIA) ) {
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(GramaParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IDENT);
			setState(67);
			match(COLON);
			setState(68);
			expr();
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
		"\u0004\u0001EG\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002#\b\u0002\n\u0002"+
		"\f\u0002&\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004-\b\u0004\n\u0004\f\u00040\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u00055\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000"+
		"\u0002\u0001\u0000\u0006\u0007\u0001\u000089@\u0000\u0014\u0001\u0000"+
		"\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000"+
		"\u0000\u0006\'\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000\n4\u0001"+
		"\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000\u000e;\u0001\u0000\u0000"+
		"\u0000\u0010@\u0001\u0000\u0000\u0000\u0012B\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016"+
		"\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000\u0018"+
		"\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0003\b\u0004\u0000\u001a\u001b"+
		"\u0005\u0005\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0002\u0000\u0000\u001d\u001e\u00058\u0000\u0000\u001e\u001f\u0005"+
		";\u0000\u0000\u001f \u0003\u0006\u0003\u0000 !\u0005A\u0000\u0000!#\u0001"+
		"\u0000\u0000\u0000\"\u001c\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0005\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0007\u0000\u0000\u0000"+
		"(\u0007\u0001\u0000\u0000\u0000)*\u0003\n\u0005\u0000*+\u0005A\u0000\u0000"+
		"+-\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\t\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000015\u0003\f\u0006\u000025\u0003\u000e"+
		"\u0007\u000035\u0003\u0012\t\u000041\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000043\u0001\u0000\u0000\u00005\u000b\u0001\u0000\u0000\u0000"+
		"67\u0005\u0003\u0000\u000078\u0005?\u0000\u000089\u00058\u0000\u00009"+
		":\u0005@\u0000\u0000:\r\u0001\u0000\u0000\u0000;<\u0005\u0004\u0000\u0000"+
		"<=\u0005?\u0000\u0000=>\u0003\u0010\b\u0000>?\u0005@\u0000\u0000?\u000f"+
		"\u0001\u0000\u0000\u0000@A\u0007\u0001\u0000\u0000A\u0011\u0001\u0000"+
		"\u0000\u0000BC\u00058\u0000\u0000CD\u0005;\u0000\u0000DE\u0003\u0010\b"+
		"\u0000E\u0013\u0001\u0000\u0000\u0000\u0003$.4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}