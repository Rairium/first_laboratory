package com.company.task_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeIntegersComparisonTest {

    @Test
    public void compare() {
        int expected = ThreeIntegersComparison.compare(4, 5, 6);
        assertEquals(expected, 6);
    }

    @Test
    public void compareWhenNegativePresent() {
        int expected = ThreeIntegersComparison.compare(4, 5, -6);
        assertEquals(expected, 5);
    }

    @Test
    public void compareWhenZero() {
        int expected = ThreeIntegersComparison.compare(0, 0, 0);
        assertEquals(expected, 0);
    }

    @Test
    public void mathCompare() {
        int expected = ThreeIntegersComparison.mathCompare(4, 5, 6);
        assertEquals(expected, 6);
    }

    @Test
    public void mathCompareWhenNegativePresent() {
        int expected = ThreeIntegersComparison.mathCompare(4, 5, -6);
        assertEquals(expected, 5);
    }

    @Test
    public void mathCompareWhenZero() {
        int expected = ThreeIntegersComparison.mathCompare(0, 0, 0);
        assertEquals(expected, 0);
    }
}