package com.luizgomendes.patterns.structural.adapter;

import com.luizgomendes.patterns.structural.adapter.client.PriceCalculator;

public class TaxCalculatorMain {
    public static void main(String[] args) {
        PriceCalculator clientPriceCalculator = new PriceAdapter(100.0, null);
        clientPriceCalculator.addTaxToPrice("Import", 0.2F);
        clientPriceCalculator.addTaxToPrice("Manufactured Goods", 0.13F);
        clientPriceCalculator.getPriceBreakDown(100.0);
    }
}
