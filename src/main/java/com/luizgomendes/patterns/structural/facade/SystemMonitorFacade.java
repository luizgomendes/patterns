package com.luizgomendes.patterns.structural.facade;

public class SystemMonitorFacade {
    private final CPUMonitor cpuMonitor;
    private final MemoryUsage memoryUsage;

    public SystemMonitorFacade() {
        cpuMonitor = new CPUMonitor();
        memoryUsage = new MemoryUsage(4000);
    }

    public void startMonitor() {
        boolean processAccepted = true;
        while(processAccepted) {
            Process process = ProcessGenerator.generateProcess();
            processAccepted = memoryUsage.addProcess(process);
            cpuMonitor.addProcess(process);
        }
    }

    public void printMonitorLog() {
        System.out.println("Processes: " + ProcessGenerator.getNumProcesses());
        System.out.println("Max CPU Usage: " + cpuMonitor.getMaxUsage());
    }
}
