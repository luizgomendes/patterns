package com.luizgomendes.patterns.behavioral.mediator;

public interface Train {
    String getLineName();
    void requestLane(int lane);
    void releaseLane(int lane);

}
