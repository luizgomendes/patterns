package com.luizgomendes.patterns.behavioral.interpreter;

public class AndExpression implements SearchExpression {
    private final SearchExpression leftExpression;
    private final SearchExpression rightExpression;

    public AndExpression(SearchExpression leftExpression, SearchExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public String interpret() {
        return leftExpression.interpret() + " AND " + rightExpression.interpret();
    }
}