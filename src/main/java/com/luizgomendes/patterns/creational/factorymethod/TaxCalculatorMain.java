package com.luizgomendes.patterns.creational.factorymethod;

public class TaxCalculatorMain {
    public static void main(String[] args) {
        double value = 10;
        TaxCalculator taxCalculator = TaxCalculatorFactory.getTaxCalulator("import");
        System.out.println(taxCalculator.showCalculatedValue(value));
        taxCalculator = TaxCalculatorFactory.getTaxCalulator("alcohol");
        System.out.println(taxCalculator.showCalculatedValue(value));
        taxCalculator = TaxCalculatorFactory.getTaxCalulator("food");
        System.out.println(taxCalculator.showCalculatedValue(value));
    }
}
