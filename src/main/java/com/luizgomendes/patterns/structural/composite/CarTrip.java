package com.luizgomendes.patterns.structural.composite;

public class CarTrip implements Trip {
    private final float distance;
    private final String origin;
    private final String destination;

    public CarTrip(float distance, String origin, String destination) {
        this.distance = distance;
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public String getIntinerary() {
        return "Driving from %1$s to %2$s, total time %3$.2f ".formatted(origin, destination, getTotalTravelTime());
    }

    @Override
    public double getTotalTravelTime() {
        return distance / 60.0;
    }
}
