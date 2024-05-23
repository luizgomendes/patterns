package com.luizgomendes.patterns.behavioral.state;

public class DoublePrinterController {

    public enum PrintType {
        INTEGER,
        HEXA,
        SIMPLE
    }
    DoublePrinter doublePrinter = new SimpleDoublePrinter();

    public void changePrintType(PrintType type) {
        switch (type) {
            case HEXA -> doublePrinter = new HexaDoublePrinter();
            case INTEGER -> doublePrinter = new IntegerDoublePrinter();
            case SIMPLE -> doublePrinter = new SimpleDoublePrinter();
        }
    }

    public void printDouble(double num) {
        doublePrinter.printDouble(num);
    }

}
