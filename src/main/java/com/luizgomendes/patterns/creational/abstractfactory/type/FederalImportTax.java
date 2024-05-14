package com.luizgomendes.patterns.creational.abstractfactory.type;

public class FederalImportTax implements TypeTax {
    @Override
    public String getName() {
        return "Import Tax";
    }

    @Override
    public String getDescription() {
        return "Federal unified import tax";
    }

    @Override
    public double getSalesTax() {
        return 0.3;
    }
}
