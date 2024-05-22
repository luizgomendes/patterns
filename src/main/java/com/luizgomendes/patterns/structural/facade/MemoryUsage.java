package com.luizgomendes.patterns.structural.facade;

public class MemoryUsage {
    private final int maxMemory;
    private int currentMemory = 0;

    public MemoryUsage(int maxMemory) {
        this.maxMemory = maxMemory;
    }

    public boolean addProcess(Process process) {
        if(currentMemory + process.getMemoryUsage() > maxMemory) {
            return false;
        }
        currentMemory += process.getMemoryUsage();
        return true;
    }

}
