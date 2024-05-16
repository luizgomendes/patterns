package com.luizgomendes.patterns.creational.factorymethod;

public class FoodTaxCalculator extends TaxCalculator {
    @Override
    public double calculateTax(double value) {
        return value;
    }
}
