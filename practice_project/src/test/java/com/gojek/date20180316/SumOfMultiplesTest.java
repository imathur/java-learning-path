package com.gojek.date20180316;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfMultiplesTest {
    private int primeNumber = 29;
    private int multipleOf3 = 6;
    private int multipleOf5 = 20;
    private int multipleOf3And5 = 15;

    @Test
    public void shouldCheckIfDivisibleBy3Or5() {
        assertThat(SumOfMultiples.isMultiple(primeNumber)).isFalse();
        assertThat(SumOfMultiples.isMultiple(multipleOf3)).isTrue();
        assertThat(SumOfMultiples.isMultiple(multipleOf5)).isTrue();
        assertThat(SumOfMultiples.isMultiple(multipleOf3And5)).isTrue();
    }

    @Test
    public void shouldCheckIfSumIsCorrect() {
        assertThat(SumOfMultiples.getSum()).isEqualTo(233168);
        assertThat(SumOfMultiples.getSum()).isEqualTo(23316);
    }
}
