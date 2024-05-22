package com.luizgomendes.patterns.structural.flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        Shape square1 = ShapeFactory.createShape(Square.class.getName());
        System.out.println("Square 1 area = " + square1.getArea());
        Shape rectangle1 = ShapeFactory.createShape(Rectangle.class.getName());
        System.out.println("Rectangle 1 area = " + rectangle1.getArea());
        Shape square2 = ShapeFactory.createShape(Square.class.getName());
        System.out.println("Square 2 area = " + square2.getArea());
        Shape rectangle2 = ShapeFactory.createShape(Rectangle.class.getName());
        System.out.println("Rectangle 2 area = " + rectangle2.getArea());
    }
}
