package com.company.task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerConvertTest {

    @Test
    public void convertToBinary() {
        String expected = IntegerConvert.convertToBinary(10);
        assertEquals(expected, "1010");
    }

    @Test
    public void convertToBinaryIfZero() {
        String expected = IntegerConvert.convertToBinary(0);
        assertEquals(expected, "0");
    }

    @Test
    public void convertToBinaryIfNegative() {
        String expected = IntegerConvert.convertToBinary(-3);
        assertNull(expected);
    }

    @Test
    public void convertToHexa() {
        String expected = IntegerConvert.convertToHexa(10);
        assertEquals(expected, "A");
    }

    @Test
    public void convertToHexaIfZero() {
        String expected = IntegerConvert.convertToHexa(0);
        assertEquals(expected, "0");
    }

    @Test
    public void convertToHexaIfNegative() {
        String expected = IntegerConvert.convertToHexa(-3);
        assertNull(expected);
    }

    @Test
    public void convertToOctal() {
        String expected = IntegerConvert.convertToOctal(10);
        assertEquals(expected, "12");
    }
    @Test
    public void convertToOctalIfZero() {
        String expected = IntegerConvert.convertToOctal(0);
        assertEquals(expected, "0");

    }
    @Test
    public void convertToOctalIfNegative() {
        String expected = IntegerConvert.convertToOctal(-3);
        assertNull(expected);
    }
}