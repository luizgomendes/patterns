package com.luizgomendes.patterns.behavioral.memento;

public class Calculation {
    private double currentResult = 0.0;
    public void add(double number) {
        currentResult += number;
        printCurrentResult();
    }

    public void subtract(double number) {
        currentResult -= number;
        printCurrentResult();
    }

    public void multiply(double number) {
        currentResult *= number;
        printCurrentResult();
    }

    public void divide(double number) {
        currentResult /= number;
        printCurrentResult();
    }

    private void printCurrentResult() {
        System.out.println("Current result = " + currentResult);
    }

    public CalculationStateSave calculateAndSave() {
        return new CalculationStateSave(currentResult);
    }

    public void restoreToLastCalculate(CalculationStateSave calculationStateSave) {
        this.currentResult = calculationStateSave.getResult();
    }

}
