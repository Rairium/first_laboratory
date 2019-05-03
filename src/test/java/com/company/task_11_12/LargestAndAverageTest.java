package com.company.task_11_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestAndAverageTest {

    @Test
    public void average() throws NegativeSalaryException {
        double expected = LargestAndAverage.average(SetEmployer.setEmployer());
        assertEquals(expected, 6000, 0);
    }

    @Test
    public void averageIfSalaryNegative() {
        try {
            double expected = LargestAndAverage.average(SetNegativeEmployeer.setNegativeEmployer());
            assertEquals(expected, 0, 0);
        } catch (NegativeSalaryException e) {
            assertEquals(e.getMessage(), "found negative salary");
        }
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
    public void largest() throws NegativeSalaryException {
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

    @Test
    public void largestIfSalaryNegative() {
        try {
            String expected = ((Employee) LargestAndAverage.largest(SetNegativeEmployeer.setNegativeEmployer())).getName();
            assertEquals(expected, 3000, 0);
        } catch (NegativeSalaryException e) {
            assertEquals(e.getMessage(), "found negative salary");
        }
    }
}