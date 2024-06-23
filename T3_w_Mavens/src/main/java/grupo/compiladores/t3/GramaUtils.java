package grupo.compiladores.t3;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

import grupo.compiladores.t3.GramaParser.ExpressaoContext;
import grupo.compiladores.t3.GramaParser.Termo_logicoContext;
import grupo.compiladores.t3.GramaParser.Fator_logicoContext;
import grupo.compiladores.t3.GramaParser.Parcela_logicaContext;
import grupo.compiladores.t3.GramaParser.Exp_relacionalContext;
import grupo.compiladores.t3.GramaParser.Exp_aritmeticaContext;
import grupo.compiladores.t3.GramaParser.TermoContext;
import grupo.compiladores.t3.GramaParser.FatorContext;
import grupo.compiladores.t3.GramaParser.ParcelaContext;
import grupo.compiladores.t3.GramaParser.Parcela_unarioContext;
import grupo.compiladores.t3.GramaParser.Parcela_nao_unarioContext;
import grupo.compiladores.t3.GramaParser.Tipo_basicoContext;
import grupo.compiladores.t3.GramaParser.Tipo_estendidoContext;
import grupo.compiladores.t3.GramaParser.Tipo_basico_identContext;
import grupo.compiladores.t3.GramaParser.TipoContext;
import grupo.compiladores.t3.GramaParser.VariavelContext;
import grupo.compiladores.t3.GramaParser.IdentificadorContext;




public class GramaUtils {
    //Criar uma lista para conter todos os erros semanticos do programa
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem){
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
    //Na nossa gramatica é percorrido para encontrar o tipo: 
    // declaracoes -> declaracao_local_global -> declaracao_local -> variavel -> identificador -> IDENT
    //                                                                        -> tipo -> tipo_estendido -> tipo_basico
    
    
    
    //expressao -> termo_logico -> fator_logico -> parcela_logica -> exp_rrelacional -> exp_aritmetica -> op_relacional -> exp_aritmetica
    // -> termo -> fator -> parcela -> parcela_unario -> parcela_nao_unario
    
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, ExpressaoContext ctx){
        TabelaDeSimbolos.Tipo ret = null;
        //Passando pela lista de termos logicos
        for(Termo_logicoContext ta : ctx.termo_logico()){
            TabelaDeSimbolos.Tipo tmp = verificarTipo(tabela, ta);
            if (ret == null){
                ret = tmp;
            }
            if (ret == TabelaDeSimbolos.Tipo.LOGICO){
                return TabelaDeSimbolos.Tipo.LOGICO;
            }
            else if (ret != tmp && tmp != TabelaDeSimbolos.Tipo.INVALIDO){
                
                ret = TabelaDeSimbolos.Tipo.INVALIDO;
            }
        }
        
        return ret;
    }
    //Passa agora no fator lógico e assim por diante
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Termo_logicoContext ctx){
        TabelaDeSimbolos.Tipo ret = null;
        for (Fator_logicoContext ta : ctx.fator_logico()){
            TabelaDeSimbolos.Tipo tmp =  verificarTipo(tabela, ta);
            if (ret == null){
                ret = tmp;
            }
            if (ret == TabelaDeSimbolos.Tipo.LOGICO){
                return TabelaDeSimbolos.Tipo.LOGICO;
            }
            else if (ret != tmp && tmp != TabelaDeSimbolos.Tipo.INVALIDO){
                
                ret = TabelaDeSimbolos.Tipo.INVALIDO;
            }
        }
        return ret;
    }
    //fator_logico 	  : 'nao'? parcela_logica;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Fator_logicoContext ctx){
        //Caso tenha um 'nao' já é automaticamente fatorLogico
        if(ctx.NAO() != null){
            return TabelaDeSimbolos.Tipo.LOGICO;
        }
        //Caso não tem que se aprofundar ainda mais
        return verificarTipo(tabela, ctx.parcela_logica());
    }
    
    //parcela_logica	  : ('verdadeiro' | 'falso')  | exp_relacional;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Parcela_logicaContext ctx){
        if(ctx.TRUE() != null || ctx.FALSE() != null)
            return TabelaDeSimbolos.Tipo.LOGICO;
        return verificarTipo(tabela, ctx.exp_relacional());
    }
    
    //exp_relacional    : exp_aritmetica (op_relacional exp_aritmetica)?;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Exp_relacionalContext ctx){
        TabelaDeSimbolos.Tipo ret = null;
        
        //Caso tenha uma operação relacional será lógico
        if(ctx.op_relacional() != null)
            return TabelaDeSimbolos.Tipo.LOGICO;
        
        //Pega a lista de expressões aritmeticas
        for (Exp_aritmeticaContext ta : ctx.exp_aritmetica()){
            TabelaDeSimbolos.Tipo tmp = verificarTipo(tabela, ta);
            if(ret == null){
                ret = tmp;
            }
            else if(ret != tmp && tmp != TabelaDeSimbolos.Tipo.INVALIDO){
                
                ret = TabelaDeSimbolos.Tipo.INVALIDO;
            }
        }
        return ret;
        
    }
    
    //exp_aritmetica	  : termo (op1 termo)*;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.Tipo ret = null;
        for (TermoContext ta : ctx.termo()) {
            TabelaDeSimbolos.Tipo tmp = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = tmp;
            } else if (ret != tmp && !(isNumeric(ret) && isNumeric(tmp))) {
                ret = TabelaDeSimbolos.Tipo.INVALIDO;
            } else if (isNumeric(ret) && isNumeric(tmp)) {
                ret = (ret == TabelaDeSimbolos.Tipo.REAL || tmp == TabelaDeSimbolos.Tipo.REAL) ? 
                      TabelaDeSimbolos.Tipo.REAL : TabelaDeSimbolos.Tipo.INTEIRO;
            }
        }
        return ret;
    }

    public static boolean isNumeric(TabelaDeSimbolos.Tipo tipo) {
        return tipo == TabelaDeSimbolos.Tipo.REAL || tipo == TabelaDeSimbolos.Tipo.INTEIRO;
    }

    
    //termo	 	  : fator  (op2 fator)*;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, TermoContext ctx) {
        TabelaDeSimbolos.Tipo ret = null;
        for (FatorContext ta : ctx.fator()) {
            TabelaDeSimbolos.Tipo tmp = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = tmp;
            } else if (ret != tmp && !(isNumeric(ret) && isNumeric(tmp))) {
                ret = TabelaDeSimbolos.Tipo.INVALIDO;
            } else if (isNumeric(ret) && isNumeric(tmp)) {
                ret = (ret == TabelaDeSimbolos.Tipo.REAL || tmp == TabelaDeSimbolos.Tipo.REAL) ? 
                      TabelaDeSimbolos.Tipo.REAL : TabelaDeSimbolos.Tipo.INTEIRO;
            }
        }
        return ret;
    }

    
    //fator		  : parcela  (op3 parcela)*;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, FatorContext ctx) {
        TabelaDeSimbolos.Tipo ret = null;
        for (ParcelaContext ta : ctx.parcela()) {
            TabelaDeSimbolos.Tipo tmp = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = tmp;
            } else if (ret != tmp && !(isNumeric(ret) && isNumeric(tmp))) {
                ret = TabelaDeSimbolos.Tipo.INVALIDO;
            } else if (isNumeric(ret) && isNumeric(tmp)) {
                ret = (ret == TabelaDeSimbolos.Tipo.REAL || tmp == TabelaDeSimbolos.Tipo.REAL) ? 
                      TabelaDeSimbolos.Tipo.REAL : TabelaDeSimbolos.Tipo.INTEIRO;
            }
        }
        return ret;
    }

    //parcela		  : op_unario? parcela_unario | parcela_nao_unario;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, ParcelaContext ctx) {
        if (ctx.parcela_unario() != null)
            return verificarTipo(tabela, ctx.parcela_unario());
        else
            return verificarTipo(tabela, ctx.parcela_nao_unario());
    }

    
 /*parcela_unario	  : '^'? identificador
		  | IDENT '(' expressao  (',' expressao)* ')'
		  | NUM_INT | NUM_REAL | '(' expressao ')';
*/
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Parcela_unarioContext ctx) {
        if (ctx.NUM_INT() != null) {
            // Verificar se é especificamente zero
            if (ctx.NUM_INT().getText().equals("0")) {
                return TabelaDeSimbolos.Tipo.REAL; // Trate zero como compatível com real
            }
            return TabelaDeSimbolos.Tipo.INTEIRO;
        } else if (ctx.NUM_REAL() != null) {
            return TabelaDeSimbolos.Tipo.REAL;
        } else if (ctx.identificador() != null) {
            return verificarTipo(tabela, ctx.identificador());
        } else if (ctx.IDENT() != null) {
            TabelaDeSimbolos.Tipo ret = verificarTipo(tabela, ctx.IDENT().getText());
            for (ExpressaoContext fa : ctx.expressao()) {
                TabelaDeSimbolos.Tipo tmp = verificarTipo(tabela, fa);
                if (ret == null)
                    ret = tmp;
                else if (ret != tmp && tmp != TabelaDeSimbolos.Tipo.INVALIDO)
                    ret = TabelaDeSimbolos.Tipo.INVALIDO;
            }
            return ret;
        } else {
            TabelaDeSimbolos.Tipo ret = null;
            for (ExpressaoContext fa : ctx.expressao()) {
                TabelaDeSimbolos.Tipo tmp = verificarTipo(tabela, fa);
                if (ret == null) {
                    ret = tmp;
                } else if (ret != tmp && tmp != TabelaDeSimbolos.Tipo.INVALIDO)
                    ret = TabelaDeSimbolos.Tipo.INVALIDO;
            }
            return ret;
        }
    }



    //parcela_nao_unario: '&' identificador | CADEIA;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Parcela_nao_unarioContext ctx){
        TabelaDeSimbolos.Tipo ret = null;
        if(ctx.ENDERECAMEN() != null)
            return TabelaDeSimbolos.Tipo.PONTEIRO;
        else
            return TabelaDeSimbolos.Tipo.LITERAL;
    }
    
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, String nomeVar){
        TabelaDeSimbolos.Tipo tipo = null;
        //Como só tem 1 escopo
        tipo = tabela.verificar(nomeVar);
        return tipo;
    }
    
    //tipo_basico	  : 'literal' | 'inteiro' | 'real' | 'logico';
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Tipo_basicoContext ctx){
        if (ctx.LITERAL() != null)
            return TabelaDeSimbolos.Tipo.LITERAL;
        else if (ctx.INTEIRO() != null)
            return TabelaDeSimbolos.Tipo.INTEIRO;
        else if (ctx.LOGICO() != null)
            return TabelaDeSimbolos.Tipo.LOGICO;
        else if (ctx.REAL() != null)
            return TabelaDeSimbolos.Tipo.REAL;
        else{
            
            return TabelaDeSimbolos.Tipo.INVALIDO;
        }
    }
    //tipo_estendido    : '^'? tipo_basico_ident;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Tipo_estendidoContext ctx)
    {
        TabelaDeSimbolos.Tipo tipo;
        
        if(ctx.PONTEIRO() != null){
            return TabelaDeSimbolos.Tipo.PONTEIRO;
        }
        else
            tipo = verificarTipo(tabela, ctx.tipo_basico_ident());
        
        return tipo;
    }
    
    //tipo_basico_ident : tipo_basico | IDENT;
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, Tipo_basico_identContext ctx){
        TabelaDeSimbolos.Tipo tipo;
        
        if(ctx.tipo_basico() != null)
            return verificarTipo(tabela, ctx.tipo_basico());
        else 
            if(!tabela.existe(ctx.IDENT().getText()))
                return TabelaDeSimbolos.Tipo.INVALIDO;
            else
                tipo = TabelaDeSimbolos.Tipo.REGISTRO;
        return tipo;
    }
    
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, IdentificadorContext ctx){
        String nomeVar = "";
        TabelaDeSimbolos.Tipo ret = TabelaDeSimbolos.Tipo.INVALIDO;
        for(int i = 0; i < ctx.IDENT().size(); i++){
            nomeVar += ctx.IDENT(i).getText();
            if(i != ctx.IDENT().size() -1){
                nomeVar += ".";
            }
        }
        if(tabela.existe(nomeVar))
            ret = verificarTipo(tabela, nomeVar);
        
        return ret;
    }
    
    
    
}
