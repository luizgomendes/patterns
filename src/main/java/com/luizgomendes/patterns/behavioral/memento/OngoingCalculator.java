package com.luizgomendes.patterns.behavioral.memento;

public class OngoingCalculator {
    private final Calculation calculation = new Calculation();
    private CalculationStateSave calculationStateSave = null;

    public void add(double number) {
        calculation.add(number);
    }

    public void subtract(double number) {
        calculation.subtract(number);
    }

    public void multiply(double number) {
       calculation.multiply(number);
    }

    public void divide(double number) {
        calculation.divide(number);
    }

    public double calculate() {
        calculationStateSave = calculation.calculateAndSave();
        return calculationStateSave.getResult();
    }

    public double restoreToLastCalculation() {
        calculation.restoreToLastCalculate(calculationStateSave);
        return calculationStateSave.getResult();
    }
}
