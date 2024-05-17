package com.luizgomendes.patterns.behavioral.command;

public class CommandMain {
    public static void main(String[] args) {
        NumberStringExecutor executor = new NumberStringExecutor();
        NumberString numberString = new NumberString(123.4567);
        System.out.println(executor.executeCommand(new ToCurrencyCommand(numberString)));
        System.out.println(executor.executeCommand(new ToPercentageCommand(numberString)));
        System.out.println(executor.executeCommand(numberString::asIs));
    }
}
