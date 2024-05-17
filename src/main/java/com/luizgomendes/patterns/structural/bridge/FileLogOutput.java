package com.luizgomendes.patterns.structural.bridge;

public class FileLogOutput extends LogOutput{
    public FileLogOutput(String logLevel) {
        super(logLevel);
    }

    @Override
    public void writeOutput(String message) {
        System.out.println("Writing to a file");
        System.out.println(prepareLog(message));
    }
}
