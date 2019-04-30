package com.company.task_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AngleNormalizerTest {

    @Test
    public void normalize() {
        int expected = AngleNormalizer.normalize(360);
        assertEquals(expected, 0);
    }

    @Test
    public void normalizeLow() {
        int expected = AngleNormalizer.normalize(135);
        assertEquals(expected, 135);
    }

    @Test
    public void normalizeHigh() {
        int expected = AngleNormalizer.normalize(700);
        assertEquals(expected, 340);
    }

    @Test
    public void normalizeIfZero() {
        int expected = AngleNormalizer.normalize(0);
        assertEquals(expected, 0);
    }

    @Test
    public void normalizeIfLowNegative() {
        int expected = AngleNormalizer.normalize(-90);
        assertEquals(expected, 270);
    }

    @Test
    public void normalizeIfHighNegative() {
        int expected = AngleNormalizer.normalize(-700);
        assertEquals(expected, 20);
    }

    @Test
    public void mathNormalize() {
        int expected = AngleNormalizer.normalize(360);
        assertEquals(expected, 0);
    }

    @Test
    public void mathNormalizeLow() {
        int expected = AngleNormalizer.normalize(135);
        assertEquals(expected, 135);
    }

    @Test
    public void mathNormalizeHigh() {
        int expected = AngleNormalizer.normalize(700);
        assertEquals(expected, 340);
    }

    @Test
    public void mathNormalizeIfZero() {
        int expected = AngleNormalizer.normalize(0);
        assertEquals(expected, 0);
    }

    @Test
    public void mathNormalizeIfLowNegative() {
        int expected = AngleNormalizer.normalize(-90);
        assertEquals(expected, 270);
    }

    @Test
    public void mathNormalizeIfHighNegative() {
        int expected = AngleNormalizer.normalize(-700);
        assertEquals(expected, 20);
    }
}