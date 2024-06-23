package grupo.compiladores.t3;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    
    public enum Tipo{
        INTEIRO,
        REAL,
        LOGICO,
        LITERAL,
        PONTEIRO,
        REGISTRO,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos{
        String nome;
        Tipo tipo;
        
        private EntradaTabelaDeSimbolos(String nome, Tipo tipo){
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos(){
        this.tabela = new HashMap<>();
    }
    
    public void inserir(String nome, Tipo tipo){
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome){
        return tabela.containsKey(nome);
    }
    
    //Retorna o tipo de uma variavel, eu passo o nome e verifico o tipo daquela variavel declarada
    public Tipo verificar(String nome){
        return tabela.get(nome).tipo;
    }
    
    // Método para imprimir a tabela de símbolos
    public void imprimirTabela() {
        tabela.forEach((nome, entrada) -> {
            System.out.println("Nome: " + nome + ", Tipo: " + entrada.tipo);
        });
    }
}
