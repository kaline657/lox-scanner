package lox;

public class Lox {
    public static void main(String[] args) {
        Expr expression = new Expr.Binary(
            new Expr.Literal(1.0),
            new Token(TokenType.PLUS, "+"),
            new Expr.Literal(2.0)
        );

        Interpreter interpreter = new Interpreter();
        interpreter.interpret(expression);
    }

    static void runtimeError(RuntimeError error) {
        System.err.println(error.getMessage());
    }
}
