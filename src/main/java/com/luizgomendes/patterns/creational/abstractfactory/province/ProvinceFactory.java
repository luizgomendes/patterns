package com.luizgomendes.patterns.creational.abstractfactory.province;

import com.luizgomendes.patterns.creational.abstractfactory.AbstractSalesTaxFactory;
import com.luizgomendes.patterns.creational.abstractfactory.type.TypeTax;

public class ProvinceFactory extends AbstractSalesTaxFactory {
    @Override
    public TypeTax getTypeTax(String type) {
        return null;
    }

    @Override
    public Province getProvince(String code) {
        if(code.equals("ON")) {
            return new Ontario();
        } else if (code.equals("BC")) {
            return new BritishColumbia();
        }
        return null;
    }
}
