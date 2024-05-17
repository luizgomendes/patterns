package com.luizgomendes.patterns.structural.adapter.client;

public interface PriceCalculator {

    void getPriceBreakDown(double value);
    double calculateFinalPrice(double value);
    void addTaxToPrice(String taxName, float tax);
}
