package com.company.task_7;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NotASCIITest {

    @Test
    public void printNotASCII() {
        ArrayList<Character> firstExpected = NotASCII.printNotASCII(" grewg rewg erewgg șâțșțșp  汉字 Tra      dition al Chinese 漢字漢字漢字漢字 \u00A9");
        String expected = firstExpected.toString();
        expected = expected.replace("[", "");
        expected = expected.replace("]", "");
        expected = expected.replace(",", "");
        expected = expected.replace(" ", "");
        String actual = "șțșțș汉字漢字漢字漢字漢字";
        assertEquals(expected,actual);
    }
}