package com.luizgomendes.patterns.behavioral.state;

public class HexaDoublePrinter implements DoublePrinter{
    @Override
    public void printDouble(double num) {
        System.out.println(Double.toHexString(num));
    }
}
