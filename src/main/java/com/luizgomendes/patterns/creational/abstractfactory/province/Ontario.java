package com.luizgomendes.patterns.creational.abstractfactory.province;


public class Ontario implements Province {


    @Override
    public String getProvinceName() {
        return "Ontario";
    }

    @Override
    public String getProvinceCode() {
        return "ON";
    }

    @Override
    public double getSalesTax() {
        return 0.13;
    }
}
