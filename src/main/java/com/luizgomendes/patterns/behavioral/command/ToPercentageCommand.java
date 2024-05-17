package com.luizgomendes.patterns.behavioral.command;

public class ToPercentageCommand implements NumberStringCommand {

    private final NumberString numberString;
    public ToPercentageCommand(NumberString numberString) {
        this.numberString = numberString;
    }

    @Override
    public String execute() {
        return numberString.parseToPercentage();
    }
}
