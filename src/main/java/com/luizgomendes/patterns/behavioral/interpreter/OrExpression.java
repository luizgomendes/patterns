package com.luizgomendes.patterns.behavioral.interpreter;

public class OrExpression implements SearchExpression {
    private final SearchExpression leftExpression;
    private final SearchExpression rightExpression;

    public OrExpression(SearchExpression leftExpression, SearchExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public String interpret() {
        return leftExpression.interpret() + " OR " + rightExpression.interpret();
    }
}
