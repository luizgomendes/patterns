package com.luizgomendes.patterns.creational.builder;

public interface TripItem {
    String getDescription();
    SeasonPriceModifier getSeasonModifier();
    Double getPrice();
}
