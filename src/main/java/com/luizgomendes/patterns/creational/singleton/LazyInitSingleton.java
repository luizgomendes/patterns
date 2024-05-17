package com.luizgomendes.patterns.creational.singleton;

public class LazyInitSingleton {
    private static LazyInitSingleton instance;
    private LazyInitSingleton() {
        System.out.println("Initializing at first call");
    }

    public static LazyInitSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitSingleton();
        }

        return instance;
    }
}
