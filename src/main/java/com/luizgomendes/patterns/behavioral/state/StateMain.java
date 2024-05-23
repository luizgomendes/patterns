package com.luizgomendes.patterns.behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        DoublePrinterController controller = new DoublePrinterController();
        double num = 155.77;
        controller.printDouble(num);
        controller.changePrintType(DoublePrinterController.PrintType.HEXA);
        controller.printDouble(num);
        controller.changePrintType(DoublePrinterController.PrintType.INTEGER);
        controller.printDouble(num);
    }
}
