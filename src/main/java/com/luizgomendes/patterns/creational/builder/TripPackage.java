package com.luizgomendes.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;


public class TripPackage {
    private final List<TripItem> tripItems = new ArrayList<>();

    public void addTripItem(TripItem item) {
        tripItems.add(item);
    }

    public double getHighSeasonPrice() {
        return tripItems.stream().mapToDouble(item->item.getPrice()*item.getSeasonModifier().highSeasonModifier()).sum();
    }

    public double getLowSeasonPrice() {
        return tripItems.stream().mapToDouble(item->item.getPrice()*item.getSeasonModifier().lowSeasonModifier()).sum();
    }

    public void showItems() {
        tripItems.forEach(it-> {
            System.out.printf("%1$s = From %2$.2f$  to %3$.2f$ %n", it.getDescription(), it.getPrice()*it.getSeasonModifier().lowSeasonModifier(), it.getPrice()*it.getSeasonModifier().highSeasonModifier());
        });


    }

}
