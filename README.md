# Projeto: Scanner - Interpretador Lox em Java

Este projeto é baseado no livro *Crafting Interpreters*, de Robert Nystrom, e implementa a fase de **análise léxica (scanner)** da linguagem Lox, utilizando a linguagem **Java**, conforme a seção 4.7 do capítulo "Scanning".


## Estrutura do Projeto

O código está organizado no seguinte pacote:
src/com/craftinginterpreters/lox/
├── Lox.java # Classe principal que executa o interpretador
├── Scanner.java # Responsável por escanear o código-fonte e gerar tokens
├── Token.java # Representação de um token
└── TokenType.java # Enum com os tipos de tokens reconhecidos
##  Funcionamento

- A classe `Lox` é o ponto de entrada do interpretador.
- Ela pode:
  - Executar um script `.lox` passado como parâmetro.
  - Ou abrir um prompt interativo no terminal.
- O método `run()` usa o `Scanner` para:
  - Identificar lexemas no código-fonte;
  - Criar uma lista de tokens;
  - Imprimir esses tokens no console.

## Funcionalidades Implementadas (até a Seção 4.7)

- Reconhecimento de:
  - Palavras-chave
  - Identificadores
  - Strings e números
  - Símbolos e operadores
- Tratamento de espaços em branco e comentários
- Aplicação do princípio **maximal munch**
- Geração de mensagens de erro com linha e descrição


## Integrantes

- Kaline Maria Carvalho — [@kaline657](https://github.com/kaline657)


##  Referência

> Nystrom, Robert. *Crafting Interpreters*.  
> Capítulo “Scanning”: https://craftinginterpreters.com/scanning.html

