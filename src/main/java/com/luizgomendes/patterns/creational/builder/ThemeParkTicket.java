package com.luizgomendes.patterns.creational.builder;

public class ThemeParkTicket extends AttractionTicket{
  private final String type;

    public ThemeParkTicket(int days, String type) {
        super(days);
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "%1$d day(s) %2$s ticket".formatted(days, type);
    }

    @Override
    public Double getPrice() {
        return days*89.99;
    }
}
