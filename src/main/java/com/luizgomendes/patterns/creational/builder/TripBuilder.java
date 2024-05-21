package com.luizgomendes.patterns.creational.builder;

public class TripBuilder {

    public static TripPackage buildThemeParkPackage(){
        TripPackage tripPackage = new TripPackage();
        tripPackage.addTripItem(new AirplaneTransport());
        tripPackage.addTripItem(new ThemeParkTicket(3, "Premium"));
        tripPackage.addTripItem(new CityTourTicket(4));

        return tripPackage;
    }

    public static TripPackage buildCruisePackage(){
        TripPackage tripPackage = new TripPackage();
        tripPackage.addTripItem(new BoatTransport());
        tripPackage.addTripItem(new CityTourTicket(2));

        return tripPackage;
    }
}
