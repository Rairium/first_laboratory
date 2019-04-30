package com.company.task_8;

import org.junit.Test;
import org.omg.CORBA.IntHolder;

import static org.junit.Assert.*;

public class SwapContentTest {

    @Test
    public void swap() {
        IntHolder num1 = new IntHolder(5);
        IntHolder num2 = new IntHolder(7);
        SwapContent.swap(num1, num2);
        int[] expected = new int[2];
        expected[0] = num1.value;
        expected[1] = num2.value;
        int[] actual = {7, 5};
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }
}