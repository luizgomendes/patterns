package com.luizgomendes.patterns.structural.bridge;

public class FileLogWriter extends LogWriter {
    @Override
    public LogOutput getLogOutput(String level) {
        return new FileLogOutput(level);
    }
}
