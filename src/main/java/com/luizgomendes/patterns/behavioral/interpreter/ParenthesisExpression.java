package com.luizgomendes.patterns.behavioral.interpreter;

public class ParenthesisExpression implements SearchExpression {
    SearchExpression internalExpression;
    public ParenthesisExpression(SearchExpression internalExpression) {
        this.internalExpression = internalExpression;
    }
    @Override
    public String interpret() {
        return "(" + internalExpression.interpret() + ")";
    }
}
