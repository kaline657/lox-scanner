package lox;

public enum TokenType {
    // Operadores
    PLUS, MINUS, STAR, SLASH,
    GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,
    EQUAL_EQUAL, BANG_EQUAL, BANG,

    // Literais
    IDENTIFIER, STRING, NUMBER,

    // Agrupamentos
    LEFT_PAREN, RIGHT_PAREN,

    EOF
}
