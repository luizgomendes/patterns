package com.luizgomendes.patterns.creational.factorymethod;

public class TaxCalculatorFactory {

    public static TaxCalculator getTaxCalulator(String name) {
        return switch (name.toLowerCase()) {
            case "import" -> new ImportTaxCalculator();
            case "food" -> new FoodTaxCalculator();
            case "alcohol" -> new AlcoholTaxCalculator();
            default -> {
                System.out.println("No tax found");
                yield null;
            }
        };
    }
}
