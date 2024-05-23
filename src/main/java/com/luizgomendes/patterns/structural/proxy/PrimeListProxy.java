package com.luizgomendes.patterns.structural.proxy;

public class PrimeListProxy implements PrimeList{

    private RealPrimeList realPrimeList = null;
    private final int size;

    public PrimeListProxy(int size) {
        this.size = size;
    }

    @Override
    public int getNPrime(int n) {
        System.out.println("Getting prime from proxy list");
        if(realPrimeList == null) {
            realPrimeList = new RealPrimeList(size);
        }
        return realPrimeList.getNPrime(n);
    }
}
