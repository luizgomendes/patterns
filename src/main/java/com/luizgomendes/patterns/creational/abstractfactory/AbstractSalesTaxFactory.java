package com.luizgomendes.patterns.creational.abstractfactory;

import com.luizgomendes.patterns.creational.abstractfactory.province.Province;
import com.luizgomendes.patterns.creational.abstractfactory.type.TypeTax;

public abstract class AbstractSalesTaxFactory {
    public abstract TypeTax getTypeTax(String type);
    public abstract Province getProvince(String code);
}
