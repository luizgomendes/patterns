package com.luizgomendes.patterns.structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        SystemMonitorFacade facade = new SystemMonitorFacade();
        facade.startMonitor();
        facade.printMonitorLog();
    }
}
