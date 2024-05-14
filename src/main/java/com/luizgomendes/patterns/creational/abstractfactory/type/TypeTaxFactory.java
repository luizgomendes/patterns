package com.luizgomendes.patterns.creational.abstractfactory.type;

import com.luizgomendes.patterns.creational.abstractfactory.AbstractSalesTaxFactory;
import com.luizgomendes.patterns.creational.abstractfactory.province.Province;

public class TypeTaxFactory extends AbstractSalesTaxFactory {

    @Override
    public TypeTax getTypeTax(String type) {
        if("import".equalsIgnoreCase(type)) {
            return new FederalImportTax();
        } else if("alcohol".equalsIgnoreCase(type)) {
            return new AlcoholTax();
        }

        return null;
    }

    @Override
    public Province getProvince(String code) {
        return null;
    }
}
