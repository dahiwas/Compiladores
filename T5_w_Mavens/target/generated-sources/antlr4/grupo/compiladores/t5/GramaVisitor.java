// Generated from grupo/compiladores/t5/Grama.g4 by ANTLR 4.13.1
package grupo.compiladores.t5;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(GramaParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(GramaParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(GramaParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GramaParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(GramaParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(GramaParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GramaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(GramaParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(GramaParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(GramaParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(GramaParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(GramaParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(GramaParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(GramaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(GramaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(GramaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(GramaParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(GramaParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(GramaParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(GramaParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(GramaParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(GramaParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(GramaParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(GramaParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(GramaParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(GramaParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(GramaParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(GramaParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(GramaParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(GramaParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(GramaParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(GramaParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(GramaParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(GramaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(GramaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(GramaParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(GramaParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(GramaParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(GramaParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(GramaParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(GramaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(GramaParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(GramaParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(GramaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(GramaParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(GramaParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(GramaParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(GramaParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(GramaParser.Op_logico_2Context ctx);
}