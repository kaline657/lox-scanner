package lox;

interface Expr {
    <R> R accept(Visitor<R> visitor);

    interface Visitor<R> {
        R visitLiteralExpr(Literal expr);
        R visitGroupingExpr(Grouping expr);
        R visitUnaryExpr(Unary expr);
        R visitBinaryExpr(Binary expr);
    }

    class Literal implements Expr {
        final Object value;
        public Literal(Object value) { this.value = value; }
        public <R> R accept(Visitor<R> visitor) { return visitor.visitLiteralExpr(this); }
    }

    class Grouping implements Expr {
        final Expr expression;
        public Grouping(Expr expression) { this.expression = expression; }
        public <R> R accept(Visitor<R> visitor) { return visitor.visitGroupingExpr(this); }
    }

    class Unary implements Expr {
        final Token operator;
        final Expr right;
        public Unary(Token operator, Expr right) {
            this.operator = operator;
            this.right = right;
        }
        public <R> R accept(Visitor<R> visitor) { return visitor.visitUnaryExpr(this); }
    }

    class Binary implements Expr {
        final Expr left;
        final Token operator;
        final Expr right;
        public Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }
        public <R> R accept(Visitor<R> visitor) { return visitor.visitBinaryExpr(this); }
    }
}
