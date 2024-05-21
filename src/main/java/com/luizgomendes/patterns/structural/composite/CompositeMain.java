package com.luizgomendes.patterns.structural.composite;

public class CompositeMain {
    public static void main(String[] args) {
        PackageTrip packageTrip = new PackageTrip();
        packageTrip.addTrip(new FlightTrip("Toronto", "YYZ", "Los Angeles","LAX", 6.0));
        packageTrip.addTrip(new CarTrip(200,"Los Angeles", "San Diego"));
        System.out.println(packageTrip.getIntinerary());
   }
}

