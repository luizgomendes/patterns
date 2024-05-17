package com.luizgomendes.patterns.behavioral.chainofresponsibility;

public class CharVerifier extends PasswordVerifier {
    public CharVerifier(PasswordVerifier nextStep) {
        super(nextStep);
    }
    @Override
    public boolean verifyPassword(String password) {
        if(password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")) {
            if(nextStep == null) {
                System.out.println("Password verified");
                return true;
            }
            return nextStep.verifyPassword(password);
        }
        System.out.println("Password needs an upper case letter and a lower case letter");
        return false;
    }
}
