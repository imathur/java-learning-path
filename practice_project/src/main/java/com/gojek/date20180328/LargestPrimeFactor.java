package com.gojek.date20180328;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        LargestPrimeFactor factor = new LargestPrimeFactor();

        long number = 600851475143L;
        long largestPrimeFactor = factor.getLargestPrimeFactor(number);
        System.out.println(largestPrimeFactor);
    }

    public boolean isDivisible(long number, long target) {
        return target >= 1 && number >= 1 && number % target == 0;
    }

    public ArrayList<Long> getFactorsUptoSqrtOfNumber(long number) {
        ArrayList<Long> factors = new ArrayList<>();

        for (long i = 1; i <= Math.sqrt(number); i++) {
            if (isDivisible(number, i)) {
                factors.add(i);
            }
        }
        return factors;
    }

    public boolean isPrime(long n) {
        return (n > 2) && (getFactorsUptoSqrtOfNumber(n).size() == 1);
    }

    public long getLargestPrimeFactor(long number) {
        List<Long> factors = getFactorsUptoSqrtOfNumber(number);

        for (long i = 0; i < factors.size(); i++) {
            long factor = number/(factors.get((int) i));
            if (isPrime(factor)) {
                return factor;
            }
        }
        for (long i = factors.size()-1; i > 0; i--) {
            long factor = factors.get((int) i);
            if (isPrime(factor)) {
                return factor;
            }
        }
        return number;
    }
}
