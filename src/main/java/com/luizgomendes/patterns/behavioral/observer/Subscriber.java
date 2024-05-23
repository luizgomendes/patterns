package com.luizgomendes.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    private final String name;
    public Subscriber(int num) {
        this.name = "Subscriber " + num;
    }
    private final List<String> notifications = new ArrayList<>();
    public void update(String text) {
        notifications.add(text);
    }

    public void printReceivedInfo() {
        System.out.println(name);
        notifications.forEach(System.out::println);
    }
}
