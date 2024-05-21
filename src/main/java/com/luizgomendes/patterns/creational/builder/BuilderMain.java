package com.luizgomendes.patterns.creational.builder;


public class BuilderMain {

    public static void main(String[] args) {
        TripBuilder.buildThemeParkPackage().showItems();
        TripBuilder.buildCruisePackage().showItems();
    }
}
