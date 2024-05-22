package com.luizgomendes.patterns.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPoolMain {
    public static void main(String[] args) {
        List<ProcessingThread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ProcessingThread thread = new ProcessingThread();
            thread.start();
            threads.add(thread);
        }

        for (Thread t: threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
