package com.luizgomendes.patterns.behavioral.chainofresponsibility;

public class LengthVerifier extends PasswordVerifier {

    private static final int MIN_LENGTH = 8;

    public LengthVerifier(PasswordVerifier nextStep) {
        super(nextStep);
    }

    @Override
    public boolean verifyPassword(String password) {
        if(password.length() < MIN_LENGTH) {
            System.out.println("Password needs to be at least " + MIN_LENGTH + " characters long");
            return false;
        }

        if(nextStep!= null) {
            return nextStep.verifyPassword(password);
        }
        System.out.println("Password verified");
        return true;
    }
}
