package com.luizgomendes.patterns.behavioral.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        TrainMediator mediator = new TrainMediatorImpl();
        Train train1 = new TrainImpl("L1", mediator);
        Train train2 = new TrainImpl("L2", mediator);
        train1.requestLane(1);
        train1.requestLane(1);
        train2.requestLane(1);
        train2.releaseLane(1);
        train1.releaseLane(1);
        train2.requestLane(1);

    }
}
