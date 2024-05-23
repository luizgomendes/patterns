package com.luizgomendes.patterns.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {
        RandomShapeArea squareArea = new RandomSquareArea();
        squareArea.printShapeInfo();

        RandomShapeArea rectangleArea = new RandomRectangleArea();
        rectangleArea.printShapeInfo();

        RandomShapeArea triangleArea = new RandomTriangleArea();
        triangleArea.printShapeInfo();
    }
}
