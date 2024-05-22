package com.luizgomendes.patterns.structural.flyweight;

public class Rectangle implements Shape {
    private final double length, height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length*height;
    }
}
