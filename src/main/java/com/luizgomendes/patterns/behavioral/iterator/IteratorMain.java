package com.luizgomendes.patterns.behavioral.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        NPrimesList nPrimesList = new NPrimesList(10);
        for(Iterator iter = nPrimesList.getIterator();iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}
