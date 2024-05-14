package com.luizgomendes.patterns.structural.decorator;

public interface SalesTaxCalculator {

    double calculate(double price);
    String describe();
}
