package com.luizgomendes.patterns.behavioral.strategy;

public class WalkingMoveStrategy implements MoveStrategy{
    @Override
    public long getTotalTime(long distance) {
        return distance/10;
    }
}
