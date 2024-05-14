package com.luizgomendes.patterns.creational.abstractfactory;

import com.luizgomendes.patterns.creational.abstractfactory.province.ProvinceFactory;
import com.luizgomendes.patterns.creational.abstractfactory.type.TypeTaxFactory;

public class SalesTaxFactoryCreator {

    public static AbstractSalesTaxFactory getFactory(String type) {
        if("province".equalsIgnoreCase(type)) {
            return new ProvinceFactory();
        } else if("type".equalsIgnoreCase(type)) {
            return new TypeTaxFactory();
        }

        return null;
    }
}
