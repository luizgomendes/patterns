package com.luizgomendes.patterns.behavioral.iterator;

public class NPrimesList implements Iterable{

    private final Integer[] primesList;
    public NPrimesList(int n) {
        primesList = new Integer[n];
        initPrimesList();
    }

    private void initPrimesList() {
        int primeIndex = 0;
        int currentNum = 2;
        while(primeIndex != primesList.length) {
            currentNum = getNextPrime(currentNum);
            primesList[primeIndex] = currentNum;
            currentNum++;
            primeIndex++;
        }
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
    public Iterator getIterator() {
        return new Iterator() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<primesList.length;
            }

            @Override
            public Object next() {
                if(hasNext()) {
                    return primesList[index++];
                }
                return null;
            }
        };
    }
}
