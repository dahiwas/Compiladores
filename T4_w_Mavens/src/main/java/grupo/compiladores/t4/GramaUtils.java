package grupo.compiladores.t4;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.antlr.v4.runtime.Token;

import grupo.compiladores.t4.GramaParser.*;

import static grupo.compiladores.t4.VisitorCustom.gerenciadorEscopos;

public class GramaUtils {    
    public static List<String> listaErrosSemanticos = new ArrayList<>();

    // Adiciona um erro semântico à lista de erros, incluindo a linha e a mensagem do erro
    public static void adicionaErroSemantico(Token token, String mensagem) {
        int linhaErro = token.getLine();
        String erroFormatado = String.format("Linha %d: %s", linhaErro, mensagem);

        if (!listaErrosSemanticos.contains(erroFormatado)) {
            listaErrosSemanticos.add(erroFormatado);
        }
    } 

    // Determina o tipo de uma variável baseado na tabela de símbolos e no nome do tipo
    public static TabelaDeSimbolos.Tipo determinarTipo(HashMap<String, ArrayList<String>> tabela, String tipoStr) {
        if (tipoStr.charAt(0) == '^') {
            tipoStr = tipoStr.substring(1); // Remove o caractere de ponteiro
        }
        
        if (tabela.containsKey(tipoStr)) return TabelaDeSimbolos.Tipo.REGISTRO;
        switch (tipoStr) {
            case "literal":
                return TabelaDeSimbolos.Tipo.LITERAL;
            case "inteiro":
                return TabelaDeSimbolos.Tipo.INTEIRO;
            case "real":
                return TabelaDeSimbolos.Tipo.REAL;
            case "logico":
                return TabelaDeSimbolos.Tipo.LOGICO;
            default:
                return TabelaDeSimbolos.Tipo.INVALIDO;
        }
    }
    
    // Determina o tipo de uma variável baseado no nome do tipo
    public static TabelaDeSimbolos.Tipo determinarTipo(String nome){
        nome = nome.replaceFirst("^\\^", ""); // Remove o caractere de ponteiro
        
        switch (nome) {
            case "literal":
                return TabelaDeSimbolos.Tipo.LITERAL;
            case "inteiro":
                return TabelaDeSimbolos.Tipo.INTEIRO;
            case "real":
                return TabelaDeSimbolos.Tipo.REAL;
            case "logico":
                return TabelaDeSimbolos.Tipo.LOGICO;
            case "void":
                return TabelaDeSimbolos.Tipo.VOID;
            case "registro":
                return TabelaDeSimbolos.Tipo.REGISTRO;
            default:
                return TabelaDeSimbolos.Tipo.INVALIDO;
        }
    }

    /*
    Verifica o tipo de uma expressão aritmética.
    exp_aritmetica : termo (op1 termo)*;
    */
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.Tipo tipoInicial = verificarTipo(tabela, ctx.termo().get(0)); // Verifica o tipo do primeiro termo
        for (TermoContext termo : ctx.termo()) {
            TabelaDeSimbolos.Tipo tipoAtual = verificarTipo(tabela, termo); // Coleta o tipo do termo atual
            if (tipoInicial != tipoAtual) { // Verifica a compatibilidade entre tipos
                tipoInicial = tipoAtual;
            }
        }
        return tipoInicial;
    }

    // Verifica o tipo de um termo
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, TermoContext ctx) {
        TabelaDeSimbolos.Tipo tipoInicial = verificarTipo(tabela, ctx.fator().get(0));
        for (FatorContext fator : ctx.fator()) {
            //Para cada termo ele verifica o tipo e se é igual
            TabelaDeSimbolos.Tipo tipoAtual = verificarTipo(tabela, fator);
            if (tipoInicial != tipoAtual) {
                tipoInicial = tipoAtual;
            }
        }
        return tipoInicial;
    }

    // Verifica o tipo de um fator
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, FatorContext ctx) {
        TabelaDeSimbolos.Tipo tipoFinal = null;
        for (ParcelaContext parcela : ctx.parcela()) {
            tipoFinal = verificarTipo(tabela, parcela);
            if (tipoFinal == TabelaDeSimbolos.Tipo.REGISTRO) {  
                String nome = parcela.getText();
                if (nome.contains("(")) {
                    int posicao = parcela.getText().indexOf("(");
                    nome = nome.substring(0, posicao);
                }
                tipoFinal = verificarTipo(tabela, nome);
            }
        }
        return tipoFinal;
    }

    // Verifica o tipo de uma parcela
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, ParcelaContext ctx) {
        //Verifica se possui parcela_unaria
        if (ctx.parcela_unario() != null) {
            return verificarTipo(tabela, ctx.parcela_unario());
        } else {
            return verificarTipo(tabela, ctx.parcela_nao_unario());
        }
    }

    // Verifica o tipo de uma parcela unária
    /*
    parcela_unario	  : PONTEIRO? identificador
		  | IDENT '(' expressao  (',' expressao)* ')'
		  | NUM_INT | NUM_REAL | '(' expressao ')';
    */
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Parcela_unarioContext ctx) {
        TabelaDeSimbolos.Tipo tipoFinal = null;
        String nome;
        //Veifica se possui identficador
        if (ctx.identificador() != null) {
            //Verifica se possui exp_aritimetica
            if (!ctx.identificador().dimensao().exp_aritmetica().isEmpty()) {
                nome = ctx.identificador().IDENT().get(0).getText();
            } else {
                nome = ctx.identificador().getText();
            }
            //Verifica se existe no escopo atual
            if (tabela.existe(nome)) {
                tipoFinal = tabela.verificar(nome);
            } else {
                TabelaDeSimbolos escopoAtual = gerenciadorEscopos.obterEscopoAtual();
                if (!escopoAtual.existe(nome)) {
                    adicionaErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                    tipoFinal = TabelaDeSimbolos.Tipo.INVALIDO;
                } else {
                    tipoFinal = escopoAtual.verificar(nome);
                }
            }
        } else if (ctx.IDENT() != null) {
            //Procura a função/procedimento que utiliza esses parâmetros e vê se é compatível
            if (gerenciadorEscopos.existe_hash_func_proc(ctx.IDENT().getText())) {
                List<TabelaDeSimbolos.Tipo> listaTipos = gerenciadorEscopos.tabela_func_proc(ctx.IDENT().getText());
                if (listaTipos.size() == ctx.expressao().size()) {
                    //Para cada expressão faz a verificação de compatibilidade
                    for (int i = 0; i < ctx.expressao().size(); i++) {
                        if (listaTipos.get(i) != verificarTipo(tabela, ctx.expressao().get(i))) {
                            adicionaErroSemantico(ctx.expressao().get(i).getStart(), "incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());
                        }
                    }
                    tipoFinal = listaTipos.get(listaTipos.size() - 1);
                } else {
                    adicionaErroSemantico(ctx.IDENT().getSymbol(), "incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());
                }
            } else {
                tipoFinal = TabelaDeSimbolos.Tipo.INVALIDO;
            }
        } else if (ctx.NUM_INT() != null) {
            tipoFinal = TabelaDeSimbolos.Tipo.INTEIRO;
        } else if (ctx.NUM_REAL() != null) {
            tipoFinal = TabelaDeSimbolos.Tipo.REAL;
        } else {
            tipoFinal = verificarTipo(tabela, ctx.expressao().get(0));
        }

        return tipoFinal;
    }

    // Verifica o tipo de uma parcela não-unária
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Parcela_nao_unarioContext ctx) {
        TabelaDeSimbolos.Tipo tipoFinal;
        String nome;

        //Verifica o identificador, se existe
        if (ctx.identificador() != null) {
            nome = ctx.identificador().getText();
            if (!tabela.existe(nome)) {
                adicionaErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                tipoFinal = TabelaDeSimbolos.Tipo.INVALIDO;
            } else {
                tipoFinal = tabela.verificar(ctx.identificador().getText());
            }
        } else {
            tipoFinal = TabelaDeSimbolos.Tipo.LITERAL;
        }

        return tipoFinal;
    }

    // Verifica o tipo de uma expressão
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, ExpressaoContext ctx) {
        TabelaDeSimbolos.Tipo tipoInicial = verificarTipo(tabela, ctx.termo_logico(0));
        //Para cada termologico ele faz a verificação da compatibilidade se são iguais ou válidos
        for (Termo_logicoContext termoLogico : ctx.termo_logico()) {
            TabelaDeSimbolos.Tipo tipoAtual = verificarTipo(tabela, termoLogico);
            if (tipoInicial != tipoAtual && tipoAtual != TabelaDeSimbolos.Tipo.INVALIDO) {
                tipoInicial = TabelaDeSimbolos.Tipo.INVALIDO;
            }
        }
        return tipoInicial;
    }

    // Verifica o tipo de um termo lógico
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Termo_logicoContext ctx) {
        TabelaDeSimbolos.Tipo tipoInicial = verificarTipo(tabela, ctx.fator_logico(0));
        for (Fator_logicoContext fatorLogico : ctx.fator_logico()) {
            //Para cada fator_lógico verifica se são iguais ou válidos
            TabelaDeSimbolos.Tipo tipoAtual = verificarTipo(tabela, fatorLogico);
            if (tipoInicial != tipoAtual && tipoAtual != TabelaDeSimbolos.Tipo.INVALIDO) {
                tipoInicial = TabelaDeSimbolos.Tipo.INVALIDO;
            }
        }
        return tipoInicial;
    }

    // Verifica o tipo de um fator lógico
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Fator_logicoContext ctx) {
        return verificarTipo(tabela, ctx.parcela_logica());
    }

    // Verifica o tipo de uma parcela lógica
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Parcela_logicaContext ctx) {
        if (ctx.exp_relacional() != null) {
            return verificarTipo(tabela, ctx.exp_relacional());
        } else {
            return TabelaDeSimbolos.Tipo.LOGICO;
        }
    }

    // Verifica o tipo de uma expressão relacional
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Exp_relacionalContext ctx) {
        TabelaDeSimbolos.Tipo tipoInicial = verificarTipo(tabela, ctx.exp_aritmetica().get(0));
        if (ctx.exp_aritmetica().size() > 1) {
            //Caso tenha mais de uma expressão matemática verificara a compatibilidade entre eles
            TabelaDeSimbolos.Tipo tipoAtual = verificarTipo(tabela, ctx.exp_aritmetica().get(1));
            if (tipoInicial == tipoAtual ) {
                tipoInicial = TabelaDeSimbolos.Tipo.LOGICO;
            } else {
                tipoInicial = TabelaDeSimbolos.Tipo.INVALIDO;
            }
        }
        return tipoInicial;
    }
    
    // Verifica o tipo de um identificador
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, IdentificadorContext ctx) {
        String nomeVar = ctx.IDENT().get(0).getText();
        return tabela.verificar(nomeVar);
    }

    // Verifica o tipo de uma variável pelo nome
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}
