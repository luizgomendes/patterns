package com.luizgomendes.patterns.creational.protoype;

public class SquareLot implements Lot {

    private final double length;
    private final double width;

    public SquareLot(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getTotalArea() {
        return length*width;
    }

    @Override
    public Lot cloneLot() {
        return new SquareLot(length,width);
    }
}
