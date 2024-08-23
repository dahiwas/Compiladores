grammar Grama;

//Regra de Parser

programa : declaracoes 'algoritmo' corpo 'fim_algoritmo' EOF;

declaracoes : (decl_local_global)*;

decl_local_global : declaracao_local | declaracao_global;

declaracao_local : 'declare' variavel
                 | 'constante' IDENT ':' tipo_basico '=' valor_constante
                 | 'tipo' IDENT ':' tipo;

variavel : identificador (',' identificador)* ':' tipo;

identificador : IDENT ('.' IDENT)* dimensao;

dimensao : ('[' exp_aritmetica ']')*;

tipo : registro | tipo_estendido;

tipo_basico : 'literal' | 'inteiro' | 'real' | 'logico';

tipo_basico_ident : tipo_basico | IDENT;

tipo_estendido : ('^')? tipo_basico_ident;

valor_constante : CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso';

registro : 'registro' (variavel)* 'fim_registro';

declaracao_global : 'procedimento' IDENT '(' (parametros)? ')' (declaracao_local)* (cmd)* 'fim_procedimento'
                  | 'funcao' IDENT '(' (parametros)? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao';

parametro : 'var'? identificador (',' identificador)* ':' tipo_estendido;

parametros : parametro (',' parametro)*;

corpo : (declaracao_local)* (cmd)*;

cmd : cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto
    | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne;

cmdLeia : 'leia' '(' ('^')? identificador (',' ('^')? identificador)* ')';

cmdEscreva : 'escreva' '(' expressao (',' expressao)* ')';

cmdSe : 'se' expressao 'entao' (cmdEntao+=cmd)* ('senao' (cmdSenao+=cmd)*)? 'fim_se';

cmdCaso : 'caso' exp_aritmetica 'seja' selecao ('senao' (cmd)*)? 'fim_caso';

cmdPara : 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para';

cmdEnquanto : 'enquanto' expressao 'faca' cmd* 'fim_enquanto';

cmdFaca : 'faca' (cmd)* 'ate' expressao;

cmdAtribuicao : ('^')? identificador '<-' expressao;

cmdChamada : IDENT '(' expressao (',' expressao)* ')';

cmdRetorne : 'retorne' expressao;

selecao : (item_selecao)*;

item_selecao : constantes ':' (cmd)*;

constantes : numero_intervalo (',' numero_intervalo)*;

numero_intervalo : (op_unario)? NUM_INT ('..' (op_unario)? NUM_INT)?;

op_unario : '-';

exp_aritmetica : termo (op1 termo)*;
termo : fator (op2 fator)*;
fator : parcela (op3 parcela)*;
op1 : '+' | '-';
op2 : '*' | '/';
op3 : '%';

parcela : (op_unario)? parcela_unario | parcela_nao_unario;

parcela_unario : ('^')? identificador
               | IDENT '(' expressao (',' expressao)* ')'
               | NUM_INT
               | NUM_REAL
               | '(' expressao ')';

parcela_nao_unario : '&' identificador | CADEIA;

exp_relacional : exp_aritmetica (op_relacional exp_aritmetica)?;

op_relacional : '=' | '<>' | '>=' | '<=' | '>' | '<';

expressao : termo_logico (op_logico_1 termo_logico)*;

termo_logico : fator_logico (op_logico_2 fator_logico)*;

fator_logico : ('nao')? parcela_logica;

parcela_logica : ('verdadeiro' | 'falso')+ | exp_relacional;

op_logico_1 : 'ou';

op_logico_2 : 'e';

// Regras de Lexer

// Palavras-chave que definem a estrutura básica e tipos de dados na linguagem.
ALGORITMO   : 'algoritmo';              //Define o inicio do algoritmo        
FIM_ALGORITMO : 'fim_algoritmo';        //Define o fim do algoritmo      
DECLARE     : 'declare';                //Define declaração de variaveis
LEIA        : 'leia';                   //Comando para ler a entrada do usuário
ESCREVA     : 'escreva';                //Comando para escrever a saída para o usuário

//Tipos de variáveis
LITERAL     : 'literal';                //Define o tipo de variável string
INTEIRO     : 'inteiro';                //Define o tipo de variavel int
REAL        : 'real';                   //Define o tipo de variável real


// Operadores Lógicos
E           : 'e';                      // Operador lógico AND: 
LOGICO	    : 'logico';                 // Tipo de dados para valores booleanos.
NAO         : 'nao';                    // Operador lógico NOT
OU          : 'ou';                     // Operador lógico OR
SENAO       : 'senao';                  // Usado para especificar um bloco alternativo em estruturas condicionais. 
ENTAO       : 'entao';                  // Segue uma condição em uma declaração SE 


// Condicionais
SE          : 'se';               // Inicia um bloco condicional. 
FIMSE       : 'fim_se';           // Encerra um bloco condicional iniciado com SE.
CASO        : 'caso';             // Inicia uma estrutura de seleção múltipla, semelhante ao switch em outras linguagens.
SEJA        : 'seja';             // Inicia um caso específico dentro de uma estrutura de seleção múltipla CASO.
FIMCASO     : 'fim_caso';         // Encerra uma estrutura de seleção múltipla iniciada com CASO.

// Estruturas de loop
PARA        : 'para';             // Inicia uma estrutura de loop determinado, onde o número de iterações é conhecido antes do início do loop.
ATE         : 'ate';              // Usado com PARA para definir o valor final da condição de contagem do loop.
FACA        : 'faca';             // Usado em estruturas de loop (PARA, ENQUANTO) para indicar o início do bloco de comandos que será repetido.
FIMPARA     : 'fim_para';         // Encerra uma estrutura de loop iniciada com PARA.
ENQUANTO    : 'enquanto';         // Inicia um loop enquanto a condição especificada for verdadeira, podendo não executar nenhuma vez se a condição inicial for falsa.
FIMENQNT    : 'fim_enquanto';     // Encerra um loop iniciado com ENQUANTO.

// Estruturas de Dados e Tipos
REGISTRO    : 'registro';              // Inicia a definição de um tipo de dado estruturado, similar a uma 'struct' em C.
FIMREGISTRO : 'fim_registro';          // Finaliza a definição de um tipo de dado estruturado.
PROCEDIMENTO: 'procedimento';          // Inicia a definição de um procedimento, que é uma função que não retorna valor.
FIMPROC     : 'fim_procedimento';      // Finaliza a definição de um procedimento.
TIPO        : 'tipo';                  // Usado para definir novos tipos de dados personalizados.
VARIAVEL    : 'var';                   // Palavra-chave para declarar variáveis.
FUNCAO      : 'funcao';                // Inicia a definição de uma função, que pode retornar um valor.
FIMFUNCAO   : 'fim_funcao';            // Finaliza a definição de uma função.
RETORNE     : 'retorne';               // Usado dentro de uma função para retornar um valor.

// Constantes e Valores Booleanos
CONSTANTE   : 'constante';             // Declaração de uma constante, cujo valor não pode ser alterado após sua inicialização.
TRUE        : 'verdadeiro';            // Representa o valor booleano 'true'.
FALSE       : 'falso';                 // Representa o valor booleano 'false'.

// Regras de Lexer para símbolos e operadores

// Operadores aritméticos
SOMA        : '+';              // Operador de adição.
DIV         : '/';              // Operador de divisão.
SUB         : '-';              // Operador de subtração.
MULT        : '*';              // Operador de multiplicação.
RESTO       : '%';              // Operador de resto de divisão.

// Operadores de atribuição e acesso
ASSIGN      : '<-';             // Operador de atribuição.
CONT        : '..';             // Operador de continuidade em intervalos, por exemplo, em loops ou arrays.
PONTEIRO    : '^';              // Operador de referência a endereço de memória.
ENDERECAMEN : '&';              // Operador de obtenção de endereço de memória.

// Símbolos diversos
PONTO       : '.';              // Ponto, usado para acessar membros de registros ou em números decimais.
MAIOR       : '>';              // Operador maior que.
MENOR       : '<';              // Operador menor que.
MAIORIGUAL  : '>=';             // Operador maior ou igual que.
MENORIGUAL  : '<=';             // Operador menor ou igual que.
IGUAL       : '=';              // Operador de comparação de igualdade.
LESSMORE    : '<>';             // Operador de comparação de diferença.

// Símbolos de pontuação
COLON       : ':';              // Dois-pontos, usado geralmente em declarações ou definições.
COMMA       : ',';              // Vírgula, usada para separar itens em listas.
LCOL        : '[';              // Colchete esquerdo, usado para definir início de arrays ou listas.
RCOL        : ']';              // Colchete direito, usado para definir fim de arrays ou listas.
LPAREN      : '(';              // Parêntese esquerdo, usado para iniciar listas de argumentos ou expressões.
RPAREN      : ')';              // Parêntese direito, usado para finalizar listas de argumentos ou expressões.
SEMICOLON   : ';';              // Ponto e vírgula, usado para terminar declarações ou comandos.

// Pula espaços em branco
WS          : [ \t\r\n]+ -> skip;

// Delimitação de cadeia iniciada e finalizada por aspas, podendo conter qualquer caractere exceto quebra de linha, 
// a menos que seja precedido por uma barra de escape.

CADEIA : '"' ( ~["\\\n"] | '\\' . )* '"';

// Regra para cadeias de caracteres iniciadas por aspas mas não finalizadas antes de uma nova linha, usada para 
//capturar erros de strings não fechadas.

OPEN_CADEIA : '"' ( ~["\\\n"] | '\\' . )* '\n';

//Este fragmento é definido para capturar uma barra invertida seguida por qualquer caractere. É útil para definir 
//sequências de escape em strings ou outras estruturas dentro de sua linguagem.

fragment 
ESC_SEQ: '\\'. ;

// Comentários delimitados por chaves. Ignora o conteúdo entre `{` e `}`, incluindo sequências de escape, 
//exceto novas linhas e o caractere de fechamento.

COMMENT : '{' (ESC_SEQ | ~('\n' | '}'))* '}' { skip(); };

// Comentários de uma linha iniciados com `{` e terminados pela quebra de linha, útil para tratar linhas de 
//comentários que não são explicitamente fechadas.

OPEN_COMMENT : '{' (ESC_SEQ | ~('}'))* '\n' ;


//Caracteres que podem começar com letra minuscula ou maiuscula ou até mesmo _
IDENT : [a-zA-Z_][a-zA-Z0-9_]*;

// Fragmento que define um único dígito de 0 a 9.
fragment
DIGITO      : '0'..'9';

NUM_INT     : DIGITO+;
//Seguido de algarismos depois do ponto
NUM_REAL    : DIGITO+ '.' DIGITO+;

//Reconhece qualquer caractere que não foi reconhecido anteriormente, portanto, será tratado como erro
//no programa que utilzará essa gramática
ERRO : . ;
