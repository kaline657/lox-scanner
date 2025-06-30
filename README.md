# Projeto: Avaliação de Expressões - Interpretador Lox em Java

Este projeto é baseado no livro *Crafting Interpreters*, de Robert Nystrom, e avança na implementação do interpretador da linguagem Lox em Java, agora incluindo a avaliação de expressões (literais, agrupamentos, operações unárias e binárias), conforme o capítulo "Evaluating Expressions".

## Estrutura do Projeto

Pacote: `src/com/craftinginterpreters/lox/`

- `Lox.java`: Classe principal do interpretador
- `Scanner.java`: Análise léxica e geração de tokens
- `Parser.java`: Análise sintática e construção da AST
- `Expr.java`: Definição das classes de expressão
- `Visitor.java`: Interface para o padrão Visitor
- `Interpreter.java`: Avaliação das expressões
- `Token.java`: Representação de um token
- `TokenType.java`: Enum com tipos de tokens

## Funcionamento

A classe `Lox` executa o interpretador, que:

- Lê e escaneia o código-fonte
- Constrói a AST via `Parser`
- Avalia a AST com `Interpreter`
- Exibe o resultado das expressões no console

## Funcionalidades Implementadas

- Análise léxica completa (scanner)
- Parser de expressões com precedência
- Avaliação de:
  - Literais
  - Agrupamentos
  - Operações unárias
  - Operações binárias (com precedência correta)

## Integrantes

Kaline Maria Carvalho — @kaline657

## Referências

Nystrom, Robert. *Crafting Interpreters*.

Capítulo “Evaluating Expressions”: https://craftinginterpreters.com/evaluating-expressions.html
