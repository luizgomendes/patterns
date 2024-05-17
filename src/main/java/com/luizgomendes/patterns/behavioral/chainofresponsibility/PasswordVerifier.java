package com.luizgomendes.patterns.behavioral.chainofresponsibility;

public abstract class PasswordVerifier {
    public PasswordVerifier nextStep;

    public PasswordVerifier(PasswordVerifier nextStep) {
        this.nextStep = nextStep;
    }

    public static PasswordVerifier doVerificationChaining() {
        PasswordVerifier digitStep = new DigitVerifier(null);
        PasswordVerifier charStep = new CharVerifier(digitStep);

        return new LengthVerifier(charStep);
    }
    public abstract boolean verifyPassword(String password);
}
