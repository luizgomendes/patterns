package com.luizgomendes.patterns.behavioral.command;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberString {
    private final double number;
    public NumberString(double number) {
        this.number = number;
    }

    public String asIs(){
        return Double.toString(number);
    }

    public String parseToPercentage(){
       return String.format("%.2f", number) + "%";
    }

    public String parseToCurrency() {
        Locale locale = new Locale.Builder().setRegion("CA").setLanguage("EN").build();
        return NumberFormat.getCurrencyInstance(locale).format(number);
    }
}
