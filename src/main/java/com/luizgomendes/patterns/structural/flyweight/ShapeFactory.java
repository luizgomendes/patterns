package com.luizgomendes.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape createShape(String shapeName) {
        if (shapeMap.containsKey(shapeName)) {
            return shapeMap.get(shapeName);
        } else {
            Shape newShape = null;
            if (shapeName.equals(Square.class.getName())) {
                newShape = new Square(ThreadLocalRandom.current().nextDouble(0.0, 10.0));
            } else if (shapeName.equals(Rectangle.class.getName())) {
                newShape = new Rectangle(ThreadLocalRandom.current().nextDouble(0.0, 10.0), ThreadLocalRandom.current().nextDouble(0.0, 10.0));
            }
            shapeMap.put(shapeName, newShape);
            return newShape;
        }

    }


}
