package lox;

class Interpreter implements Expr.Visitor<Object> {

    Object interpret(Expr expression) {
        try {
            return evaluate(expression);
        } catch (RuntimeError error) {
            Lox.runtimeError(error);
            return null;
        }
    }

    private Object evaluate(Expr expr) {
        return expr.accept(this);
    }

    @Override
    public Object visitLiteralExpr(Expr.Literal expr) {
        return expr.value;
    }

    @Override
    public Object visitGroupingExpr(Expr.Grouping expr) {
        return evaluate(expr.expression);
    }
