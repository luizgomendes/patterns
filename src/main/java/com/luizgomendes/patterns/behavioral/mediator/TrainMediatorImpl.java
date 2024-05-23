package com.luizgomendes.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class TrainMediatorImpl implements TrainMediator {
    private final Map<Integer, Train> laneControl;

    public TrainMediatorImpl() {
        laneControl = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            laneControl.put(i, null);
        }
    }
    @Override
    public boolean requestLane(Train train, int lane) {
        Train currentTrain = laneControl.get(lane);
        System.out.println("Train " + train.getLineName() + " requesting lane " + lane);
        boolean available = (currentTrain==null || train.getLineName().equals(currentTrain.getLineName()));
        if(available) {
            laneControl.put(lane, train);
        }

        return available;
    }

    @Override
    public boolean releaseLane(Train train, int lane) {
        Train currentTrain = laneControl.get(lane);
        if(currentTrain!= null && train.getLineName().equals(currentTrain.getLineName())) {
            System.out.println("Releasing lane " + lane );
            laneControl.put(lane, null);
        }
        System.out.println("Train " + train.getLineName() + " is not on lane " + lane);
        return false;
    }
}
