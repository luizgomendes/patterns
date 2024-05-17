package com.luizgomendes.patterns.structural.bridge;

public abstract class LogWriter {

    public abstract LogOutput getLogOutput(String level);

    public void writeLog(String level, String message) {
        getLogOutput(level).writeOutput(message);
    }

}
