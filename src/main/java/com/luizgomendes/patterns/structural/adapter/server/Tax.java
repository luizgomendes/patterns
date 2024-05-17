package com.luizgomendes.patterns.structural.adapter.server;

public class Tax {

    private final float taxAmount;
    private final String description;

    public Tax(float taxAmount, String description) {
        this.taxAmount = taxAmount;
        this.description = description;
    }

    public float getTaxAmount() {
        return taxAmount;
    }

    public String getDescription() {
        return description;
    }
}
