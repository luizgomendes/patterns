package com.luizgomendes.patterns.behavioral.template;

public class RandomTriangleArea extends RandomShapeArea{
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double calculateArea() {
        return (height*width)/2;
    }
}
