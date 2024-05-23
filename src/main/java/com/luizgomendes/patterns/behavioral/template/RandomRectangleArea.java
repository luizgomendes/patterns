package com.luizgomendes.patterns.behavioral.template;

public class RandomRectangleArea extends RandomShapeArea{
    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double calculateArea() {
        return height*width;
    }
}
