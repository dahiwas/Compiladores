
package grupo.compiladores.t3;

import java.util.LinkedList;
import java.util.List;

//Será uma pilha para aninhar os escopos, criando em cima do antigo
public class Escopos {
    //Empiilhar cada escopo novo
    private LinkedList<TabelaDeSimbolos> pilhaDeTabelas;
    
    //Quando inicia já cria o novo escopo (global)
    public Escopos(){
        pilhaDeTabelas = new LinkedList<>();
        criarNovoEscopo();
    }
    
    //Basicamente empilha um novo escopo
    public void criarNovoEscopo(){
        pilhaDeTabelas.push(new TabelaDeSimbolos());
    }
    
    //Verificar o topo da pilha, sem remover, para ver qual é o escopo atual
    public TabelaDeSimbolos obterEscopoAtual(){
        return pilhaDeTabelas.peek();
    }
    
    //Percorrer os escopos 
    public List<TabelaDeSimbolos> percorrerEscoposAninhados(){
        return pilhaDeTabelas;
    }
    
    //Remover a tabela inteira quando acabar o escopo
    public void abandonarEscopo(){
        pilhaDeTabelas.pop();
    }

}
