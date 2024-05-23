package com.luizgomendes.patterns.behavioral.state;

public class IntegerDoublePrinter implements DoublePrinter{
    @Override
    public void printDouble(double num) {
        System.out.println(Math.round(num));
    }
}
