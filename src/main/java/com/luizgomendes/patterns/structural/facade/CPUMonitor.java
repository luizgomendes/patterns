package com.luizgomendes.patterns.structural.facade;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CPUMonitor {

    private int usagePercentage = 0;
    private int maxUsage = 0;
    private final List<Process> processList = new ArrayList<>();

    public void addProcess(Process process) {
        processList.add(process);
        usagePercentage += process.getCpuUsage();
        if(usagePercentage > maxUsage) {
            maxUsage = usagePercentage;
        }
        if(usagePercentage >= 100) {
            removeExcessProcess();
        }
    }

    public void removeExcessProcess() {
        Process maxUsage = processList.stream().max(Comparator.comparingInt(Process::getCpuUsage)).orElse(null);

        processList.remove(maxUsage);
        assert maxUsage != null;
        usagePercentage -= maxUsage.getCpuUsage();

    }

    public int getMaxUsage() {
        return maxUsage;
    }

}
