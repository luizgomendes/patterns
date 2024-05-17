package com.luizgomendes.patterns.behavioral.command;

public class ToCurrencyCommand implements NumberStringCommand {
    private final NumberString numberString;
    public ToCurrencyCommand(NumberString numberString) {
        this.numberString = numberString;
    }

    @Override
    public String execute() {
        return numberString.parseToCurrency();
    }
}
