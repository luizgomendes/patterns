package com.luizgomendes.patterns.behavioral.strategy;

public class BikeMoveStrategy implements MoveStrategy{


    @Override
    public long getTotalTime(long distance) {
        return distance/20;
    }
}
