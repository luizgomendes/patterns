package com.luizgomendes.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class InfoThread {
    List<Subscriber> subscribers = new ArrayList<>();
    List<String> info = new ArrayList<>();

    public void addSubcriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publish(String text) {
        info.add(text);
        for (Subscriber sub: subscribers) {
            sub.update(text);
        }
    }

    public void printAllInfo() {
        System.out.println("Full info thread");
        info.forEach(System.out::println);
    }
}
