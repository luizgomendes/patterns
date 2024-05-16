package com.luizgomendes.patterns.creational.factorymethod;

public class ImportTaxCalculator extends TaxCalculator {


    @Override
    public double calculateTax(double value) {
        if(value <=50) {
            return value * 1.2;
        }
        return value * 1.4;
    }
}
