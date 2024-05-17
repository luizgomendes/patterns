package com.luizgomendes.patterns.structural.bridge;

public class BridgeLogMain {
    public static void main(String[] args) {
        LogWriter logWriter = new ConsoleLogWriter();
        logWriter.writeLog("DEBUG", "This debug should go to the console");
        logWriter = new FileLogWriter();
        logWriter.writeLog("INFO", "This info goes to file");
    }
}
