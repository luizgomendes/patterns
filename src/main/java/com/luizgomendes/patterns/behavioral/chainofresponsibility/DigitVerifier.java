package com.luizgomendes.patterns.behavioral.chainofresponsibility;

public class DigitVerifier extends PasswordVerifier {
    public DigitVerifier(PasswordVerifier nextStep) {
        super(nextStep);
    }

    @Override
    public boolean verifyPassword(String password) {
        if(password.matches(".*[0-9].*")) {
            if(nextStep == null) {
                System.out.println("Password verified");
                return true;
            }
            return nextStep.verifyPassword(password);
        }
        System.out.println("Password needs a digit");
        return false;
    }
}
