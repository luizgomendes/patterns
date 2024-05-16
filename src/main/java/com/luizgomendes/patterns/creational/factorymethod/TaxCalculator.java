package com.luizgomendes.patterns.creational.factorymethod;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class TaxCalculator {


    public abstract double calculateTax(double value);

    public String showCalculatedValue(double price) {
        return showCalculatedValue(price,"EN", "CA" );
    }

    public String showCalculatedValue(double price, String language, String region) {
        Locale locale = new Locale.Builder().setLanguage(language).setRegion(region).build();
        return NumberFormat.getCurrencyInstance(locale).format(calculateTax(price));
    }
}
