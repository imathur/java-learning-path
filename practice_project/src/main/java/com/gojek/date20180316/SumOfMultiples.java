package com.gojek.date20180316;

public class SumOfMultiples {
    static boolean isMultiple(int x) {
        if (x % 3 == 0 || x % 5 == 0) {
            return true;
        }
        return false;
    }

    static int getSum() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (isMultiple(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("Sum = " + sum);
    }
}

