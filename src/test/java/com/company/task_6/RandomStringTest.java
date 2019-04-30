package com.company.task_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomStringTest {

    @Test
    public void showRandomStringIfNotNull() {
        String expected = RandomString.showRandomString();
        assertNotNull(expected);
    }
}