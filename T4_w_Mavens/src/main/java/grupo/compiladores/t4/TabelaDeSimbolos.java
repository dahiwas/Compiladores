package grupo.compiladores.t4;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {

    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
        
    }

    public enum Tipo {
        INTEIRO,
        REAL,
        LITERAL,
        LOGICO,
        VOID,
        REGISTRO,
        INVALIDO
    }

    public enum TipoEntrada {
        VARIAVEL,
        PROCEDIMENTO,
        FUNCAO
    }

    class EntradaTabelaDeSimbolos {
        String nome;
        Tipo tipo;
        TipoEntrada tipoE;

        private EntradaTabelaDeSimbolos(String nome, Tipo tipo, TipoEntrada tipoE) {
            this.nome = nome;
            this.tipo = tipo;
            this.tipoE = tipoE;
        }
    }

    // Método para coletar mais rapidamente o nome, retirando o delimitador
    private String normalizarNome(String nome) {
        int posicao = nome.indexOf("[");
        if (posicao != -1) {
            return nome.substring(0, posicao);
        }
        return nome;
    }

    public Tipo verificar(String nome) {
        // Normaliza o nome da variável.
        nome = normalizarNome(nome);

        EntradaTabelaDeSimbolos entrada = tabela.get(nome);
        if (entrada == null) {
            return Tipo.INVALIDO;
        }

        return entrada.tipo;
    }

    public void adicionar(String nome, Tipo tipo, TipoEntrada tipoE) {
        // Normaliza o nome da variável.
        nome = normalizarNome(nome);

        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, tipoE));
    }

    public boolean existe(String nome) {
        // Normaliza o nome da variável.
        nome = normalizarNome(nome);

        return tabela.containsKey(nome);
    }
    

}
