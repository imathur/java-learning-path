package com.gojek.date20180328;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

//import static org.junit.Assert.*;

public class LargestPrimeFactorTest {

    private LargestPrimeFactor fixture;

    @Before
    public void setUp() {
        fixture = new LargestPrimeFactor();
    }

    @Test
    public void shouldReturnTrueIfNumberDivisibleByTarget() {
        assertThat(fixture.isDivisible(10L, 5L)).isTrue();
    }

    @Test
    public void shouldReturnFalseIfNumberNotDivisibleByTarget() {
        assertThat(fixture.isDivisible(10L,4L)).isFalse();
    }

    @Test
    public void shouldReturnFalseIfDivisibilityTargetIsNotPositive() {
        assertThat(fixture.isDivisible(10L,0L)).isFalse();
    }

    @Test
    public void shouldReturnFalseIfDivisibilityNumberIsNotPositive() {
        assertThat(fixture.isDivisible(-10L,2L)).isFalse();
    }

    @Test
    public void shouldReturnListOfFactorsUptoSqrtOfNumber() {
        assertThat(fixture.getFactorsUptoSqrtOfNumber(36L)).containsExactly(1L,2L,3L,4L,6L);
    }

    @Test
    public void shouldReturnTrueIfNumberIsPrime() {
        assertThat(fixture.isPrime(37L)).isTrue();
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotPrime() {
        assertThat(fixture.isPrime(39L)).isFalse();
    }

    @Test
    public void shouldReturnFalseIfNumberIsLessThan2() {
        assertThat(fixture.isPrime(1L)).isFalse();
    }

    @Test
    public void shouldReturnLargestPrimeFactorWhenNumberGreaterThanItsSqrt() {
        assertThat(fixture.getLargestPrimeFactor(74L)).isEqualTo(37L);
    }

    @Test
    public void shouldReturnLargestPrimeFactorWhenNumberLessThanItsSqrt() {
        assertThat(fixture.getLargestPrimeFactor(36L)).isEqualTo(3L);
    }

    @Test
    public void shouldReturnNumberWhenNumberIsPrime() {
        assertThat(fixture.getLargestPrimeFactor(37L)).isEqualTo(37L);
    }
}