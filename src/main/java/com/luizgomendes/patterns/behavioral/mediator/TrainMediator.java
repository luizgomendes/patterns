package com.luizgomendes.patterns.behavioral.mediator;

public interface TrainMediator {
    boolean requestLane(Train train, int lane);
    boolean releaseLane(Train train, int lane);
}
