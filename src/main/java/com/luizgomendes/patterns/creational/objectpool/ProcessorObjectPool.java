package com.luizgomendes.patterns.creational.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ProcessorObjectPool {

    private final ConcurrentLinkedQueue<HeavyCalculationProcessor> pool;
    private static ProcessorObjectPool instance;
    private ProcessorObjectPool (int numInstances) {
        pool = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < numInstances; i++) {
             pool.offer(new HeavyCalculationProcessor(i));
        }
    }

    public static ProcessorObjectPool getInstance() {
        if(instance == null) {
            instance = new ProcessorObjectPool(10);
        }
        return instance;
    }

    public HeavyCalculationProcessor getProcessor() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " waiting for processor");
        HeavyCalculationProcessor processor;
        synchronized (pool) {
            while (pool.isEmpty()) {
                pool.wait();
            }
            processor = pool.poll();
            System.out.println(Thread.currentThread().getName() + " got " + processor.getId());
        }
        return processor;
    }

    public void releaseProcessor(HeavyCalculationProcessor processor) {
        System.out.println(Thread.currentThread().getName() + " returning processor " + processor.getId());
        synchronized (pool) {
            pool.offer(processor);
            pool.notifyAll();
        }
    }

}
