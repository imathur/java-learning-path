package com.gojek.date20180326;

import org.junit.Before;
import org.junit.Test;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class EvenFibonacciNumbersTest {

    private EvenFibonacciNumbers fixture;

    @Before
    public void setUp() {
        fixture = new EvenFibonacciNumbers();
    }

    @Test
    public void shouldReturnTrueIfEven() {
        assertThat(fixture.isEven(6)).isTrue();
    }

    @Test
    public void shouldReturnFalseIfOdd() {
        assertThat(fixture.isEven(3)).isFalse();
    }

    @Test
    public void shouldReturnFalseIfNumberIsNegative() {
        assertThat(fixture.isEven(-4)).isFalse();
    }

    @Test
    public void shouldReturnTrueIfNumberIsLessThanTarget() {
        assertThat(fixture.isLessThanTarget(6, 10)).isTrue();
    }

    @Test
    public void shouldReturnFalseIfNumberIsGreaterThanTarget() {
        assertThat(fixture.isLessThanTarget(6, 3)).isFalse();
    }

    @Test
    public void shouldReturnTrueIfNumberIsSameAsTarget() {
        assertThat(fixture.isLessThanTarget(5, 5)).isTrue();
    }

    @Test
    public void shouldReturnTrueIfSumOfEvenFibonacciNumbersIsCorrect() {
        assertThat(fixture.getSumOfEvenFibonacci(100)).isEqualTo(44);
        assertThat(fixture.getSumOfEvenFibonacci(4000000)).isEqualTo(4613732);
    }
//    @Test
//    public void shouldReturnFibonacciSeriesUptoN() {
//        List<Integer> actual = fixture.generateFiboSeries(100);
//
//        assertThat(actual).containsExactly(1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
//    }
//
//    @Test
//    public void shouldReturnEvenElementsFromList() {
//        ArrayList<Integer> allElements = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
//        List<Integer> evenElements = fixture.getEvenElements(allElements);
//
//        assertThat(evenElements).containsExactly(2, 8, 34);
//    }
//
//    @Test
//    public void shouldReturnSumOfList() {
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
//        int sumOfList = fixture.getSumOfList(list);
//
//        assertThat(sumOfList).isEqualTo(6);
//    }
}