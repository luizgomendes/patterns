package com.luizgomendes.patterns.creational.builder;

public abstract class Transport implements TripItem {
    @Override
    public SeasonPriceModifier getSeasonModifier() {
        return new HighSeasonalModifier();
    }

}
