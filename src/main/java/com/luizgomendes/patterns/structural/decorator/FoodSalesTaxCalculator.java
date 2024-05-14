package com.luizgomendes.patterns.structural.decorator;

public class FoodSalesTaxCalculator implements SalesTaxCalculator {
    @Override
    public double calculate(double price) {
        return price;
    }

    @Override
    public String describe() {
        return "No base taxes for food";
    }
}
