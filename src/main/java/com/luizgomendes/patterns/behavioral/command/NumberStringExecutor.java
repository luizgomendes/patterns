package com.luizgomendes.patterns.behavioral.command;


public class NumberStringExecutor {

    public String executeCommand(NumberStringCommand command) {
        return command.execute();
    }
}
