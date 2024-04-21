#!/bin/bash
# mprime uma mensagem de status
echo "Compilando a gramática..."
ANTLR_JAR="/home/ubuntu/comp/t1/antlr-4.13.1-complete.jar"
# Gera os arquivos fonte do ANTLR a partir da gramática
java -jar $ANTLR_JAR Grama.g4 || { echo "Falha na compilação da gramática"; exit 1; }

# Imprime uma mensagem de status
echo "Compilando arquivos Grama*.java..."

# Compila os arquivos Java gerados pelo ANTLR
javac Grama*.java || { echo "Falha na compilação dos arquivos Grama*.java"; exit 1; }

# Imprime uma mensagem de status
echo "Compilando o arquivo Java..."

# Compila todos os arquivos Java no diretório /home/ubuntu/comp/t1 e coloca os resultados no diretório bin
javac -classpath .:/home/ubuntu/comp/t1/antlr-4.13.1-complete.jar -d bin /home/ubuntu/comp/t1/*.java || { echo "Falha na compilação dos arquivos Java"; exit 1; }

# Imprime uma mensagem de status
echo "Empacotando no arquivo JAR..."

# Cria um arquivo JAR executável
jar cvfm t1.jar manifest.txt -C bin/ . || { echo "Falha ao empacotar no arquivo JAR"; exit 1; }

# Imprime uma mensagem de sucesso
echo "Processo concluído com sucesso!"
