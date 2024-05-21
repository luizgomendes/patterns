package com.luizgomendes.patterns.structural.composite;

public class FlightTrip implements Trip {
    public final String originCity;
    public final String originAirport;
    public final String destinationCity;
    public final String destinationAirport;
    public final double totalFlightTime;

    public FlightTrip(String originCity, String originAirport, String destinationCity, String destinationAirport, double totalFlightTime) {
        this.originCity = originCity;
        this.originAirport = originAirport;
        this.destinationCity = destinationCity;
        this.destinationAirport = destinationAirport;
        this.totalFlightTime = totalFlightTime;
    }

    @Override
    public String getIntinerary() {
        return "Flight: %1$s (%2$s) -> %3$s (%4$s) = Total Flight: %5$.2f".formatted(originCity, originAirport, destinationCity, destinationAirport, getTotalTravelTime());
    }

    @Override
    public double getTotalTravelTime() {
        return totalFlightTime;
    }
}
