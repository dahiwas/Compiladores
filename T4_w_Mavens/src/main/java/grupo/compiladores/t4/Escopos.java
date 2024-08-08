
package grupo.compiladores.t4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Escopos {

    private final LinkedList<TabelaDeSimbolos> pilhaDeTabelas;
    //Temos dados que devem percorrer todos os escopos, como nomes de variaveis que não podem se repetir mesmo em escopos diferentes
    private final HashMap<String, ArrayList<TabelaDeSimbolos.Tipo>> dadosFuncProc;
    private final HashMap<String, ArrayList<String>> dadosRegistro;
    

    public Escopos() {
        pilhaDeTabelas = new LinkedList<>();
        this.dadosFuncProc = new HashMap<>();
        this.dadosRegistro = new HashMap<>();
        criarNovoEscopo();
    }

    public void criarNovoEscopo() {
        pilhaDeTabelas.push(new TabelaDeSimbolos());
    }

    public TabelaDeSimbolos obterEscopoAtual() {
        return pilhaDeTabelas.peek();
    }

    public List<TabelaDeSimbolos> percorrerEscoposAninhados() {
        return pilhaDeTabelas;
    }
    
    public void abandonarEscopo(){
        pilhaDeTabelas.pop();
    }
    //Métodos para gerenciamento dos hashmaps que armazenam as funções/procedimentos e registros
    public boolean existe_hash_func_proc(String nome){
        return dadosFuncProc.containsKey(nome);
    }
    
    public void adicionar_func_proc(String nome, ArrayList<TabelaDeSimbolos.Tipo> tipo){
        dadosFuncProc.put(nome, tipo);
    }
    
    public List<TabelaDeSimbolos.Tipo> tabela_func_proc(String nome){
        return dadosFuncProc.get(nome);
    }
    
    public boolean existe_registro(String nome){
        return dadosRegistro.containsKey(nome);
    }
    
    public ArrayList<String> tabela_registro(String nome){
        return dadosRegistro.get(nome);
    }
    
    public void adicionar_registro(String nome, ArrayList<String> lista){
        dadosRegistro.put(nome, lista);
    }
    
    public HashMap<String, ArrayList<String>> registro(){
        return dadosRegistro;
    }
    
}
