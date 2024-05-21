package com.luizgomendes.patterns.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        System.out.println("Regular food");
        SalesTaxCalculator regularFood = new FoodSalesTaxCalculator();
        System.out.println("Price  = " + regularFood.calculate(10));
        System.out.println(regularFood.describe());

        SalesTaxCalculator importedFood = new ImportTaxAdder(new FoodSalesTaxCalculator());
        System.out.println("Price = " + importedFood.calculate(10));
        System.out.println(importedFood.describe());
    }
}
