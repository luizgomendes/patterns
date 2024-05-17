package com.luizgomendes.patterns.structural.bridge;
//Bridge class between Log and output form
public abstract class LogOutput {
    String logLevel;
    public LogOutput(String logLevel) {
        this.logLevel = logLevel;
    }

    public String prepareLog(String message) {
        return logLevel + ":" + message;
    }
    public abstract void writeOutput(String message);
}
