package com.luizgomendes.patterns.creational.abstractfactory.type;

public class AlcoholTax implements TypeTax {
    @Override
    public String getName() {
        return "Alcohol tax";
    }

    @Override
    public String getDescription() {
        return "Tax for alcoholic products";
    }

    @Override
    public double getSalesTax() {
        return 0.4;
    }
}
