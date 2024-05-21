package com.luizgomendes.patterns.creational.builder;

public class AllSeasonModifier implements SeasonPriceModifier{
    @Override
    public double highSeasonModifier() {
        return 1.0;
    }

    @Override
    public double lowSeasonModifier() {
        return 1.0;
    }
}
