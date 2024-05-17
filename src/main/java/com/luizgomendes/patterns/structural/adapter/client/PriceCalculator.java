package com.luizgomendes.patterns.structural.adapter.client;

public interface PriceCalculator {

    public void getPriceBreakDown(double value);
    public double calculateFinalPrice(double value);
    public void addTaxToPrice(String taxName, float tax);
}
