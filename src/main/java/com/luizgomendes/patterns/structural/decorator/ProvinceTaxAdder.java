package com.luizgomendes.patterns.structural.decorator;

public class ProvinceTaxAdder extends SalesTaxCalculatorDecorator{
    public ProvinceTaxAdder(SalesTaxCalculator salesTaxCalculator) {
        super(salesTaxCalculator);
    }

    @Override
    public double calculate(double price) {
        return super.calculate(price)*1.13;
    }

    @Override
    public String describe() {
        return super.describe() + " plus 13% Provincial tax";

    }
}
