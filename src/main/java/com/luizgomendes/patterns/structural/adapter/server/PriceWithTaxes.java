package com.luizgomendes.patterns.structural.adapter.server;

import java.util.ArrayList;
import java.util.List;

public class PriceWithTaxes {

    private final double price;
    private final List<Tax> taxList;
    private double finalPrice;

    public PriceWithTaxes(double price, List<Tax> taxes) {
        this.price = price;
        this.taxList = taxes!=null?taxes:new ArrayList<>();
        this.finalPrice = calculate();
    }

    public void addTax(Tax tax) {
        taxList.add(tax);
        this.finalPrice = calculate();
    }

    private double calculate(){
        double taxMultiplier = 1.0;
        for(Tax tax: taxList) {
            taxMultiplier+=tax.getTaxAmount();
        }

        return price * taxMultiplier;
    }

    public double getPrice() {
        return price;
    }

    public List<Tax> getTaxList() {
        return taxList;
    }

    public double getFinalPrice() {
        return finalPrice;
    }
}
