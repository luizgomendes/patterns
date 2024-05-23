package com.luizgomendes.patterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        InfoThread infoThread = new InfoThread();
        Subscriber sub1 = new Subscriber(1);
        Subscriber sub2 = new Subscriber(2);

        infoThread.addSubcriber(sub1);
        infoThread.addSubcriber(sub2);

        infoThread.publish("Both will get this");
        infoThread.publish("Both will get this too");

        infoThread.removeSubscriber(sub1);
        infoThread.publish("Only 2 gets this");

        infoThread.printAllInfo();
        sub1.printReceivedInfo();
        sub2.printReceivedInfo();
    }
}
