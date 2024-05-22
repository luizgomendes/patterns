package com.luizgomendes.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessGenerator {

    private static final List<Process> generatedProcesses = new ArrayList<>();

    public static Process generateProcess() {
        Process newProcess = new Process(ThreadLocalRandom.current().nextInt(1,11),ThreadLocalRandom.current().nextInt(10,101) );
        generatedProcesses.add(newProcess);
        return newProcess;
    }

    public static int getNumProcesses() {
        return generatedProcesses.size();
    }

}
