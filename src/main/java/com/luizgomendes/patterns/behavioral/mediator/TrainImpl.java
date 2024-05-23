package com.luizgomendes.patterns.behavioral.mediator;

public class TrainImpl implements Train{
    private final String lineName;
    private final TrainMediator mediator;
    public TrainImpl(String lineName, TrainMediator mediator) {
        this.lineName = lineName;
        this.mediator = mediator;
    }
    @Override
    public String getLineName() {
        return lineName;
    }

    @Override
    public void requestLane(int lane) {
        boolean available = mediator.requestLane(this, lane);
        System.out.println(available?lineName + " is on lane " + lane:lineName + " is on not on lane " + lane);
    }

    @Override
    public void releaseLane(int lane) {
        boolean released = mediator.releaseLane(this, lane);
        System.out.println(released?lineName + " released lane " + lane:lineName + " did not release lane " + lane);
    }
}
