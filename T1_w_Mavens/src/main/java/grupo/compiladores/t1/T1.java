package grupo.compiladores.t1;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class T1 {
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
            Grama lex = new Grama(cs);
            
            Token t = null;
            //Percorre por todo o documento de entrada
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String nomeToken = Grama.VOCABULARY.getDisplayName(t.getType());
                //Separação pela nomenclatura dos tokens encontrados na gramática dada
                //Cada separação terá seu respectivo log no arquivo de saída
                if(nomeToken.equals("ERRO")){
                    writer.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                    break;
                } else if(nomeToken.equals("OPEN_COMMENT")){
                    writer.println("Linha "+t.getLine()+": comentario nao fechado");
                    break;
                } else if(nomeToken.equals("OPEN_CADEIA")){
                    writer.println("Linha "+t.getLine()+": cadeia literal nao fechada");
                    break;
                } else {
                    writer.println("<"+"'"+t.getText()+"'"+","+nomeToken+">");
                }
        //Log de erro no terminal
        }} catch (IOException e) {
            System.out.println("Ocorreu um erro ao acessar ou escrever nos arquivos.");
            e.printStackTrace();
        }
    }
}
