// Generated from Grama.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaParser}.
 */
public interface GramaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#blocoAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterBlocoAlgoritmo(GramaParser.BlocoAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#blocoAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitBlocoAlgoritmo(GramaParser.BlocoAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(GramaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(GramaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(GramaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(GramaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#leia}.
	 * @param ctx the parse tree
	 */
	void enterLeia(GramaParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#leia}.
	 * @param ctx the parse tree
	 */
	void exitLeia(GramaParser.LeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#escreva}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(GramaParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#escreva}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(GramaParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GramaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GramaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaParser.AtribuicaoContext ctx);
}