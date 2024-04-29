import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import com.compiladores.custom.SaidaCustom;

import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.atn.ATNConfigSet;

public class T2 {
    public static void main(String[] args) {
        //Verificação de erro caso não consiga encontrar o arquivo de entrada e o arquivo de saída
        if (args.length < 2) {
            System.out.println("Uso: java T1 <caminho completo do arquivo de entrada> <caminho completo do arquivo de saída>");
            return;
        }
        //Atribuição dos respectivos arquivos
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        //Verificação de erro caso não dê o caminho completo
        if (!inputFile.isAbsolute() || !outputFile.isAbsolute()) {
            System.out.println("Erro: Por favor, forneça caminhos completos para os arquivos de entrada e saída.");
            return;
        }
        //Verificação de erro caso não exista
        if (!inputFile.exists()) {
            System.out.println("Erro: O arquivo de entrada não existe: " + inputFile.getAbsolutePath());
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            //Seria a variável que percorrerá por todos os tokens identificados do arquivo de entrada
            CharStream cs = CharStreams.fromFileName(inputFile.getAbsolutePath());
            //Utilização da gramática compilada anteriormente, perceba que o nome GramaLexer foi o definido anteriormente
            GramaLexer lex = new GramaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            GramaParser parser = new GramaParser(tokens);
            SaidaCustom saidaCustom = new SaidaCustom(writer);
            


            Token t = null;
            
            // SAIDA DO LEXER
                //Percorre por todo o documento de entrada
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String nomeToken = GramaLexer.VOCABULARY.getDisplayName(t.getType());
                //Separação pela nomenclatura dos tokens encontrados na gramática dada
                //Cada separação terá seu respectivo log no arquivo de saída
                if(nomeToken.equals("ERRO")){
                    writer.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                    writer.println("Fim da compilacao");
                    return;
                } else if(nomeToken.equals("OPEN_COMMENT")){
                    writer.println("Linha "+t.getLine()+": comentario nao fechado");
                    writer.println("Fim da compilacao");
                    return;
                } else if(nomeToken.equals("OPEN_CADEIA")){
                    writer.println("Linha "+t.getLine()+": cadeia literal nao fechada");
                    writer.println("Fim da compilacao");
                    return;
                }
            }

            cs = CharStreams.fromFileName(inputFile.getAbsolutePath());
            //Utilização da gramática compilada anteriormente, perceba que o nome GramaLexer foi o definido anteriormente
            lex = new GramaLexer(cs);
            tokens = new CommonTokenStream(lex);
            parser = new GramaParser(tokens);
            saidaCustom = new SaidaCustom(writer);
            parser.addErrorListener(saidaCustom);
            parser.programa();


	    

        //Log de erro no terminal
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao acessar ou escrever nos arquivos.");
            e.printStackTrace();
	}
    }
}