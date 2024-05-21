package com.luizgomendes.patterns.creational.builder;

public abstract class AttractionTicket implements TripItem {

    final int days;

    protected AttractionTicket(int days) {
        this.days = days;
    }

    @Override
    public SeasonPriceModifier getSeasonModifier() {
        return new AllSeasonModifier();
    }
}
