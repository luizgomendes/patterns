package com.luizgomendes.patterns.behavioral.interpreter;

public class TermExpression implements SearchExpression{
    private final String term;

    public TermExpression(String term) {
        this.term = term;
    }
    @Override
    public String interpret() {
        return term;
    }
}
