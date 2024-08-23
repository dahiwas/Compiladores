package grupo.compiladores.t5;

import static grupo.compiladores.t5.GramaUtils.verificarTipo;
import grupo.compiladores.t5.TabelaDeSimbolos.TipoEntrada;
import grupo.compiladores.t5.TabelaDeSimbolos.Tipo;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

import static grupo.compiladores.t5.GramaUtils.*;

public class GeradorCodigo extends GramaBaseVisitor<Void> {

    /*
    A classe GeradorCodigo é uma classe responsável por gerar código em linguagem C 
    a partir da análise sintática de uma linguagem específica, descrita 
    por uma gramática customizada ANTLR. Ela herda de GramaBaseVisitor<Void>, 
    que é uma classe base gerada pelo ANTLR para visitar os nós da árvore.
    */ 
    
    // String que receberá o programa em C ao longo da análise.
    StringBuilder saida;
    
    // Criação da tabela principal e inicialização de escopos.
    TabelaDeSimbolos tabela;
    Escopos escopos;
    static Escopos escoposAninhados;
    
    public GeradorCodigo() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
        escopos = new Escopos();
        escoposAninhados = new Escopos();
    }
    
    //programa          : declaracoes 'algoritmo' corpo 'fim_algoritmo';
    @Override
    public Void visitPrograma(GramaParser.ProgramaContext ctx) {
        // Adiciona diretivas de inclusão e uma linha em branco para separar a seção de declarações
        saida.append("#include <stdio.h>\n#include <stdlib.h>\n\n");

        // Visita as declarações e o corpo do programa
        visitDeclaracoes(ctx.declaracoes());
        saida.append("\nint main() {\n");
        visitCorpo(ctx.corpo());

        // Finaliza a função main e retorna o valor 0
        saida.append("\nreturn 0;\n}\n");

        return null;
    }
    
    //decl_locl_global : declaracao_local | declaracao_global;
    @Override
    public Void visitDeclaracao_local(GramaParser.Declaracao_localContext ctx) {
        if (ctx.valor_constante() != null) {
            // Processa uma declaração de constante
            saida.append("#define ")
                 .append(ctx.IDENT().getText())
                 .append(" ")
                 .append(ctx.valor_constante().getText())
                 .append("\n");
        } else if (ctx.tipo() != null) {
            // Processa a criação de um registro
            TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
            escopos.criarNovoEscopo();

            saida.append("typedef struct {\n");
            super.visitRegistro(ctx.tipo().registro());

            escopos.abandonarEscopo();
            escopoAtual.adicionar(ctx.IDENT().getText(), Tipo.REGISTRO, TipoEntrada.VARIAVEL);

            saida.append("} ")
                 .append(ctx.IDENT().getText())
                 .append(";\n");
        } else if (ctx.variavel() != null) {
            // Processa uma declaração de variável
            visitVariavel(ctx.variavel());
        }

        return null;
    
    }
    
    //variavel	  : identificador (',' identificador)* ':' tipo;
    @Override
    public Void visitVariavel(GramaParser.VariavelContext ctx) {

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        boolean tipoEstendido = false;
        String str;

        //Verifica se é um tipo básico.
        if (ctx.tipo().tipo_estendido() != null) {
            String nomeVar;
            String tipoVariavel = ctx.tipo().getText();
            
            Tipo tipoAuxT5;
            boolean ehPonteiro = false;

            // Verifica se é um ponteiro.
            if (tipoVariavel.contains("^")) {
                ehPonteiro = true;
                tipoVariavel = tipoVariavel.substring(1);
            }

            // Verifica a existência do tipo na tabela.
            if (verificaTipoTabela(escopoAtual, tipoVariavel)) {
                tipoEstendido = true;
                tipoAuxT5 = Tipo.TIPOESTENDIDO;
            } else {
                tipoAuxT5 = converteTipo(tipoVariavel);
                tipoVariavel = converteTipo(tipoAuxT5);
            }
            //Adicionar na string para escrita
            if (ehPonteiro == true) {
                tipoVariavel += "*";
            }

            for (GramaParser.IdentificadorContext ictx : ctx.identificador()) {
                nomeVar = ictx.getText();

                if (tipoEstendido)
                    escopoAtual.adicionar(nomeVar, Tipo.REGISTRO, TipoEntrada.VARIAVEL);
                else
                    escopoAtual.adicionar(nomeVar, tipoAuxT5, TipoEntrada.VARIAVEL);

                // Impressão das declarações do programa.
                if (tipoAuxT5 == Tipo.LITERAL) {
                    str = tipoVariavel + " " + nomeVar + "[80];\n";
                    saida.append(str);
                } else {
                    str = tipoVariavel + " " + nomeVar + ";\n";
                    saida.append(str);
                }
            }
        // Caso seja a declaração de um novo registro.
        } else {
            // Criação de um escopo para as variáveis do registro.
            escopos.criarNovoEscopo();

            // Imprime a struct em C e adiciona as variáveis na tabela através
            // do visitante de variáveis.
            saida.append("struct{\n");
            for (GramaParser.VariavelContext vctx : ctx.tipo().registro().variavel()) {
                visitVariavel(vctx);
            }
            str = "}" + ctx.identificador(0).getText() + ";\n";
            saida.append(str);

            // Remove o escopo atual e grava o registro no escopo global.
            escopos.abandonarEscopo();
            escopoAtual.adicionar(ctx.identificador(0).getText(), Tipo.REGISTRO, TipoEntrada.VARIAVEL);
        }

        return null;
    }

    /*
    declaracao_local  : 'declare' variavel 
		  | 'constante' IDENT ':' tipo_basico '=' valor_constante
		  | 'tipo' IDENT ':' tipo;    
    */
    @Override
    public Void visitDeclaracao_global(GramaParser.Declaracao_globalContext ctx) {
        // Obtém o escopo global e cria um novo escopo para parâmetros
        TabelaDeSimbolos escopoGlobal = escopos.obterEscopoAtual();
        escopos.criarNovoEscopo();
        TabelaDeSimbolos escopoParametros = escopos.obterEscopoAtual();

        // Determina o tipo de retorno da função (ou "void" para procedimentos)
        String tipoRetorno = (ctx.tipo_estendido() != null) 
                             ? verificaTipo(ctx.tipo_estendido().getText()) 
                             : "void";

        String nomeFuncao = ctx.IDENT().getText();
        saida.append(tipoRetorno).append(" ").append(nomeFuncao).append("(");

        // Processa os parâmetros, se existirem
        if (ctx.parametros() != null) {
            List<String> parametros = new ArrayList<>();
            //Para cada parametro é verificado o tipo
            for (GramaParser.ParametroContext pctx : ctx.parametros().parametro()) {
                String tipo = verificaTipo(pctx.tipo_estendido().getText());
                //Para cada identificador
                for (GramaParser.IdentificadorContext ictx : pctx.identificador()) {
                    String nomeParametro = ictx.getText();
                    escopoParametros.adicionar(nomeParametro, converteTipo(pctx.tipo_estendido().getText()), TipoEntrada.VARIAVEL);
                    parametros.add(tipo.equals("char") ? "char* " + nomeParametro : tipo + " " + nomeParametro);
                }
            }
            saida.append(String.join(", ", parametros));
        }

        saida.append(") {\n");

        // Adiciona a função/procedimento no escopo global
        TipoEntrada tipoEntrada = (ctx.tipo_estendido() != null) ? TipoEntrada.FUNCAO : TipoEntrada.PROCEDIMENTO;
        Tipo tipoFuncao = (tipoEntrada == TipoEntrada.FUNCAO) ? converteTipo(ctx.tipo_estendido().getText()) : Tipo.VOID;
        escopoGlobal.adicionar(nomeFuncao, tipoFuncao, tipoEntrada);

        // Executa os comandos do corpo da função/procedimento
        for (GramaParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }

        // Finaliza a declaração da função/procedimento
        saida.append("}\n");

        // Abandona o escopo dos parâmetros
        escopos.abandonarEscopo();

        return null;
    }


    //parcela_nao_unario: '&' identificador | CADEIA;
    @Override
    public Void visitParcela_nao_unario(GramaParser.Parcela_nao_unarioContext ctx) {

        // Imprime o identificador da parcela, se existir
        if (ctx.identificador() != null) {
            saida.append(ctx.identificador().getText());
        }

        return super.visitParcela_nao_unario(ctx);
    }

    /*
    parcela_unario	  : PONTEIRO? identificador
		  | IDENT '(' expressao  (',' expressao)* ')'
		  | NUM_INT | NUM_REAL | '(' expressao ')';
    */
    @Override
    public Void visitParcela_unario(GramaParser.Parcela_unarioContext ctx) {
        String textoExpressao = ctx.expressao().get(0).getText();

        if (textoExpressao.contains("(")) {
            // Se a expressão contém parênteses, visita as expressões internas recursivamente.
            saida.append("(");
            for (GramaParser.ExpressaoContext expCtx : ctx.expressao()) {
                visitExpressao(expCtx);
            }
            saida.append(")");
        } else {
            // Caso contrário, simplesmente adiciona o texto da expressão.
            saida.append(textoExpressao);
        }

        return null;
    }

    //op_relacional 	  : '=' | '<>' | '>=' | '<=' | '>' | '<';
    @Override
    public Void visitOp_relacional(GramaParser.Op_relacionalContext ctx) {

        // Determina o operador relacional correto para a saída em C.
        String operador = ctx.getText();

        // Substitui "=" por "==" se não for parte de "<=" ou ">="
        if (operador.equals("=")) {
            operador = "==";
        }

        // Adiciona o operador na saída
        saida.append(operador);

        return null;
    }

    //cmdRetorne	  : 'retorne' expressao;
    @Override
    public Void visitCmdRetorne(GramaParser.CmdRetorneContext ctx) {

        saida.append("return ");

        // Adiciona a expressão de retorno diretamente à saída.
        visitExpressao(ctx.expressao());

        saida.append(";\n");

        return null;
    }

    //cmdAtribuicao : '^'? identificador '<-' expressao;
    @Override
    public Void visitCmdAtribuicao(GramaParser.CmdAtribuicaoContext ctx) {

        String str;
        tabela = escoposAninhados.obterEscopoAtual();

        // Verifica se é um ponteiro.
        if (ctx.getText().contains("^")) {
            str = "*" + ctx.identificador().getText() + " = " + ctx.expressao().getText() + ";\n";
            saida.append(str);
        // Verifica se é um registro.
        } else if (ctx.identificador().getText().contains(".") && ctx.getText().contains("\"")) {
            str = "strcpy(" + ctx.identificador().getText() + "," + ctx.expressao().getText() + ");\n";
            saida.append(str);
        // Verifica se é uma variável de um tipo básico.
        } else {
            str = ctx.identificador().getText() + " = " + ctx.expressao().getText() + ";\n";
            saida.append(str);
        }

        return null;
    }
    
    //expressao	  : termo_logico  (op_logico_1 termo_logico)*;
    @Override
    public Void visitExpressao(GramaParser.ExpressaoContext ctx) {

        int numTermos = ctx.termo_logico().size();

        if (numTermos > 1) {
            for (int i = 0; i < numTermos; i++) {
                if (i > 0) {
                    saida.append(" || ");
                }
                visitTermo_logico(ctx.termo_logico(i));
            }
        } else {
            visitTermo_logico(ctx.termo_logico(0));
        }

        return null;
    }

    //termo_logico	  : fator_logico (op_logico_2 fator_logico)*;
    @Override
    public Void visitTermo_logico(GramaParser.Termo_logicoContext ctx) {
        //Verifica a qtd de fatores
        int numFatores = ctx.fator_logico().size();
        //Se form aior que 1, ir agregando para compor todos os termos logicos
        if (numFatores > 1) {
            for (int i = 0; i < numFatores; i++) {
                if (i > 0) {
                    saida.append(" && ");
                }
                visitFator_logico(ctx.fator_logico(i));
            }
        } else {
            visitFator_logico(ctx.fator_logico(0));
        }

        return null;
    }

    //fator_logico 	  : 'nao'? parcela_logica;
    @Override
    public Void visitFator_logico(GramaParser.Fator_logicoContext ctx) {
        //Se existir não, colocar na string em C '!'
        if(ctx.getText().contains("nao"))
            saida.append("!");
        
        visitParcela_logica(ctx.parcela_logica());
        
        return null;
    }
    
    //op2		  : '*' | '/';
    @Override
    public Void visitOp2(GramaParser.Op2Context ctx) {
        //Pega os multiplicadores/divisores
        saida.append(ctx.getText());

        super.visitOp2(ctx);

        return null;
    }
    
    /*
    parcela_logica	  : ('verdadeiro' | 'falso')
		  | exp_relacional;
    */
    @Override
    public Void visitParcela_logica(GramaParser.Parcela_logicaContext ctx) {
        //Mediante o que for lido, adicionar na string C seus respectivos false/true
        if(ctx.getText().contains("falso"))
            saida.append("false");
        else if(ctx.getText().contains("verdadeiro"))
            saida.append("true");
        else
            visitExp_relacional(ctx.exp_relacional());

        return null;
    }
    
    //exp_relacional    : exp_aritmetica (op_relacional exp_aritmetica)?;
    @Override
    public Void visitExp_relacional(GramaParser.Exp_relacionalContext ctx) {
        
        String str;
        String opAtual = ctx.getText();
        String expAtual = ctx.exp_aritmetica().get(0).getText();
        
        // Substitui operadores específicos por seus equivalentes em C.
        if (expAtual.contains("<>")) {
            opAtual = "<>";
        }else if (expAtual.contains("=") && (!expAtual.contains("<=") || !expAtual.contains(">="))) {
                opAtual = "=";
        }
           
        //Se tiver operador relacional, isto é '=' | '<>' | '>=' | '<=' | '>' | '<'
        if (ctx.op_relacional() != null) {
            saida.append(expAtual);
            saida.append(ctx.op_relacional().getText());
            saida.append(ctx.exp_aritmetica(1).getText());
        //Senão descobrir qual é a operação atual e separar em subexpressões
        } else {
            switch (opAtual) {
                case "=":
                    // Extrai as subexpressões e monta a expressão de igualdade
                    String arg1 = separaArg(expAtual, true);
                    String arg2 = separaArg(expAtual, false);
                    saida.append("(").append(arg1).append("==").append(arg2).append(")");
                    break;

                case "<>":
                    // Substitui o operador "<>" por "!="
                    saida.append("!=");
                    break;

                default:
                    // Trata outras expressões aritméticas
                    String argExp1 = separaExp(expAtual, true);
                    String argExp2 = separaExp(expAtual, false);
                    String op = verificaOp(opAtual);
                    saida.append(argExp1).append(op).append(argExp2);
                    break;
            }
        }

        return null;
    }
    
    //cmdSe		  : 'se' expressao 'entao'  cmd* ('senao' cmd*)? 'fim_se';
    @Override
    public Void visitCmdSe(GramaParser.CmdSeContext ctx) {

        // Substitui os operadores nas expressões da condição.
        String textoExpressao = ctx.expressao().getText()
                                  .replace("e", "&&")
                                  .replace("=", "==");

        // Monta a condição if
        saida.append("if (").append(textoExpressao).append(") {\n");

        // Executa os comandos do bloco 'então'
        for (GramaParser.CmdContext cctx : ctx.cmdEntao) {
            visitCmd(cctx);
        }

        saida.append("}\n");

        // Verifica se existe um bloco 'senao' e o imprime
        if (ctx.cmdSenao != null && !ctx.cmdSenao.isEmpty()) {
            saida.append("else {\n");
            for (GramaParser.CmdContext cctx : ctx.cmdSenao) {
                visitCmd(cctx);
            }
            saida.append("}\n");
        }

        return null;
    }
    
    //cmdLeia		  : 'leia' '(' '^'? identificador  (',' '^'? identificador)* ')';
    @Override
    public Void visitCmdLeia(GramaParser.CmdLeiaContext ctx) {

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

        // Executa as verificações dos parâmetros atuais.
        for (GramaParser.IdentificadorContext ictx : ctx.identificador()) {
            String nomeVar = ictx.getText();
            Tipo tipoVar = escopoAtual.verificar(nomeVar);
            String codigoTipo = verificaParamTipo(tipoVar);

            // Gera o código de leitura adequado para cada tipo.
            if (tipoVar == Tipo.LITERAL) {
                saida.append("gets(").append(nomeVar).append(");\n");
            } else {
                saida.append("scanf(\"%").append(codigoTipo).append("\", &").append(nomeVar).append(");\n");
            }
        }

        return null;
    }

    //cmdEnquanto	  : 'enquanto' expressao 'faca'  cmd* 'fim_enquanto';
    @Override
    public Void visitCmdEnquanto(GramaParser.CmdEnquantoContext ctx) {

        // Inicia o laço while com a expressão condicional
        saida.append("while(");
        visitExpressao(ctx.expressao());
        saida.append(") {\n");

        // A cada iteração navega no comando while
        for (GramaParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }

        saida.append("}\n");

        return null;
    }
    
    //cmdPara		  : 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca'  cmd* 'fim_para';
    @Override
    public Void visitCmdPara(GramaParser.CmdParaContext ctx) {

        String nomeVariavel = ctx.IDENT().getText();
        String limiteEsq = ctx.exp_aritmetica(0).getText();
        String limiteDir = ctx.exp_aritmetica(1).getText();

        // Construção do comando for com os limites obtidos anteriormente.
        saida.append("for(")
             .append(nomeVariavel).append(" = ").append(limiteEsq).append("; ")
             .append(nomeVariavel).append(" <= ").append(limiteDir).append("; ")
             .append(nomeVariavel).append("++) {\n");

        // Executa os comandos do for.
        for (GramaParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }

        saida.append("}\n");

        return null;
    }
    
    //cmdFaca		  : 'faca' cmd* 'ate' expressao;
    @Override
    public Void visitCmdFaca(GramaParser.CmdFacaContext ctx) {
        // Inicia o bloco do-while
        saida.append("do{\n");
        // Executa os comandos dentro do bloco do-while
        for (GramaParser.CmdContext cctx : ctx.cmd()) {
            super.visitCmd(cctx);
        }
        // Fecha o bloco do-while com a expressão condicional
        saida.append("}while(");
        super.visitExpressao(ctx.expressao());
        saida.append(");\n");

        return null;
    }

    //cmdEscreva	  : 'escreva' '(' expressao  (',' expressao)* ')';
    @Override
    public Void visitCmdEscreva(GramaParser.CmdEscrevaContext ctx) {

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

        for (GramaParser.ExpressaoContext ectx : ctx.expressao()) {
            String textoExpressao = ectx.getText();

            saida.append("printf(\"");

            // Verifica se a expressão contém aspas e imprime diretamente.
            if (textoExpressao.contains("\"")) {
                saida.append(textoExpressao.replace("\"", "")).append("\");\n");
            } else {
                Tipo tipoExp = verificarTipo(escopoAtual, ectx);
                String codTipoExp = tipoExp == Tipo.LITERAL ? "%s" : "%" + verificaParamTipo(tipoExp);
                saida.append(codTipoExp).append("\", ").append(textoExpressao).append(");\n");
            }
        }

        return null;
    }


    //cmdCaso 	  : 'caso' exp_aritmetica 'seja' selecao ('senao'  cmd*)? 'fim_caso';
    @Override
    public Void visitCmdCaso(GramaParser.CmdCasoContext ctx) {

        // Inicia o comando switch
        saida.append("switch (").append(ctx.exp_aritmetica().getText()).append(") {\n");

        // Executa os blocos do comando Caso
        for (GramaParser.Item_selecaoContext sctx : ctx.selecao().item_selecao()) {
            String strOriginal = sctx.constantes().numero_intervalo(0).getText();

            // Cada limitrofe tem suas características
            String limiteEsq = getLimitesCaso(strOriginal, true);
            String limiteDir = strOriginal.contains(".") ? getLimitesCaso(strOriginal, false) : limiteEsq;

            // Adiciona os casos no switch
            for (int i = Integer.parseInt(limiteEsq); i <= Integer.parseInt(limiteDir); i++) {
                saida.append("case ").append(i).append(":\n");
            }

            // Processa os comandos associados ao caso
            for (GramaParser.CmdContext cctx : sctx.cmd()) {
                visitCmd(cctx);
            }

            saida.append("break;\n");
        }

        // Processa o bloco default, se tiver
        if (!ctx.cmd().isEmpty()) {
            saida.append("default:\n");
            for (GramaParser.CmdContext cctx : ctx.cmd()) {
                visitCmd(cctx);
            }
        }

        saida.append("}\n");

        return null;
    }

    //cmdChamada 	  : IDENT '(' expressao  (',' expressao)* ')';
    @Override
    public Void visitCmdChamada(GramaParser.CmdChamadaContext ctx) {

        // Inicia a chamada da função/método
        String chamada = ctx.IDENT().getText() + "(";

        // Adiciona os parâmetros da chamada
        chamada += ctx.expressao().stream()
                     .map(GramaParser.ExpressaoContext::getText)
                     .collect(Collectors.joining(", "));

        // Finaliza a chamada e adiciona ao código de saída
        chamada += ");\n";
        saida.append(chamada);

        return null;
    }

}