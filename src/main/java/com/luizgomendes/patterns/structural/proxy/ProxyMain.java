package com.luizgomendes.patterns.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        PrimeList primeList = new PrimeListProxy(10);
        System.out.println(primeList.getNPrime(1));
        System.out.println(primeList.getNPrime(9));
    }
}
