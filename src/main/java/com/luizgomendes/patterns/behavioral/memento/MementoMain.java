package com.luizgomendes.patterns.behavioral.memento;

public class MementoMain {
    public static void main(String[] args) {
        OngoingCalculator ongoingCalculator = new OngoingCalculator();
        ongoingCalculator.add(1);
        ongoingCalculator.multiply(5);
        System.out.println("Calculated value = " + ongoingCalculator.calculate());
        ongoingCalculator.divide(4);
        ongoingCalculator.subtract(3);
        System.out.println("Undo last operations = " + ongoingCalculator.restoreToLastCalculation());
    }
}
