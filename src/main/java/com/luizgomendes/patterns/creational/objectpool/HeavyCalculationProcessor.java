package com.luizgomendes.patterns.creational.objectpool;

public class HeavyCalculationProcessor {
    private final Integer id;
    public HeavyCalculationProcessor(Integer id) {
        System.out.println("Initializing Processor no" + id);
        this.id = id;
    }

    public void process() {
        System.out.println("Simulating heavy calculations on processor " + id);
    }

    public int getId() {
        return id;
    }
}
