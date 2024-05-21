package com.luizgomendes.patterns.creational.builder;

public class BoatTransport extends Transport{
    @Override
    public String getDescription() {
        return "Trip by boat";
    }

    @Override
    public Double getPrice() {
        return 500.00;
    }
}
