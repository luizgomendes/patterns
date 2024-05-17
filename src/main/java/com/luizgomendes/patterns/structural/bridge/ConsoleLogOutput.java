package com.luizgomendes.patterns.structural.bridge;

public class ConsoleLogOutput extends LogOutput{
    public ConsoleLogOutput(String logLevel) {
        super(logLevel);
    }

    @Override
    public void writeOutput(String message) {
        System.out.println("Writing to console");
        System.out.println(prepareLog(message));
    }
}
