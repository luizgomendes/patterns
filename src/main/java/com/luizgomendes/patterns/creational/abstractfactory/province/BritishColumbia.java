package com.luizgomendes.patterns.creational.abstractfactory.province;

public class BritishColumbia implements Province {


    @Override
    public String getProvinceName() {
        return "British Columbia";
    }

    @Override
    public String getProvinceCode() {
        return "BC";
    }

    @Override
    public double getSalesTax() {
        return 0.065;
    }
}
