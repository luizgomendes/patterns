package com.luizgomendes.patterns.behavioral.strategy;

public abstract class Trail {
    MoveStrategy moveStrategy;
    final long distance;

    public Trail(long distance) {
        this.distance = distance;
        this.moveStrategy = new WalkingMoveStrategy();
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public long calculateTime() {
        return moveStrategy.getTotalTime(distance);
    }

    public abstract void describe();
}
