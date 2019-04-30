package com.company.task_4;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FactorialComputingTest {

    @Test
    public void showFactorial() {
        BigInteger expected = FactorialComputing.showFactorial(10);
        assertEquals(expected, BigInteger.valueOf(3628800));
    }
    @Test
    public void showFactorialWhenZero() {
        BigInteger expected = FactorialComputing.showFactorial(0);
        assertEquals(expected, BigInteger.valueOf(1));
    }
    @Test
    public void showFactorialWhenNegative() {
        BigInteger expected = FactorialComputing.showFactorial(-10);
        assertEquals(expected, BigInteger.valueOf(1));
    }
}