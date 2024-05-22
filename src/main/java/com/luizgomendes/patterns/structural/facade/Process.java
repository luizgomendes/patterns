package com.luizgomendes.patterns.structural.facade;

public class Process {
    private final int cpuUsage;
    private final int memoryUsage;

    public Process(int cpuUsage, int memoryUsage) {
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
    }

    public int getCpuUsage() {
        return cpuUsage;
    }

    public int getMemoryUsage() {
        return memoryUsage;
    }
}
