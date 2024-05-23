package com.luizgomendes.patterns.behavioral.template;

import java.util.concurrent.ThreadLocalRandom;

public abstract class RandomShapeArea {

    double height;
    double width;

    public abstract String getShapeName();
    public void initWithRandom() {
        height = ThreadLocalRandom.current().nextDouble(10.0);
        width = ThreadLocalRandom.current().nextDouble(10.0);
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }

    public abstract double calculateArea();

    public void printShapeInfo() {
        System.out.println(getShapeName());
        initWithRandom();
        System.out.println("Total area = " + calculateArea());
    }
}
