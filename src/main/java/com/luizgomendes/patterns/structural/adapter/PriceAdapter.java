package com.luizgomendes.patterns.structural.adapter;

import com.luizgomendes.patterns.structural.adapter.client.PriceCalculator;
import com.luizgomendes.patterns.structural.adapter.server.PriceWithTaxes;
import com.luizgomendes.patterns.structural.adapter.server.Tax;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class PriceAdapter extends PriceWithTaxes implements PriceCalculator  {

    public PriceAdapter(double price) {
        super(price, null);
    }
    public PriceAdapter(double price, List<Tax> taxes) {
        super(price, taxes);
    }

    @Override
    public void getPriceBreakDown(double value) {
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("ca").build();

        for (Tax tax: getTaxList()) {
            System.out.println("%s : %.2f%%".formatted(tax.getDescription(), tax.getTaxAmount()));
        }
        System.out.println("Final Amount: " + NumberFormat.getCurrencyInstance(locale).format(calculateFinalPrice(value)));
    }

    @Override
    public double calculateFinalPrice(double value) {
        return getFinalPrice();
    }

    @Override
    public void addTaxToPrice(String taxName, float tax) {
        addTax(new Tax(tax, taxName));
    }
}
