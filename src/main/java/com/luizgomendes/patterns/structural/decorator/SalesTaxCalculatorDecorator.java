package com.luizgomendes.patterns.structural.decorator;

public abstract class SalesTaxCalculatorDecorator implements SalesTaxCalculator {

    private final SalesTaxCalculator salesTaxCalculator;
    public SalesTaxCalculatorDecorator(SalesTaxCalculator salesTaxCalculator) {
        this.salesTaxCalculator = salesTaxCalculator;
    }

    public double calculate(double price) {
        return salesTaxCalculator.calculate(price);
    }

    public String describe() {
        return salesTaxCalculator.describe();
    }
}
