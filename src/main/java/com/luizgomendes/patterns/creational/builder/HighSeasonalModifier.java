package com.luizgomendes.patterns.creational.builder;

public class HighSeasonalModifier implements SeasonPriceModifier{
    @Override
    public double highSeasonModifier() {
        return 2.5;
    }

    @Override
    public double lowSeasonModifier() {
        return 0.7;
    }
}
