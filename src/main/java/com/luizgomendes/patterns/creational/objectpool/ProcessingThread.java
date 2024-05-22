package com.luizgomendes.patterns.creational.objectpool;

public class ProcessingThread extends Thread {

    @Override
    public void run() {
        try {
            HeavyCalculationProcessor processor = ProcessorObjectPool.getInstance().getProcessor();
            processor.process();
            Thread.sleep(10000);
            ProcessorObjectPool.getInstance().releaseProcessor(processor);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
