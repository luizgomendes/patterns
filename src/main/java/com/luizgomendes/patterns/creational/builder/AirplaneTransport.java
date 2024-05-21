package com.luizgomendes.patterns.creational.builder;

public class AirplaneTransport extends Transport{
    @Override
    public String getDescription() {
        return "Trip by Airplane";
    }

    @Override
    public Double getPrice() {
        return 1000.00;
    }
}
