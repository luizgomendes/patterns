package com.luizgomendes.patterns.creational.protoype;

import java.util.ArrayList;
import java.util.List;

public class Neighbourhood {
    private final Lot standardLot;
    private final List<Lot> actualLots;
    public Neighbourhood(Lot lot) {
        this.standardLot = lot;
        this.actualLots = new ArrayList<>();
    }

    public void create(int numberOfLots) {
        for (int i = 0; i < numberOfLots; i++) {
            Lot newLot = standardLot.cloneLot();
            System.out.println("Created lot number " + (i+1) + " with area of " + newLot.getTotalArea() + "m");
            actualLots.add(newLot);
        }
    }

    public double getNeighbourhoodArea() {
        return actualLots.stream().mapToDouble(Lot::getTotalArea).sum();
    }
}
