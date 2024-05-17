package com.luizgomendes.patterns.creational.singleton;

public class EagerInitSingleton {
    private static final EagerInitSingleton instance = new EagerInitSingleton();
    private EagerInitSingleton() {
        System.out.println("Initializing variable at load time");
    }

    public static EagerInitSingleton getInstance() {
        return instance;
    }
}
