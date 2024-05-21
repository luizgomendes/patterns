package com.luizgomendes.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class PackageTrip implements Trip {

    List<Trip> tripList;

    public PackageTrip() {
        this.tripList = new ArrayList<>();
    }

    public void addTrip(Trip trip) {
        tripList.add(trip);
    }
    @Override
    public String getIntinerary() {
        return String.join("\n",tripList.stream().map(Trip::getIntinerary).toList())
                + "\nTotal time = %.2f hrs".formatted(getTotalTravelTime());
    }

    @Override
    public double getTotalTravelTime() {
        return tripList.stream().mapToDouble(Trip::getTotalTravelTime).sum();
    }
}
