package com.luizgomendes.patterns.behavioral.interpreter;

public class InterpreterMain {
    public static void main(String[] args) {
        SearchExpression term1 = new TermExpression("Java");
        SearchExpression term2 = new TermExpression("Kotlin");
        SearchExpression term3 = new TermExpression("Python");

        SearchExpression or = new OrExpression(term1, term2);
        ParenthesisExpression parenthesisExpression = new ParenthesisExpression(or);
        AndExpression andExpression = new AndExpression(parenthesisExpression, term3);

        System.out.println(andExpression.interpret());
    }
}
