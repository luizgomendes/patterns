package com.luizgomendes.patterns.behavioral.template;

import java.util.concurrent.ThreadLocalRandom;

public class RandomSquareArea extends RandomShapeArea{

    @Override
    public void initWithRandom() {
        height = ThreadLocalRandom.current().nextDouble(10.0);
        System.out.println("Sides = " + height);
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double calculateArea() {
        return height * height;
    }
}
