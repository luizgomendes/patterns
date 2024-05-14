package com.luizgomendes.patterns.structural.decorator;

public class ImportTaxAdder extends SalesTaxCalculatorDecorator{
    public ImportTaxAdder(SalesTaxCalculator salesTaxCalculator) {
        super(salesTaxCalculator);
    }

    @Override
    public double calculate(double price) {
        return super.calculate(price)*1.20;
    }

    @Override
    public String describe() {
        return super.describe() + " plus 20% import tax";

    }
}
