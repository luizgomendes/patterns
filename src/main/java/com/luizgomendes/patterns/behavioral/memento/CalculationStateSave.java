package com.luizgomendes.patterns.behavioral.memento;

public class CalculationStateSave {
    private final double result;
    public CalculationStateSave(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }
}
