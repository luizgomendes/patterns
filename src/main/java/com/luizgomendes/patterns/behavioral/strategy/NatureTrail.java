package com.luizgomendes.patterns.behavioral.strategy;

public class NatureTrail extends Trail {
    public NatureTrail(long distance) {
        super(distance);
    }

    @Override
    public void describe() {
        System.out.println("Walk through this scenic route, taking around " + calculateTime() + " minutes ");
    }
}
