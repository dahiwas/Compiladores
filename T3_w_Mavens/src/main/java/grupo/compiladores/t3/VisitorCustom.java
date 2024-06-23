package grupo.compiladores.t3;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import org.antlr.v4.runtime.Token;

import org.antlr.v4.runtime.ParserRuleContext;

import static grupo.compiladores.t3.GramaUtils.verificarTipo;

public class VisitorCustom extends GramaBaseVisitor<Void>{
    TabelaDeSimbolos tabela;
    
    //Gera
    @Override
    public Void visitPrograma(GramaParser.ProgramaContext ctx){
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }
    
    //Consegue captar todos -> declaracao_local  : 'declare' variavel 
    @Override
    public Void visitDeclaracao_local(GramaParser.Declaracao_localContext ctx){
        
        if (ctx.DECLARE() != null){
            String nomeVar = ctx.variavel().getText();
            //System.out.println(nomeVar);
        }
        return super.visitDeclaracao_local(ctx);
    }
    
    //variavel	  : identificador (',' identificador)* ':' tipo;
    @Override
    public Void visitVariavel(GramaParser.VariavelContext ctx){
        
        //Para descobrir a origem dessa visita, verificaremos de onde está vindo para saber se é para add ou não
        String parentCtx = ctx.getParent().getClass().getSimpleName();
        
        //Se passar por essa condição, com certeza será para adicionar
        if ("Declaracao_localContext".equalsIgnoreCase(parentCtx))
        {
            //Pegar o tipo da variável
            TabelaDeSimbolos.Tipo tipo;
            String nomesVar;
            //Verifica a existência do tipo
            String nomeTipo = ctx.tipo().getText();
            if ("LITERAL".equalsIgnoreCase(nomeTipo)){
                tipo = TabelaDeSimbolos.Tipo.LITERAL;
                //Debug
                //System.out.println("A");
            }
            else if ("INTEIRO".equalsIgnoreCase(nomeTipo)){
                tipo = TabelaDeSimbolos.Tipo.INTEIRO;
                //Debug
                //System.out.println("B");
            }
            else if ("REAL".equalsIgnoreCase(nomeTipo)){
                tipo = TabelaDeSimbolos.Tipo.REAL;
                //Debug
                //System.out.println("C");
            }
            else if ("LOGICO".equalsIgnoreCase(nomeTipo)){
                tipo = TabelaDeSimbolos.Tipo.LOGICO;
                //Debug
                //System.out.println("D");
            }
            else{
                tipo = TabelaDeSimbolos.Tipo.INVALIDO;
                //Debug
                //System.out.println("E");
                GramaUtils.adicionarErroSemantico(ctx.start, "tipo " + nomeTipo + " nao declarado");
            }
                        
                //Passa por toda a lista de identificadores encontrados
            //É importante verificar se esse nome já foi adicionado antes
            
            for (int i = 0; i < ctx.identificador().size(); i++){
                nomesVar = ctx.identificador().get(i).getText();
                if (!tabela.existe(nomesVar)){
                    tabela.inserir(nomesVar, tipo);
                    System.out.println("Variável inserida: " + nomesVar + " do tipo " + tipo);
                }
                else{
                    GramaUtils.adicionarErroSemantico(ctx.identificador(i).start, "identificador " + nomesVar + " ja declarado anteriormente");
                }         
            }
            //Análise
            //tabela.imprimirTabela(); 
        }
        return super.visitVariavel(ctx);
    }
    
    @Override 
    public Void visitIdentificador(GramaParser.IdentificadorContext ctx){
        String parentCtx = ctx.getParent().getClass().getSimpleName();
        
        //Não será para inserir, será um comando
        if (!"VariavelContext".equalsIgnoreCase(parentCtx) && !"ParametroContext".equalsIgnoreCase(parentCtx)){
            //Necessário verificar ses ele existe
            for (int i = 0; i < ctx.IDENT().size(); i++){
                String nomesVar = ctx.IDENT().get(i).getText();
                if (!tabela.existe(nomesVar)){
                    System.out.println("Variável não existe: " + nomesVar);
                    GramaUtils.adicionarErroSemantico(ctx.IDENT(i).getSymbol(), "identificador " + nomesVar + " nao declarado");
                    return super.visitIdentificador(ctx);
                }   
            }
        }
        return super.visitIdentificador(ctx);
    }
    
    //cmdAtribuicao : '^'? identificador '<-' expressao;
    @Override
    public Void visitCmdAtribuicao(GramaParser.CmdAtribuicaoContext ctx) {
        String varNome = ctx.identificador().getText();
        TabelaDeSimbolos.Tipo tipoVariavel = tabela.verificar(varNome);

        if (tipoVariavel == null) {
            Token startToken = ctx.identificador().start;
            GramaUtils.adicionarErroSemantico(startToken, "variável " + varNome + " não declarada");
            return super.visitCmdAtribuicao(ctx);
        }

        TabelaDeSimbolos.Tipo tipoExpressao = verificarTipo(tabela, ctx.expressao());

        // Verificar se a expressão é especificamente zero
        boolean isZero = ctx.expressao().getText().equals("0");

        if (tipoVariavel != tipoExpressao && !(GramaUtils.isNumeric(tipoVariavel) && GramaUtils.isNumeric(tipoExpressao)) && !isZero) {
            Token startToken = ctx.identificador().start;
            GramaUtils.adicionarErroSemantico(startToken, "atribuicao nao compativel para " + varNome);
        }

        return super.visitCmdAtribuicao(ctx);
    }


    
}
