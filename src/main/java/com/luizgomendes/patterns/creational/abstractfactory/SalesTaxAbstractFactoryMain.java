package com.luizgomendes.patterns.creational.abstractfactory;

import com.luizgomendes.patterns.creational.abstractfactory.province.Province;
import com.luizgomendes.patterns.creational.abstractfactory.type.TypeTax;

public class SalesTaxAbstractFactoryMain {

    public static void main(String[] args) {

        AbstractSalesTaxFactory provinceFactory = SalesTaxFactoryCreator.getFactory("province");
        assert provinceFactory != null;
        Province on = provinceFactory.getProvince("ON");
        System.out.println(on.getProvinceName());

        AbstractSalesTaxFactory typeFactory = SalesTaxFactoryCreator.getFactory("type");
        assert typeFactory != null;
        TypeTax tax = typeFactory.getTypeTax("import");
        System.out.println(tax.getDescription());

    }
}
