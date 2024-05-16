package com.luizgomendes.patterns.creational.factorymethod;

public class AlcoholTaxCalculator extends TaxCalculator {

    @Override
    public double calculateTax(double value) {
        return value*1.6;
    }
}
