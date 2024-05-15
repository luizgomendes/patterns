package com.luizgomendes.patterns.behavioral.strategy;

public class TrailStrategyMain {
    public static void main(String[] args) {
        Trail trail = new UrbanTrail(1000, "Paris");
        trail.describe();
        trail.setMoveStrategy(new BikeMoveStrategy());
        trail.describe();

        trail = new NatureTrail(2000);
        trail.describe();
        trail.setMoveStrategy(new BikeMoveStrategy());
        trail.describe();

    }
}
