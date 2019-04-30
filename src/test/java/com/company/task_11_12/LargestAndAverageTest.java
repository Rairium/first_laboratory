package com.company.task_11_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestAndAverageTest {

    @Test
    public void average() {
        double expected = LargestAndAverage.average(SetEmployer.setEmployer());
        assertEquals(expected, 6000, 0);
    }

    @Test
    public void averageIfNull() {
        try {
            double expected = LargestAndAverage.average(SetEmployer.setEmployer());
            assertEquals(expected, 6000, 0);
        } catch (Exception e) {
            assertEquals(e.toString(), "java.lang.NullPointerException");
        }
    }

    @Test
    public void largest() {
        String expected = ((Employee) LargestAndAverage.largest(SetEmployer.setEmployer())).getName();
        assertEquals(expected, "Michael");
    }

    @Test
    public void largestIfNull() throws NullPointerException {
        try {
            String expected = ((Employee) LargestAndAverage.largest(null)).getName();
            assertEquals(expected, "Michael");
        } catch (Exception e) {
            assertEquals(e.toString(), "java.lang.NullPointerException");
        }
    }
}