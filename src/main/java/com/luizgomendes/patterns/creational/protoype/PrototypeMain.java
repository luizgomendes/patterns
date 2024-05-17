package com.luizgomendes.patterns.creational.protoype;

public class PrototypeMain {
    public static void main(String[] args) {
        Lot standardSquareLot = new SquareLot(10,10);
        Neighbourhood neighbourhood = new Neighbourhood(standardSquareLot);
        neighbourhood.create(10);
        System.out.println("Total area of neighbourhood is " + neighbourhood.getNeighbourhoodArea());
    }
}
