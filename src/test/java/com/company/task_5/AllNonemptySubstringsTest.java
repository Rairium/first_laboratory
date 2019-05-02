package com.company.task_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllNonemptySubstringsTest {

    @Test
    public void printAllSubstrings() {
        int expected = AllNonemptySubstrings.printAllSubstrings("Hello World");
        assertEquals(expected, 55);
    }
}