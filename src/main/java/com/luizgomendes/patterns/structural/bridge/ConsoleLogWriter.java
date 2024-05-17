package com.luizgomendes.patterns.structural.bridge;

public class ConsoleLogWriter extends LogWriter {
    @Override
    public LogOutput getLogOutput(String level) {
        return new ConsoleLogOutput(level);
    }
}
