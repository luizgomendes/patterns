package com.luizgomendes.patterns.behavioral.chainofresponsibility;

public class PasswordVerifierMain {

    public static void main(String[] args) {
        PasswordVerifier passwordVerifier = PasswordVerifier.doVerificationChaining();
        passwordVerifier.verifyPassword("123");
        passwordVerifier.verifyPassword("abcdabcd");
        passwordVerifier.verifyPassword("ABCDabcd");
        passwordVerifier.verifyPassword("ABcd1234");
    }
}
