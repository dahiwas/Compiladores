package grupo.compiladores.t5;

import java.util.ArrayList;
import org.antlr.v4.runtime.Token;

import grupo.compiladores.t5.GramaParser.*;
import grupo.compiladores.t5.TabelaDeSimbolos.*;

import static grupo.compiladores.t5.GramaUtils.*;

public class VisitorCustom extends GramaBaseVisitor<Void> {

    //Variavel para captar o escopo atual
    TabelaDeSimbolos tabelaAtual;
    
    //Gerencia todos os escopos que terá no jogo
    static Escopos gerenciadorEscopos = new Escopos();

    // Verifica se o comando 'retorne' aparece no escopo global, onde não é permitido
    /*
    programa          : declaracoes 'algoritmo' corpo 'fim_algoritmo';
    */
    @Override
    public Void visitPrograma(ProgramaContext ctx) {
        for (CmdContext cmd : ctx.corpo().cmd()) {
            if (cmd.cmdRetorne() != null) {
                adicionaErroSemantico(cmd.getStart(), "comando retorne nao permitido nesse escopo");
            }
        }
        return super.visitPrograma(ctx);
    }

    // Trata a declaração de variáveis locais, constantes e tipos
    /*
    declaracao_local  : 'declare' variavel 
		  | 'constante' IDENT ':' tipo_basico '=' valor_constante
		  | 'tipo' IDENT ':' tipo;
    */
    @Override
    public Void visitDeclaracao_local(Declaracao_localContext ctx) {
        tabelaAtual = gerenciadorEscopos.obterEscopoAtual();
        String tipoVar, nomeVar;

        //Verifica se possui uma declaração local
        if (ctx.getText().contains("declare")) {
            if (ctx.variavel().tipo().registro() != null) {
                // Declaração de registros
                for (IdentificadorContext id : ctx.variavel().identificador()) {
                    Tipo tipoVariavel = GramaUtils.determinarTipo("registro");

                    if (tipoVariavel == Tipo.INVALIDO) {
                        adicionaErroSemantico(null, "tipo registro nao declarado");
                    } else if (!tabelaAtual.existe(id.getText())) {
                        tabelaAtual.adicionar(id.getText(), tipoVariavel, TipoEntrada.VARIAVEL);
                    } else {
                        adicionaErroSemantico(id.getStart(), "identificador " + id.getText() + " ja declarado anteriormente");
                    }
                    //Para cada ocorrência de variavel, verificar se já existe
                    for (VariavelContext varContexto : ctx.variavel().tipo().registro().variavel()) {
                        tipoVar = varContexto.tipo().getText();
                        //Para cada ocorrência de Identificador, verificar se já existe ou necessita adicionar
                        for (IdentificadorContext idRegistro : varContexto.identificador()) {
                            tipoVariavel = GramaUtils.determinarTipo(tipoVar);

                            if (tipoVariavel == Tipo.INVALIDO) {
                                adicionaErroSemantico(varContexto.tipo().getStart(), "tipo " + tipoVar + " nao declarado");
                            } else if (!tabelaAtual.existe(id.getText() + "." + idRegistro.getText())) {
                                tabelaAtual.adicionar(id.getText() + "." + idRegistro.getText(), tipoVariavel, TipoEntrada.VARIAVEL);
                            } else {
                                adicionaErroSemantico(idRegistro.getStart(), "identificador " + id.getText() + "." + idRegistro.getText() + " ja declarado anteriormente");
                            }
                        }
                    }
                }
            } else {
                // Declaração de variáveis comuns
                tipoVar = ctx.variavel().tipo().getText();
                if (gerenciadorEscopos.existe_registro(tipoVar)) {
                    //Armazena as informações sobre o registro que ja foram declarados
                    ArrayList<String> variaveisRegistro = gerenciadorEscopos.tabela_registro(tipoVar);

                    for (IdentificadorContext id : ctx.variavel().identificador()) {
                        nomeVar = id.IDENT().get(0).getText();
                        if (tabelaAtual.existe(nomeVar) || gerenciadorEscopos.existe_registro(nomeVar)) {
                            adicionaErroSemantico(id.getStart(), "identificador " + nomeVar + " ja declarado anteriormente");
                        } else {
                            Tipo tipoVariavel = GramaUtils.determinarTipo("registro");

                            if (tipoVariavel == Tipo.INVALIDO) {
                                adicionaErroSemantico(ctx.variavel().tipo().getStart(), "tipo registro nao declarado");
                            } else if (!tabelaAtual.existe(nomeVar)) {
                                tabelaAtual.adicionar(nomeVar, tipoVariavel, TipoEntrada.VARIAVEL);
                            } else {
                                adicionaErroSemantico(id.getStart(), "identificador " + nomeVar + " ja declarado anteriormente");
                            }

                            for (int i = 0; i < variaveisRegistro.size(); i = i + 2) {
                                tipoVariavel = GramaUtils.determinarTipo(variaveisRegistro.get(i + 1));

                                if (tipoVariavel == Tipo.INVALIDO) {
                                    adicionaErroSemantico(ctx.variavel().tipo().getStart(), "tipo " + variaveisRegistro.get(i + 1) + " nao declarado");
                                } else if (!tabelaAtual.existe(nomeVar + "." + variaveisRegistro.get(i))) {
                                    tabelaAtual.adicionar(nomeVar + "." + variaveisRegistro.get(i), tipoVariavel, TipoEntrada.VARIAVEL);
                                } else {
                                    adicionaErroSemantico(id.getStart(), "identificador " + nomeVar + "." + variaveisRegistro.get(i) + " ja declarado anteriormente");
                                }
                            }
                        }
                    }
                } else {
                    // Declaração de variáveis simples
                    for (IdentificadorContext identificador : ctx.variavel().identificador()) {
                        nomeVar = identificador.getText();
                           //Armazena as informações sobre as funções/procedimentos declarados
                        if (gerenciadorEscopos.existe_hash_func_proc(nomeVar)) {
                            adicionaErroSemantico(identificador.getStart(), "identificador " + nomeVar + " ja declarado anteriormente");
                        } else {
                            Tipo tipoVariavel = GramaUtils.determinarTipo(tipoVar);

                            if (tipoVariavel == Tipo.INVALIDO) {
                                adicionaErroSemantico(ctx.variavel().tipo().getStart(), "tipo " + tipoVar + " nao declarado");
                            } else if (!tabelaAtual.existe(nomeVar)) {
                                tabelaAtual.adicionar(nomeVar, tipoVariavel, TipoEntrada.VARIAVEL);
                            } else {
                                adicionaErroSemantico(identificador.getStart(), "identificador " + nomeVar + " ja declarado anteriormente");
                            }
                        }
                    }
                }
            }
            //Verificação se é do caso tipo
        } else if (ctx.getText().contains("tipo")) {
            // Declaração de tipos
            if (ctx.tipo().registro() != null) {
                ArrayList<String> variaveisRegistro = new ArrayList<>();
                for (VariavelContext varContexto : ctx.tipo().registro().variavel()) {
                    tipoVar = varContexto.tipo().getText();
                    for (IdentificadorContext id : varContexto.identificador()) {
                        variaveisRegistro.add(id.getText());
                        variaveisRegistro.add(tipoVar);
                    }
                }
                gerenciadorEscopos.adicionar_registro(ctx.IDENT().getText(), variaveisRegistro);
            }
        } else if (ctx.getText().contains("constante")) {
            // Declaração de constantes
            Tipo tipoVariavel = GramaUtils.determinarTipo(ctx.tipo_basico().getText());

            if (tipoVariavel == Tipo.INVALIDO) {
                adicionaErroSemantico(ctx.IDENT().getSymbol(), "tipo " + ctx.tipo_basico().getText() + " nao declarado");
            } else if (!tabelaAtual.existe(ctx.IDENT().getText())) {
                tabelaAtual.adicionar(ctx.IDENT().getText(), tipoVariavel, TipoEntrada.VARIAVEL);
            } else {
                adicionaErroSemantico(ctx.IDENT().getSymbol(), "identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
            }
        }

        return super.visitDeclaracao_local(ctx);
    }

    // Trata a declaração de procedimentos e funções globais
    /*
    declaracao_global : 'procedimento' IDENT '(' parametros? ')' declaracao_local* cmd* 'fim_procedimento'
	          | 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido declaracao_local* cmd* 'fim_funcao';
    */
    @Override
    public Void visitDeclaracao_global(Declaracao_globalContext ctx) {
        gerenciadorEscopos.criarNovoEscopo();
        tabelaAtual = gerenciadorEscopos.obterEscopoAtual();
        ArrayList<Tipo> tiposVars = new ArrayList<>();
        ArrayList<String> variaveisRegistro;
        String tipoVar;
        Tipo tipoAux;
        //Caso seja procedimento terá seu tratamento aqui
        if (ctx.getText().contains("procedimento")) {
            //Para cada parâmetro, é armazenado na tabela
            for (ParametroContext parametro : ctx.parametros().parametro()) {
                //Verifica o tipo do aprâmetro
                if (parametro.tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                    Tipo tipoVariavel = GramaUtils.determinarTipo(parametro.tipo_estendido().tipo_basico_ident().tipo_basico().getText());

                    if (tipoVariavel == Tipo.INVALIDO) {
                        adicionaErroSemantico(null, "tipo " + parametro.tipo_estendido().tipo_basico_ident().tipo_basico().getText() + " nao declarado");
                    } else if (!tabelaAtual.existe(parametro.identificador().get(0).getText())) {
                        tabelaAtual.adicionar(parametro.identificador().get(0).getText(), tipoVariavel, TipoEntrada.VARIAVEL);
                    } else {
                        adicionaErroSemantico(parametro.getStart(), "identificador " + parametro.identificador().get(0).getText() + " ja declarado anteriormente");
                    }

                    tipoVar = parametro.tipo_estendido().getText();
                    tipoAux = determinarTipo(gerenciadorEscopos.registro(), tipoVar);
                    tiposVars.add(tipoAux);
                //Verifica se possui o registro desse parâmetro
                } else if (gerenciadorEscopos.existe_registro(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())) {
                    variaveisRegistro = gerenciadorEscopos.tabela_registro(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());

                    tipoVar = parametro.tipo_estendido().getText();
                    tipoAux = determinarTipo(gerenciadorEscopos.registro(), tipoVar);
                    tiposVars.add(tipoAux);

                    for (IdentificadorContext id : parametro.identificador()) {
                        for (int i = 0; i < variaveisRegistro.size(); i = i + 2) {
                            Tipo tipoVariavel = GramaUtils.determinarTipo(variaveisRegistro.get(i + 1));

                            if (tipoVariavel == Tipo.INVALIDO) {
                                adicionaErroSemantico(id.getStart(), "tipo " + variaveisRegistro.get(i + 1) + " nao declarado");
                            } else if (!tabelaAtual.existe(id.getText() + "." + variaveisRegistro.get(i))) {
                                tabelaAtual.adicionar(id.getText() + "." + variaveisRegistro.get(i), tipoVariavel, TipoEntrada.VARIAVEL);
                            } else {
                                adicionaErroSemantico(id.getStart(), "identificador " + id.getText() + "." + variaveisRegistro.get(i) + " ja declarado anteriormente");
                            }
                        }
                    }
                } else {
                    adicionaErroSemantico(parametro.getStart(), "tipo nao declarado");
                }
            }
            //Faz uma varredura em todos os cmds
            for (CmdContext cmd : ctx.cmd()) {
                //Se tiver um comando de retorno, em um parâmetro não é permitido
                if (cmd.cmdRetorne() != null) {
                    System.out.println("Comando retorne nao permitido");
                    adicionaErroSemantico(cmd.getStart(), "comando retorne nao permitido nesse escopo");
                }
            }
            //Adiciona na variável global que armazena as funções e procedimentos
            gerenciadorEscopos.adicionar_func_proc(ctx.IDENT().getText(), tiposVars);

          //Caso seja uma função será tratada aqui
        } else if (ctx.getText().contains("funcao")) {
            // Declaração de funções
            for (ParametroContext parametro : ctx.parametros().parametro()) {
                //Para cada parâmetro da função é tratado aqui também
                //Verifica o tipo dos parâmetros
                if (parametro.tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                    Tipo tipoVariavel = GramaUtils.determinarTipo(parametro.tipo_estendido().tipo_basico_ident().tipo_basico().getText());

                    if (tipoVariavel == Tipo.INVALIDO) {
                        adicionaErroSemantico(null, "tipo " + parametro.tipo_estendido().tipo_basico_ident().tipo_basico().getText() + " nao declarado");
                    } else if (!tabelaAtual.existe(parametro.identificador().get(0).getText())) {
                        tabelaAtual.adicionar(parametro.identificador().get(0).getText(), tipoVariavel, TipoEntrada.VARIAVEL);
                    } else {
                        adicionaErroSemantico(parametro.getStart(), "identificador " + parametro.identificador().get(0).getText() + " ja declarado anteriormente");
                    }

                    tipoVar = parametro.tipo_estendido().getText();
                    tipoAux = determinarTipo(gerenciadorEscopos.registro(), tipoVar);
                    tiposVars.add(tipoAux);
                 //Verifica se já existe
                } else if (gerenciadorEscopos.existe_registro(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())) {
                    variaveisRegistro = gerenciadorEscopos.tabela_registro(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());

                    tipoVar = parametro.tipo_estendido().tipo_basico_ident().IDENT().getText();
                    tipoAux = determinarTipo(gerenciadorEscopos.registro(), tipoVar);
                    tiposVars.add(tipoAux);

                    for (IdentificadorContext id : parametro.identificador()) {
                        for (int i = 0; i < variaveisRegistro.size(); i = i + 2) {
                            Tipo tipoVariavel = GramaUtils.determinarTipo(variaveisRegistro.get(i + 1));

                            if (tipoVariavel == Tipo.INVALIDO) {
                                adicionaErroSemantico(id.getStart(), "tipo " + variaveisRegistro.get(i + 1) + " nao declarado");
                            } else if (!tabelaAtual.existe(id.getText() + "." + variaveisRegistro.get(i))) {
                                tabelaAtual.adicionar(id.getText() + "." + variaveisRegistro.get(i), tipoVariavel, TipoEntrada.VARIAVEL);
                            } else {
                                adicionaErroSemantico(id.getStart(), "identificador " + id.getText() + "." + variaveisRegistro.get(i) + " ja declarado anteriormente");
                            }
                        }
                    }
                    //Trata erro de não declarado
                } else {
                    adicionaErroSemantico(parametro.getStart(), "tipo nao declarado");
                }
            }
            //Adiciona também a função na variável global
            gerenciadorEscopos.adicionar_func_proc(ctx.IDENT().getText(), tiposVars);
        }

        //Abandona o escopo, mas não abandona as funções e procedimentos já declarados, adicionados /\ 
        gerenciadorEscopos.abandonarEscopo();

        //Essa lógica assegura que procedimentos e funções são corretamente declarados com tipos 
        //válidos e que não há reutilização indevida de identificadores no mesmo escopo.
        if (ctx.getText().contains("procedimento")) {
            Tipo tipoVariavel = GramaUtils.determinarTipo("void");

            if (tipoVariavel == Tipo.INVALIDO) {
                adicionaErroSemantico(null, "tipo void nao declarado");
            } else if (!tabelaAtual.existe(ctx.IDENT().getText())) {
                tabelaAtual.adicionar(ctx.IDENT().getText(), tipoVariavel, TipoEntrada.PROCEDIMENTO);
            } else {
                adicionaErroSemantico(ctx.getStart(), "identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
            }
        } else if (ctx.getText().contains("funcao")) {
            Tipo tipoVariavel = GramaUtils.determinarTipo(ctx.tipo_estendido().tipo_basico_ident().tipo_basico().getText());

            if (tipoVariavel == Tipo.INVALIDO) {
                adicionaErroSemantico(null, "tipo " + ctx.tipo_estendido().tipo_basico_ident().tipo_basico().getText() + " nao declarado");
            } else if (!tabelaAtual.existe(ctx.IDENT().getText())) {
                tabelaAtual.adicionar(ctx.IDENT().getText(), tipoVariavel, TipoEntrada.FUNCAO);
            } else {
                adicionaErroSemantico(ctx.getStart(), "identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
            }
        }

        
        return null;
    }

    // Verifica a declaração de leitura de variáveis
    @Override
    public Void visitCmdLeia(CmdLeiaContext ctx) {
        tabelaAtual = gerenciadorEscopos.obterEscopoAtual();
        //Verifica em cada identificador se já foi declarado
        for (IdentificadorContext id : ctx.identificador()) {
            if (!tabelaAtual.existe(id.getText())) {
                adicionaErroSemantico(id.getStart(), "identificador " + id.getText() + " nao declarado");
            }
        }

        return super.visitCmdLeia(ctx);
    }

    // Verifica a declaração de escrita de variáveis
    @Override
    public Void visitCmdEscreva(CmdEscrevaContext ctx) {
        tabelaAtual = gerenciadorEscopos.obterEscopoAtual();

        for (ExpressaoContext expressao : ctx.expressao()) {
            verificarTipo(tabelaAtual, expressao);
        }

        return super.visitCmdEscreva(ctx);
    }

    // Verifica a expressão em comandos 'enquanto'
    @Override
    public Void visitCmdEnquanto(CmdEnquantoContext ctx) {
        tabelaAtual = gerenciadorEscopos.obterEscopoAtual();
        //Verifica o tipo da expressao
        verificarTipo(tabelaAtual, ctx.expressao());
        return super.visitCmdEnquanto(ctx);
    }

    // Verifica a expressão em comandos 'se'
    @Override
    public Void visitCmdSe(CmdSeContext ctx) {
        tabelaAtual = gerenciadorEscopos.obterEscopoAtual();
        //Verifica o tipo da expressao
        verificarTipo(tabelaAtual, ctx.expressao());
        return super.visitCmdSe(ctx);
    }

    // Verifica a expressão e a compatibilidade em comandos de atribuição
    @Override
    public Void visitCmdAtribuicao(CmdAtribuicaoContext ctx) {
        tabelaAtual = gerenciadorEscopos.obterEscopoAtual();
        //Verifica o tipo da expressão
        Tipo tipoExpr = verificarTipo(tabelaAtual, ctx.expressao());
        String nomeVar = ctx.identificador().getText();

        
        if (tipoExpr != Tipo.INVALIDO) {
            if (!tabelaAtual.existe(nomeVar)) {
                adicionaErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
            } else {
                Tipo varTipo = verificarTipo(tabelaAtual, nomeVar);
                //Verifica a compatibilidade de tipos entre variável e a expressão, envolvendo ponteiro ou não
                //Caso seja numérico
                if (varTipo == Tipo.INTEIRO || varTipo == Tipo.REAL) {
                    //Caso seja ponteiro
                    if (ctx.getText().contains("ponteiro")) {
                        if (varTipo != tipoExpr && varTipo == Tipo.INTEIRO) {
                            if (tipoExpr != Tipo.INTEIRO) {
                                adicionaErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para ^" + ctx.identificador().getText());
                            }
                        }
                        //Caso não seja ponteiro
                    } else if (varTipo != tipoExpr && tipoExpr != Tipo.INTEIRO) {
                        adicionaErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
                    }
                    //Compatibilidade de tipos diferentes com variaveis não numericas
                } else if (varTipo != tipoExpr) {
                    adicionaErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
                }
            }
        }

        return super.visitCmdAtribuicao(ctx);
    }
}
