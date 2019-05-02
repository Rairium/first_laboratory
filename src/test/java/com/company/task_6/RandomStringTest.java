package com.company.task_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomStringTest {

    @Test
    public void showRandomStringIfNotNull() {
        String expected = RandomString.showRandomString();
        assertNotNull(expected);
    }

    @Test
    public void showRandomString() {
        String expected = RandomString.showRandomString(776432562436L);
        assertEquals(expected, "9WORWFES");
    }
}