// Generated from grupo/compiladores/t3/Grama.g4 by ANTLR 4.13.1
package grupo.compiladores.t3;
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
	 * Enter a parse tree produced by {@link GramaParser#decl_locl_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_locl_global(GramaParser.Decl_locl_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#decl_locl_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_locl_global(GramaParser.Decl_locl_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(GramaParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(GramaParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(GramaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(GramaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(GramaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(GramaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(GramaParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(GramaParser.DimensaoContext ctx);
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
	 * Enter a parse tree produced by {@link GramaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(GramaParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(GramaParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(GramaParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(GramaParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(GramaParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(GramaParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(GramaParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(GramaParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(GramaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(GramaParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(GramaParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(GramaParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(GramaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(GramaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(GramaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(GramaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(GramaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(GramaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(GramaParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(GramaParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(GramaParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(GramaParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(GramaParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(GramaParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(GramaParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(GramaParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(GramaParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(GramaParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(GramaParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(GramaParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(GramaParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(GramaParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(GramaParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(GramaParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(GramaParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(GramaParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(GramaParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(GramaParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(GramaParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(GramaParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(GramaParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(GramaParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(GramaParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(GramaParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(GramaParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(GramaParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(GramaParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(GramaParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(GramaParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(GramaParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GramaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GramaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GramaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GramaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(GramaParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(GramaParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(GramaParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(GramaParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(GramaParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(GramaParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(GramaParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(GramaParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(GramaParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(GramaParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(GramaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(GramaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(GramaParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(GramaParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(GramaParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(GramaParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(GramaParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(GramaParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(GramaParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(GramaParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(GramaParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(GramaParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(GramaParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(GramaParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(GramaParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(GramaParser.Op_logico_2Context ctx);
}