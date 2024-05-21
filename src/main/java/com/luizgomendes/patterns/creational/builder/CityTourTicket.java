package com.luizgomendes.patterns.creational.builder;

public class CityTourTicket extends AttractionTicket{
    protected CityTourTicket(int days) {
        super(days);
    }

    @Override
    public String getDescription() {
        return days + " day(s) tour for city attractions";
    }

    @Override
    public Double getPrice() {
        return days<2?29.99:39.99;
    }
}
