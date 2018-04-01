package com.gojek.date20180326;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        int highestValueForItem = 4000000;

        EvenFibonacciNumbers fibonacciNumbers = new EvenFibonacciNumbers();

        // int sumOfEvenNumbers = fibonacciNumbers.getSumOfList(fibonacciNumbers.getEvenElements(fibonacciNumbers.generateFiboSeries(highestValueForItem)));
        int sumOfEvenNumbers = fibonacciNumbers.getSumOfEvenFibonacci(highestValueForItem);
        System.out.println(sumOfEvenNumbers);

    }

    protected boolean isEven(int n) {
        return n >= 0 && n % 2 == 0;
    }

    public boolean isLessThanTarget(int n, int target) {
        return n <= target;
    }

    public int getSumOfEvenFibonacci(int highestValueForItem) {
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 2));
        int resultSize = result.size();
        int sumEvenFiboNumbers = 2;

        int nextItem = result.get(resultSize - 1) + result.get(resultSize - 2);

        while (isLessThanTarget(nextItem, highestValueForItem)) {
            if (isEven(nextItem)) {
                sumEvenFiboNumbers += nextItem;
            }
            result.add(nextItem);
            resultSize = result.size();
            nextItem = result.get(resultSize - 1) + result.get(resultSize - 2);
        }

        return sumEvenFiboNumbers;
    }
}

//    public List<Integer> getEvenElements(List<Integer> list) {
//        return list.stream().filter(this::isEven).collect(Collectors.toList());
//    }
//
//    public int getSumOfList(List<Integer> list) {
//        return list.stream().mapToInt(Integer::intValue).sum();
//    }
//}
