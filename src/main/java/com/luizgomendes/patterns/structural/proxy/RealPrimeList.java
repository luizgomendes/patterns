package com.luizgomendes.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealPrimeList implements PrimeList{
    List<Integer> primeList;
    public RealPrimeList(int size) {
        System.out.println("Calculating prime list");
        primeList = new ArrayList<>();
        int currentNum = 2;
        while(primeList.size() != size) {
            currentNum = getNextPrime(currentNum);
            primeList.add(currentNum);
            currentNum++;
        }
        System.out.println("Prime List: " + String.join(",",primeList.stream().map(Integer::toUnsignedString).toList()));
    }

    private int getNextPrime(int num) {
        while(true) {
            if(isPrime(num)) {
                return num;
            }
            num++;
        }
    }

    private boolean isPrime(int num) {
        int factors = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0) {
                factors++;
            }
        }
        System.out.println(factors == 2?num + " is prime":num+" is not prime");
        return factors == 2;
    }

    @Override
    public int getNPrime(int n) {
        if(n >= primeList.size()) {
            throw new RuntimeException("Index bigger than prime list");
        }
        System.out.println("Getting prime from real list");
        return primeList.get(n);
    }
}
