package com.luizgomendes.patterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerInitSingleton eagerInitSingleton;
        eagerInitSingleton = EagerInitSingleton.getInstance();

        LazyInitSingleton lazyInitSingleton;
        lazyInitSingleton = LazyInitSingleton.getInstance();
    }
}
