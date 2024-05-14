package com.luizgomendes.patterns.structural.decorator;

public class RegularTaxCalculator implements SalesTaxCalculator {
    @Override
    public double calculate(double price) {
        return price*1.05;
    }

    @Override
    public String describe() {
        return "Base tax of 5%";
    }
}
