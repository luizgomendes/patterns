package com.luizgomendes.patterns.behavioral.state;

public class SimpleDoublePrinter implements DoublePrinter{
    @Override
    public void printDouble(double num) {
        System.out.println(num);
    }
}
