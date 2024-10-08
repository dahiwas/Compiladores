// Generated from grupo/compiladores/t5/Grama.g4 by ANTLR 4.13.1
package grupo.compiladores.t5;
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
		ALGORITMO=1, FIM_ALGORITMO=2, DECLARE=3, LEIA=4, ESCREVA=5, LITERAL=6, 
		INTEIRO=7, REAL=8, E=9, LOGICO=10, NAO=11, OU=12, SENAO=13, ENTAO=14, 
		SE=15, FIMSE=16, CASO=17, SEJA=18, FIMCASO=19, PARA=20, ATE=21, FACA=22, 
		FIMPARA=23, ENQUANTO=24, FIMENQNT=25, REGISTRO=26, FIMREGISTRO=27, PROCEDIMENTO=28, 
		FIMPROC=29, TIPO=30, VARIAVEL=31, FUNCAO=32, FIMFUNCAO=33, RETORNE=34, 
		CONSTANTE=35, TRUE=36, FALSE=37, SOMA=38, DIV=39, SUB=40, MULT=41, RESTO=42, 
		ASSIGN=43, CONT=44, PONTEIRO=45, ENDERECAMEN=46, PONTO=47, MAIOR=48, MENOR=49, 
		MAIORIGUAL=50, MENORIGUAL=51, IGUAL=52, LESSMORE=53, COLON=54, COMMA=55, 
		LCOL=56, RCOL=57, LPAREN=58, RPAREN=59, SEMICOLON=60, WS=61, CADEIA=62, 
		OPEN_CADEIA=63, COMMENT=64, OPEN_COMMENT=65, IDENT=66, NUM_INT=67, NUM_REAL=68, 
		ERRO=69;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico = 8, RULE_tipo_basico_ident = 9, RULE_tipo_estendido = 10, 
		RULE_valor_constante = 11, RULE_registro = 12, RULE_declaracao_global = 13, 
		RULE_parametro = 14, RULE_parametros = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_cmdLeia = 18, RULE_cmdEscreva = 19, RULE_cmdSe = 20, RULE_cmdCaso = 21, 
		RULE_cmdPara = 22, RULE_cmdEnquanto = 23, RULE_cmdFaca = 24, RULE_cmdAtribuicao = 25, 
		RULE_cmdChamada = 26, RULE_cmdRetorne = 27, RULE_selecao = 28, RULE_item_selecao = 29, 
		RULE_constantes = 30, RULE_numero_intervalo = 31, RULE_op_unario = 32, 
		RULE_exp_aritmetica = 33, RULE_termo = 34, RULE_fator = 35, RULE_op1 = 36, 
		RULE_op2 = 37, RULE_op3 = 38, RULE_parcela = 39, RULE_parcela_unario = 40, 
		RULE_parcela_nao_unario = 41, RULE_exp_relacional = 42, RULE_op_relacional = 43, 
		RULE_expressao = 44, RULE_termo_logico = 45, RULE_fator_logico = 46, RULE_parcela_logica = 47, 
		RULE_op_logico_1 = 48, RULE_op_logico_2 = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
			"identificador", "dimensao", "tipo", "tipo_basico", "tipo_basico_ident", 
			"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
			"parametro", "parametros", "corpo", "cmd", "cmdLeia", "cmdEscreva", "cmdSe", 
			"cmdCaso", "cmdPara", "cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", 
			"cmdRetorne", "selecao", "item_selecao", "constantes", "numero_intervalo", 
			"op_unario", "exp_aritmetica", "termo", "fator", "op1", "op2", "op3", 
			"parcela", "parcela_unario", "parcela_nao_unario", "exp_relacional", 
			"op_relacional", "expressao", "termo_logico", "fator_logico", "parcela_logica", 
			"op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'leia'", "'escreva'", 
			"'literal'", "'inteiro'", "'real'", "'e'", "'logico'", "'nao'", "'ou'", 
			"'senao'", "'entao'", "'se'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", 
			"'para'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", 
			"'registro'", "'fim_registro'", "'procedimento'", "'fim_procedimento'", 
			"'tipo'", "'var'", "'funcao'", "'fim_funcao'", "'retorne'", "'constante'", 
			"'verdadeiro'", "'falso'", "'+'", "'/'", "'-'", "'*'", "'%'", "'<-'", 
			"'..'", "'^'", "'&'", "'.'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", 
			"':'", "','", "'['", "']'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FIM_ALGORITMO", "DECLARE", "LEIA", "ESCREVA", "LITERAL", 
			"INTEIRO", "REAL", "E", "LOGICO", "NAO", "OU", "SENAO", "ENTAO", "SE", 
			"FIMSE", "CASO", "SEJA", "FIMCASO", "PARA", "ATE", "FACA", "FIMPARA", 
			"ENQUANTO", "FIMENQNT", "REGISTRO", "FIMREGISTRO", "PROCEDIMENTO", "FIMPROC", 
			"TIPO", "VARIAVEL", "FUNCAO", "FIMFUNCAO", "RETORNE", "CONSTANTE", "TRUE", 
			"FALSE", "SOMA", "DIV", "SUB", "MULT", "RESTO", "ASSIGN", "CONT", "PONTEIRO", 
			"ENDERECAMEN", "PONTO", "MAIOR", "MENOR", "MAIORIGUAL", "MENORIGUAL", 
			"IGUAL", "LESSMORE", "COLON", "COMMA", "LCOL", "RCOL", "LPAREN", "RPAREN", 
			"SEMICOLON", "WS", "CADEIA", "OPEN_CADEIA", "COMMENT", "OPEN_COMMENT", 
			"IDENT", "NUM_INT", "NUM_REAL", "ERRO"
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
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(GramaParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(GramaParser.FIM_ALGORITMO, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			declaracoes();
			setState(101);
			match(ALGORITMO);
			setState(102);
			corpo();
			setState(103);
			match(FIM_ALGORITMO);
			setState(104);
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
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 39996882952L) != 0)) {
				{
				{
				setState(106);
				decl_local_global();
				}
				}
				setState(111);
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
	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case TIPO:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				declaracao_global();
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
	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(GramaParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(GramaParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(GramaParser.COLON, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(GramaParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(GramaParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(DECLARE);
				setState(117);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(CONSTANTE);
				setState(119);
				match(IDENT);
				setState(120);
				match(COLON);
				setState(121);
				tipo_basico();
				setState(122);
				match(IGUAL);
				setState(123);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(TIPO);
				setState(126);
				match(IDENT);
				setState(127);
				match(COLON);
				setState(128);
				tipo();
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
	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GramaParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaParser.COMMA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			identificador();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				identificador();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(COLON);
			setState(140);
			tipo();
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
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GramaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GramaParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> PONTO() { return getTokens(GramaParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(GramaParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENT);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(143);
				match(PONTO);
				setState(144);
				match(IDENT);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			dimensao();
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
	public static class DimensaoContext extends ParserRuleContext {
		public List<TerminalNode> LCOL() { return getTokens(GramaParser.LCOL); }
		public TerminalNode LCOL(int i) {
			return getToken(GramaParser.LCOL, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> RCOL() { return getTokens(GramaParser.RCOL); }
		public TerminalNode RCOL(int i) {
			return getToken(GramaParser.RCOL, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LCOL) {
				{
				{
				setState(152);
				match(LCOL);
				setState(153);
				exp_aritmetica();
				setState(154);
				match(RCOL);
				}
				}
				setState(160);
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
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				registro();
				}
				break;
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case PONTEIRO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				tipo_estendido();
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
	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(GramaParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(GramaParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(GramaParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(GramaParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1472L) != 0)) ) {
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
	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_basico_ident);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(IDENT);
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
	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(GramaParser.PONTEIRO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(171);
				match(PONTEIRO);
				}
			}

			setState(174);
			tipo_basico_ident();
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
	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(GramaParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(GramaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(GramaParser.NUM_REAL, 0); }
		public TerminalNode TRUE() { return getToken(GramaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GramaParser.FALSE, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 6509559811L) != 0)) ) {
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
	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(GramaParser.REGISTRO, 0); }
		public TerminalNode FIMREGISTRO() { return getToken(GramaParser.FIMREGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(REGISTRO);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(179);
				variavel();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(FIMREGISTRO);
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
	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(GramaParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(GramaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GramaParser.RPAREN, 0); }
		public TerminalNode FIMPROC() { return getToken(GramaParser.FIMPROC, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(GramaParser.FUNCAO, 0); }
		public TerminalNode COLON() { return getToken(GramaParser.COLON, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIMFUNCAO() { return getToken(GramaParser.FIMFUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao_global);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(PROCEDIMENTO);
				setState(188);
				match(IDENT);
				setState(189);
				match(LPAREN);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIAVEL || _la==IDENT) {
					{
					setState(190);
					parametros();
					}
				}

				setState(193);
				match(RPAREN);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35433480200L) != 0)) {
					{
					{
					setState(194);
					declaracao_local();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
					{
					{
					setState(200);
					cmd();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(FIMPROC);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(FUNCAO);
				setState(208);
				match(IDENT);
				setState(209);
				match(LPAREN);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIAVEL || _la==IDENT) {
					{
					setState(210);
					parametros();
					}
				}

				setState(213);
				match(RPAREN);
				setState(214);
				match(COLON);
				setState(215);
				tipo_estendido();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35433480200L) != 0)) {
					{
					{
					setState(216);
					declaracao_local();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
					{
					{
					setState(222);
					cmd();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(FIMFUNCAO);
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
	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GramaParser.COLON, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(GramaParser.VARIAVEL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaParser.COMMA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIAVEL) {
				{
				setState(232);
				match(VARIAVEL);
				}
			}

			setState(235);
			identificador();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236);
				match(COMMA);
				setState(237);
				identificador();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(COLON);
			setState(244);
			tipo_estendido();
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			parametro();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				parametro();
				}
				}
				setState(253);
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
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35433480200L) != 0)) {
				{
				{
				setState(254);
				declaracao_local();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
				{
				{
				setState(260);
				cmd();
				}
				}
				setState(265);
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
	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(273);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(274);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				cmdRetorne();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(GramaParser.LEIA, 0); }
		public TerminalNode LPAREN() { return getToken(GramaParser.LPAREN, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GramaParser.RPAREN, 0); }
		public List<TerminalNode> PONTEIRO() { return getTokens(GramaParser.PONTEIRO); }
		public TerminalNode PONTEIRO(int i) {
			return getToken(GramaParser.PONTEIRO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaParser.COMMA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LEIA);
			setState(279);
			match(LPAREN);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(280);
				match(PONTEIRO);
				}
			}

			setState(283);
			identificador();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(284);
				match(COMMA);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(285);
					match(PONTEIRO);
					}
				}

				setState(288);
				identificador();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
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
	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(GramaParser.ESCREVA, 0); }
		public TerminalNode LPAREN() { return getToken(GramaParser.LPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GramaParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaParser.COMMA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdEscreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ESCREVA);
			setState(297);
			match(LPAREN);
			setState(298);
			expressao();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(299);
				match(COMMA);
				setState(300);
				expressao();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
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
	public static class CmdSeContext extends ParserRuleContext {
		public CmdContext cmd;
		public List<CmdContext> cmdEntao = new ArrayList<CmdContext>();
		public List<CmdContext> cmdSenao = new ArrayList<CmdContext>();
		public TerminalNode SE() { return getToken(GramaParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(GramaParser.ENTAO, 0); }
		public TerminalNode FIMSE() { return getToken(GramaParser.FIMSE, 0); }
		public TerminalNode SENAO() { return getToken(GramaParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SE);
			setState(309);
			expressao();
			setState(310);
			match(ENTAO);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
				{
				{
				setState(311);
				((CmdSeContext)_localctx).cmd = cmd();
				((CmdSeContext)_localctx).cmdEntao.add(((CmdSeContext)_localctx).cmd);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(317);
				match(SENAO);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
					{
					{
					setState(318);
					((CmdSeContext)_localctx).cmd = cmd();
					((CmdSeContext)_localctx).cmdSenao.add(((CmdSeContext)_localctx).cmd);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(326);
			match(FIMSE);
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
	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(GramaParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(GramaParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIMCASO() { return getToken(GramaParser.FIMCASO, 0); }
		public TerminalNode SENAO() { return getToken(GramaParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(CASO);
			setState(329);
			exp_aritmetica();
			setState(330);
			match(SEJA);
			setState(331);
			selecao();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(332);
				match(SENAO);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
					{
					{
					setState(333);
					cmd();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(341);
			match(FIMCASO);
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
	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(GramaParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(GramaParser.ASSIGN, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(GramaParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(GramaParser.FACA, 0); }
		public TerminalNode FIMPARA() { return getToken(GramaParser.FIMPARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(PARA);
			setState(344);
			match(IDENT);
			setState(345);
			match(ASSIGN);
			setState(346);
			exp_aritmetica();
			setState(347);
			match(ATE);
			setState(348);
			exp_aritmetica();
			setState(349);
			match(FACA);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
				{
				{
				setState(350);
				cmd();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(FIMPARA);
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
	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(GramaParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(GramaParser.FACA, 0); }
		public TerminalNode FIMENQNT() { return getToken(GramaParser.FIMENQNT, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ENQUANTO);
			setState(359);
			expressao();
			setState(360);
			match(FACA);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
				{
				{
				setState(361);
				cmd();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(FIMENQNT);
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
	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(GramaParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(GramaParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdFaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(FACA);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
				{
				{
				setState(370);
				cmd();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(ATE);
			setState(377);
			expressao();
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
	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GramaParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(GramaParser.PONTEIRO, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(379);
				match(PONTEIRO);
				}
			}

			setState(382);
			identificador();
			setState(383);
			match(ASSIGN);
			setState(384);
			expressao();
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
	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(GramaParser.LPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GramaParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaParser.COMMA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(IDENT);
			setState(387);
			match(LPAREN);
			setState(388);
			expressao();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389);
				match(COMMA);
				setState(390);
				expressao();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
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
	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(GramaParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitCmdRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitCmdRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(RETORNE);
			setState(399);
			expressao();
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
	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==NUM_INT) {
				{
				{
				setState(401);
				item_selecao();
				}
				}
				setState(406);
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
	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GramaParser.COLON, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			constantes();
			setState(408);
			match(COLON);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4611688218525771779L) != 0)) {
				{
				{
				setState(409);
				cmd();
				}
				}
				setState(414);
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
	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaParser.COMMA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			numero_intervalo();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(416);
				match(COMMA);
				setState(417);
				numero_intervalo();
				}
				}
				setState(422);
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
	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(GramaParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(GramaParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode CONT() { return getToken(GramaParser.CONT, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(423);
				op_unario();
				}
			}

			setState(426);
			match(NUM_INT);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONT) {
				{
				setState(427);
				match(CONT);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(428);
					op_unario();
					}
				}

				setState(431);
				match(NUM_INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(GramaParser.SUB, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(SUB);
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
	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			termo();
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					op1();
					setState(438);
					termo();
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			fator();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MULT) {
				{
				{
				setState(446);
				op2();
				setState(447);
				fator();
				}
				}
				setState(453);
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
	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			parcela();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RESTO) {
				{
				{
				setState(455);
				op3();
				setState(456);
				parcela();
				}
				}
				setState(462);
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
	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(GramaParser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(GramaParser.SUB, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUB) ) {
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
	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(GramaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GramaParser.DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==DIV || _la==MULT) ) {
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
	public static class Op3Context extends ParserRuleContext {
		public TerminalNode RESTO() { return getToken(GramaParser.RESTO, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(RESTO);
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
	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case PONTEIRO:
			case LPAREN:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(469);
					op_unario();
					}
				}

				setState(472);
				parcela_unario();
				}
				break;
			case ENDERECAMEN:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				parcela_nao_unario();
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
	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(GramaParser.PONTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(GramaParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(GramaParser.LPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GramaParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaParser.COMMA, i);
		}
		public TerminalNode NUM_INT() { return getToken(GramaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(GramaParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parcela_unario);
		int _la;
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(476);
					match(PONTEIRO);
					}
				}

				setState(479);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(IDENT);
				setState(481);
				match(LPAREN);
				setState(482);
				expressao();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(483);
					match(COMMA);
					setState(484);
					expressao();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				match(LPAREN);
				setState(495);
				expressao();
				setState(496);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode ENDERECAMEN() { return getToken(GramaParser.ENDERECAMEN, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(GramaParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parcela_nao_unario);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECAMEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(ENDERECAMEN);
				setState(501);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(CADEIA);
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
	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			exp_aritmetica();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0)) {
				{
				setState(506);
				op_relacional();
				setState(507);
				exp_aritmetica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(GramaParser.IGUAL, 0); }
		public TerminalNode LESSMORE() { return getToken(GramaParser.LESSMORE, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(GramaParser.MAIORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(GramaParser.MENORIGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(GramaParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(GramaParser.MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0)) ) {
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			termo_logico();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(514);
				op_logico_1();
				setState(515);
				termo_logico();
				}
				}
				setState(521);
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
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			fator_logico();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(523);
				op_logico_2();
				setState(524);
				fator_logico();
				}
				}
				setState(530);
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
	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NAO() { return getToken(GramaParser.NAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(531);
				match(NAO);
				}
			}

			setState(534);
			parcela_logica();
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
	public static class Parcela_logicaContext extends ParserRuleContext {
		public List<TerminalNode> TRUE() { return getTokens(GramaParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(GramaParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(GramaParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(GramaParser.FALSE, i);
		}
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_logica);
		int _la;
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(536);
					_la = _input.LA(1);
					if ( !(_la==TRUE || _la==FALSE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(539); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TRUE || _la==FALSE );
				}
				break;
			case SUB:
			case PONTEIRO:
			case ENDERECAMEN:
			case LPAREN:
			case CADEIA:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				exp_relacional();
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
	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OU() { return getToken(GramaParser.OU, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitOp_logico_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitOp_logico_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(OU);
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
	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode E() { return getToken(GramaParser.E, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaListener ) ((GramaListener)listener).exitOp_logico_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaVisitor ) return ((GramaVisitor<? extends T>)visitor).visitOp_logico_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(E);
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
		"\u0004\u0001E\u0225\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u0001l\b\u0001\n\u0001\f\u0001o\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002s\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0082\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0087\b\u0004\n\u0004\f\u0004"+
		"\u008a\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0092\b\u0005\n\u0005\f\u0005\u0095\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u009d\b\u0006\n\u0006\f\u0006\u00a0\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a4\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00aa"+
		"\b\t\u0001\n\u0003\n\u00ad\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\f\u00b5\b\f\n\f\f\f\u00b8\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c0\b\r\u0001\r\u0001\r\u0005\r\u00c4"+
		"\b\r\n\r\f\r\u00c7\t\r\u0001\r\u0005\r\u00ca\b\r\n\r\f\r\u00cd\t\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d4\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00da\b\r\n\r\f\r\u00dd\t\r\u0001\r\u0005\r\u00e0\b"+
		"\r\n\r\f\r\u00e3\t\r\u0001\r\u0001\r\u0003\r\u00e7\b\r\u0001\u000e\u0003"+
		"\u000e\u00ea\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ef"+
		"\b\u000e\n\u000e\f\u000e\u00f2\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00fa\b\u000f\n\u000f"+
		"\f\u000f\u00fd\t\u000f\u0001\u0010\u0005\u0010\u0100\b\u0010\n\u0010\f"+
		"\u0010\u0103\t\u0010\u0001\u0010\u0005\u0010\u0106\b\u0010\n\u0010\f\u0010"+
		"\u0109\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0115\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011a\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011f\b\u0012\u0001"+
		"\u0012\u0005\u0012\u0122\b\u0012\n\u0012\f\u0012\u0125\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u012e\b\u0013\n\u0013\f\u0013\u0131\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0139"+
		"\b\u0014\n\u0014\f\u0014\u013c\t\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0140\b\u0014\n\u0014\f\u0014\u0143\t\u0014\u0003\u0014\u0145\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u014f\b\u0015\n\u0015\f\u0015\u0152"+
		"\t\u0015\u0003\u0015\u0154\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0160\b\u0016\n\u0016\f\u0016\u0163\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u016b\b\u0017\n\u0017\f\u0017\u016e\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0174\b\u0018\n\u0018\f\u0018\u0177"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0003\u0019\u017d"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0188\b\u001a\n"+
		"\u001a\f\u001a\u018b\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0005\u001c\u0193\b\u001c\n\u001c\f\u001c"+
		"\u0196\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u019b\b"+
		"\u001d\n\u001d\f\u001d\u019e\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u01a3\b\u001e\n\u001e\f\u001e\u01a6\t\u001e\u0001\u001f\u0003"+
		"\u001f\u01a9\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ae"+
		"\b\u001f\u0001\u001f\u0003\u001f\u01b1\b\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u01b9\b!\n!\f!\u01bc\t!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u01c2\b\"\n\"\f\"\u01c5\t\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u01cb\b#\n#\f#\u01ce\t#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0003\'\u01d7\b\'\u0001\'\u0001\'\u0003\'\u01db\b\'\u0001(\u0003"+
		"(\u01de\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u01e6\b(\n"+
		"(\f(\u01e9\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0003(\u01f3\b(\u0001)\u0001)\u0001)\u0003)\u01f8\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u01fe\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u0206\b,\n,\f,\u0209\t,\u0001-\u0001-\u0001-\u0001-\u0005-\u020f\b-"+
		"\n-\f-\u0212\t-\u0001.\u0003.\u0215\b.\u0001.\u0001.\u0001/\u0004/\u021a"+
		"\b/\u000b/\f/\u021b\u0001/\u0003/\u021f\b/\u00010\u00010\u00011\u0001"+
		"1\u00011\u0000\u00002\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`b\u0000\u0006\u0002\u0000\u0006\b\n\n\u0003\u0000$%>>CD\u0002\u0000"+
		"&&((\u0002\u0000\'\'))\u0001\u000005\u0001\u0000$%\u0238\u0000d\u0001"+
		"\u0000\u0000\u0000\u0002m\u0001\u0000\u0000\u0000\u0004r\u0001\u0000\u0000"+
		"\u0000\u0006\u0081\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000\u0000\u0000"+
		"\n\u008e\u0001\u0000\u0000\u0000\f\u009e\u0001\u0000\u0000\u0000\u000e"+
		"\u00a3\u0001\u0000\u0000\u0000\u0010\u00a5\u0001\u0000\u0000\u0000\u0012"+
		"\u00a9\u0001\u0000\u0000\u0000\u0014\u00ac\u0001\u0000\u0000\u0000\u0016"+
		"\u00b0\u0001\u0000\u0000\u0000\u0018\u00b2\u0001\u0000\u0000\u0000\u001a"+
		"\u00e6\u0001\u0000\u0000\u0000\u001c\u00e9\u0001\u0000\u0000\u0000\u001e"+
		"\u00f6\u0001\u0000\u0000\u0000 \u0101\u0001\u0000\u0000\u0000\"\u0114"+
		"\u0001\u0000\u0000\u0000$\u0116\u0001\u0000\u0000\u0000&\u0128\u0001\u0000"+
		"\u0000\u0000(\u0134\u0001\u0000\u0000\u0000*\u0148\u0001\u0000\u0000\u0000"+
		",\u0157\u0001\u0000\u0000\u0000.\u0166\u0001\u0000\u0000\u00000\u0171"+
		"\u0001\u0000\u0000\u00002\u017c\u0001\u0000\u0000\u00004\u0182\u0001\u0000"+
		"\u0000\u00006\u018e\u0001\u0000\u0000\u00008\u0194\u0001\u0000\u0000\u0000"+
		":\u0197\u0001\u0000\u0000\u0000<\u019f\u0001\u0000\u0000\u0000>\u01a8"+
		"\u0001\u0000\u0000\u0000@\u01b2\u0001\u0000\u0000\u0000B\u01b4\u0001\u0000"+
		"\u0000\u0000D\u01bd\u0001\u0000\u0000\u0000F\u01c6\u0001\u0000\u0000\u0000"+
		"H\u01cf\u0001\u0000\u0000\u0000J\u01d1\u0001\u0000\u0000\u0000L\u01d3"+
		"\u0001\u0000\u0000\u0000N\u01da\u0001\u0000\u0000\u0000P\u01f2\u0001\u0000"+
		"\u0000\u0000R\u01f7\u0001\u0000\u0000\u0000T\u01f9\u0001\u0000\u0000\u0000"+
		"V\u01ff\u0001\u0000\u0000\u0000X\u0201\u0001\u0000\u0000\u0000Z\u020a"+
		"\u0001\u0000\u0000\u0000\\\u0214\u0001\u0000\u0000\u0000^\u021e\u0001"+
		"\u0000\u0000\u0000`\u0220\u0001\u0000\u0000\u0000b\u0222\u0001\u0000\u0000"+
		"\u0000de\u0003\u0002\u0001\u0000ef\u0005\u0001\u0000\u0000fg\u0003 \u0010"+
		"\u0000gh\u0005\u0002\u0000\u0000hi\u0005\u0000\u0000\u0001i\u0001\u0001"+
		"\u0000\u0000\u0000jl\u0003\u0004\u0002\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u0003\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000ps\u0003"+
		"\u0006\u0003\u0000qs\u0003\u001a\r\u0000rp\u0001\u0000\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000s\u0005\u0001\u0000\u0000\u0000tu\u0005\u0003\u0000"+
		"\u0000u\u0082\u0003\b\u0004\u0000vw\u0005#\u0000\u0000wx\u0005B\u0000"+
		"\u0000xy\u00056\u0000\u0000yz\u0003\u0010\b\u0000z{\u00054\u0000\u0000"+
		"{|\u0003\u0016\u000b\u0000|\u0082\u0001\u0000\u0000\u0000}~\u0005\u001e"+
		"\u0000\u0000~\u007f\u0005B\u0000\u0000\u007f\u0080\u00056\u0000\u0000"+
		"\u0080\u0082\u0003\u000e\u0007\u0000\u0081t\u0001\u0000\u0000\u0000\u0081"+
		"v\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0082\u0007\u0001"+
		"\u0000\u0000\u0000\u0083\u0088\u0003\n\u0005\u0000\u0084\u0085\u00057"+
		"\u0000\u0000\u0085\u0087\u0003\n\u0005\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u00056\u0000\u0000"+
		"\u008c\u008d\u0003\u000e\u0007\u0000\u008d\t\u0001\u0000\u0000\u0000\u008e"+
		"\u0093\u0005B\u0000\u0000\u008f\u0090\u0005/\u0000\u0000\u0090\u0092\u0005"+
		"B\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0003\f\u0006\u0000\u0097\u000b\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u00058\u0000\u0000\u0099\u009a\u0003B!\u0000\u009a"+
		"\u009b\u00059\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0098"+
		"\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\r\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0003"+
		"\u0018\f\u0000\u00a2\u00a4\u0003\u0014\n\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u000f\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0007\u0000\u0000\u0000\u00a6\u0011\u0001\u0000"+
		"\u0000\u0000\u00a7\u00aa\u0003\u0010\b\u0000\u00a8\u00aa\u0005B\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005-\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u0012\t\u0000\u00af"+
		"\u0015\u0001\u0000\u0000\u0000\u00b0\u00b1\u0007\u0001\u0000\u0000\u00b1"+
		"\u0017\u0001\u0000\u0000\u0000\u00b2\u00b6\u0005\u001a\u0000\u0000\u00b3"+
		"\u00b5\u0003\b\u0004\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u001b\u0000\u0000\u00ba\u0019"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001c\u0000\u0000\u00bc\u00bd"+
		"\u0005B\u0000\u0000\u00bd\u00bf\u0005:\u0000\u0000\u00be\u00c0\u0003\u001e"+
		"\u000f\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005;\u0000"+
		"\u0000\u00c2\u00c4\u0003\u0006\u0003\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\"\u0011\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ce\u00e7\u0005\u001d\u0000\u0000\u00cf\u00d0\u0005 \u0000\u0000\u00d0"+
		"\u00d1\u0005B\u0000\u0000\u00d1\u00d3\u0005:\u0000\u0000\u00d2\u00d4\u0003"+
		"\u001e\u000f\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		";\u0000\u0000\u00d6\u00d7\u00056\u0000\u0000\u00d7\u00db\u0003\u0014\n"+
		"\u0000\u00d8\u00da\u0003\u0006\u0003\u0000\u00d9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00e1\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e0\u0003\"\u0011\u0000"+
		"\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005!\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00bb\u0001\u0000\u0000\u0000\u00e6\u00cf\u0001\u0000\u0000\u0000\u00e7"+
		"\u001b\u0001\u0000\u0000\u0000\u00e8\u00ea\u0005\u001f\u0000\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f0\u0003\n\u0005\u0000\u00ec\u00ed"+
		"\u00057\u0000\u0000\u00ed\u00ef\u0003\n\u0005\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"6\u0000\u0000\u00f4\u00f5\u0003\u0014\n\u0000\u00f5\u001d\u0001\u0000"+
		"\u0000\u0000\u00f6\u00fb\u0003\u001c\u000e\u0000\u00f7\u00f8\u00057\u0000"+
		"\u0000\u00f8\u00fa\u0003\u001c\u000e\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u001f\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0100\u0003\u0006\u0003"+
		"\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0107\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0104\u0106\u0003\"\u0011\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108!\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u0115\u0003$\u0012\u0000\u010b\u0115"+
		"\u0003&\u0013\u0000\u010c\u0115\u0003(\u0014\u0000\u010d\u0115\u0003*"+
		"\u0015\u0000\u010e\u0115\u0003,\u0016\u0000\u010f\u0115\u0003.\u0017\u0000"+
		"\u0110\u0115\u00030\u0018\u0000\u0111\u0115\u00032\u0019\u0000\u0112\u0115"+
		"\u00034\u001a\u0000\u0113\u0115\u00036\u001b\u0000\u0114\u010a\u0001\u0000"+
		"\u0000\u0000\u0114\u010b\u0001\u0000\u0000\u0000\u0114\u010c\u0001\u0000"+
		"\u0000\u0000\u0114\u010d\u0001\u0000\u0000\u0000\u0114\u010e\u0001\u0000"+
		"\u0000\u0000\u0114\u010f\u0001\u0000\u0000\u0000\u0114\u0110\u0001\u0000"+
		"\u0000\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115#\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005\u0004\u0000\u0000\u0117\u0119\u0005:\u0000\u0000"+
		"\u0118\u011a\u0005-\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u0123\u0003\n\u0005\u0000\u011c\u011e\u00057\u0000\u0000\u011d\u011f"+
		"\u0005-\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0003"+
		"\n\u0005\u0000\u0121\u011c\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005;\u0000\u0000\u0127%\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0005\u0005\u0000\u0000\u0129\u012a\u0005:\u0000\u0000\u012a"+
		"\u012f\u0003X,\u0000\u012b\u012c\u00057\u0000\u0000\u012c\u012e\u0003"+
		"X,\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005;\u0000\u0000\u0133\'\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0005\u000f\u0000\u0000\u0135\u0136\u0003X,\u0000\u0136\u013a"+
		"\u0005\u000e\u0000\u0000\u0137\u0139\u0003\"\u0011\u0000\u0138\u0137\u0001"+
		"\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0144\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0141\u0005"+
		"\r\u0000\u0000\u013e\u0140\u0003\"\u0011\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u013d\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u0010\u0000\u0000\u0147)\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0005\u0011\u0000\u0000\u0149\u014a\u0003B!\u0000\u014a"+
		"\u014b\u0005\u0012\u0000\u0000\u014b\u0153\u00038\u001c\u0000\u014c\u0150"+
		"\u0005\r\u0000\u0000\u014d\u014f\u0003\"\u0011\u0000\u014e\u014d\u0001"+
		"\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0154\u0001"+
		"\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u014c\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0005\u0013\u0000\u0000\u0156+\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0005\u0014\u0000\u0000\u0158\u0159\u0005B\u0000"+
		"\u0000\u0159\u015a\u0005+\u0000\u0000\u015a\u015b\u0003B!\u0000\u015b"+
		"\u015c\u0005\u0015\u0000\u0000\u015c\u015d\u0003B!\u0000\u015d\u0161\u0005"+
		"\u0016\u0000\u0000\u015e\u0160\u0003\"\u0011\u0000\u015f\u015e\u0001\u0000"+
		"\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000"+
		"\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0017"+
		"\u0000\u0000\u0165-\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0018\u0000"+
		"\u0000\u0167\u0168\u0003X,\u0000\u0168\u016c\u0005\u0016\u0000\u0000\u0169"+
		"\u016b\u0003\"\u0011\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016e"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u016c"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0019\u0000\u0000\u0170/\u0001"+
		"\u0000\u0000\u0000\u0171\u0175\u0005\u0016\u0000\u0000\u0172\u0174\u0003"+
		"\"\u0011\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0005\u0015\u0000\u0000\u0179\u017a\u0003X,\u0000"+
		"\u017a1\u0001\u0000\u0000\u0000\u017b\u017d\u0005-\u0000\u0000\u017c\u017b"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0003\n\u0005\u0000\u017f\u0180\u0005"+
		"+\u0000\u0000\u0180\u0181\u0003X,\u0000\u01813\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0005B\u0000\u0000\u0183\u0184\u0005:\u0000\u0000\u0184\u0189"+
		"\u0003X,\u0000\u0185\u0186\u00057\u0000\u0000\u0186\u0188\u0003X,\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0005;\u0000\u0000\u018d5\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0005\"\u0000\u0000\u018f\u0190\u0003X,\u0000\u01907\u0001\u0000\u0000"+
		"\u0000\u0191\u0193\u0003:\u001d\u0000\u0192\u0191\u0001\u0000\u0000\u0000"+
		"\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0001\u0000\u0000\u0000\u01959\u0001\u0000\u0000\u0000\u0196"+
		"\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u0003<\u001e\u0000\u0198\u019c"+
		"\u00056\u0000\u0000\u0199\u019b\u0003\"\u0011\u0000\u019a\u0199\u0001"+
		"\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d;\u0001\u0000"+
		"\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a4\u0003>\u001f"+
		"\u0000\u01a0\u01a1\u00057\u0000\u0000\u01a1\u01a3\u0003>\u001f\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"=\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u0003@ \u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01b0\u0005C\u0000"+
		"\u0000\u01ab\u01ad\u0005,\u0000\u0000\u01ac\u01ae\u0003@ \u0000\u01ad"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0005C\u0000\u0000\u01b0\u01ab"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1?\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0005(\u0000\u0000\u01b3A\u0001\u0000\u0000"+
		"\u0000\u01b4\u01ba\u0003D\"\u0000\u01b5\u01b6\u0003H$\u0000\u01b6\u01b7"+
		"\u0003D\"\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bbC\u0001\u0000"+
		"\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01c3\u0003F#\u0000"+
		"\u01be\u01bf\u0003J%\u0000\u01bf\u01c0\u0003F#\u0000\u01c0\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c4E\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c6\u01cc\u0003N\'\u0000\u01c7\u01c8\u0003L&\u0000\u01c8"+
		"\u01c9\u0003N\'\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c7"+
		"\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cdG\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0\u0007"+
		"\u0002\u0000\u0000\u01d0I\u0001\u0000\u0000\u0000\u01d1\u01d2\u0007\u0003"+
		"\u0000\u0000\u01d2K\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005*\u0000\u0000"+
		"\u01d4M\u0001\u0000\u0000\u0000\u01d5\u01d7\u0003@ \u0000\u01d6\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d8\u01db\u0003P(\u0000\u01d9\u01db\u0003R"+
		")\u0000\u01da\u01d6\u0001\u0000\u0000\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01dbO\u0001\u0000\u0000\u0000\u01dc\u01de\u0005-\u0000\u0000\u01dd"+
		"\u01dc\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0001\u0000\u0000\u0000\u01df\u01f3\u0003\n\u0005\u0000\u01e0\u01e1"+
		"\u0005B\u0000\u0000\u01e1\u01e2\u0005:\u0000\u0000\u01e2\u01e7\u0003X"+
		",\u0000\u01e3\u01e4\u00057\u0000\u0000\u01e4\u01e6\u0003X,\u0000\u01e5"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0005;\u0000\u0000\u01eb\u01f3\u0001\u0000\u0000\u0000\u01ec\u01f3"+
		"\u0005C\u0000\u0000\u01ed\u01f3\u0005D\u0000\u0000\u01ee\u01ef\u0005:"+
		"\u0000\u0000\u01ef\u01f0\u0003X,\u0000\u01f0\u01f1\u0005;\u0000\u0000"+
		"\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2\u01dd\u0001\u0000\u0000\u0000"+
		"\u01f2\u01e0\u0001\u0000\u0000\u0000\u01f2\u01ec\u0001\u0000\u0000\u0000"+
		"\u01f2\u01ed\u0001\u0000\u0000\u0000\u01f2\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f3Q\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005.\u0000\u0000\u01f5\u01f8"+
		"\u0003\n\u0005\u0000\u01f6\u01f8\u0005>\u0000\u0000\u01f7\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8S\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fd\u0003B!\u0000\u01fa\u01fb\u0003V+\u0000\u01fb"+
		"\u01fc\u0003B!\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01feU\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0007\u0004\u0000\u0000\u0200W\u0001\u0000\u0000"+
		"\u0000\u0201\u0207\u0003Z-\u0000\u0202\u0203\u0003`0\u0000\u0203\u0204"+
		"\u0003Z-\u0000\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u0202\u0001\u0000"+
		"\u0000\u0000\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208Y\u0001\u0000\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u0210\u0003\\.\u0000"+
		"\u020b\u020c\u0003b1\u0000\u020c\u020d\u0003\\.\u0000\u020d\u020f\u0001"+
		"\u0000\u0000\u0000\u020e\u020b\u0001\u0000\u0000\u0000\u020f\u0212\u0001"+
		"\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211[\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0213\u0215\u0005\u000b\u0000\u0000\u0214\u0213\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0003^/\u0000\u0217]\u0001\u0000\u0000\u0000"+
		"\u0218\u021a\u0007\u0005\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000"+
		"\u021d\u021f\u0003T*\u0000\u021e\u0219\u0001\u0000\u0000\u0000\u021e\u021d"+
		"\u0001\u0000\u0000\u0000\u021f_\u0001\u0000\u0000\u0000\u0220\u0221\u0005"+
		"\f\u0000\u0000\u0221a\u0001\u0000\u0000\u0000\u0222\u0223\u0005\t\u0000"+
		"\u0000\u0223c\u0001\u0000\u0000\u0000:mr\u0081\u0088\u0093\u009e\u00a3"+
		"\u00a9\u00ac\u00b6\u00bf\u00c5\u00cb\u00d3\u00db\u00e1\u00e6\u00e9\u00f0"+
		"\u00fb\u0101\u0107\u0114\u0119\u011e\u0123\u012f\u013a\u0141\u0144\u0150"+
		"\u0153\u0161\u016c\u0175\u017c\u0189\u0194\u019c\u01a4\u01a8\u01ad\u01b0"+
		"\u01ba\u01c3\u01cc\u01d6\u01da\u01dd\u01e7\u01f2\u01f7\u01fd\u0207\u0210"+
		"\u0214\u021b\u021e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}