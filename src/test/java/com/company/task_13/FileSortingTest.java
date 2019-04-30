package com.company.task_13;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FileSortingTest {

    @Test
    public void sorting() {
        File[] expected = FileSorting.sorting(new File("D:\\IntelliJ\\laborator\\task_13"));
        String mostExpected = Arrays.toString(expected);
        System.out.println(mostExpected);
        mostExpected = mostExpected.replace("[", "");
        mostExpected = mostExpected.replace("]", "");
        mostExpected = mostExpected.replace(",", "");
        mostExpected = mostExpected.replace(" ", "");
        mostExpected = mostExpected.replace("\n", "");
        String actual = "D:\\IntelliJ\\laborator\\task_13\\aFirstOne\n" +
                "D:\\IntelliJ\\laborator\\task_13\\pdfDirectory\n" +
                "D:\\IntelliJ\\laborator\\task_13\\textDirectory\n" +
                "D:\\IntelliJ\\laborator\\task_13\\wordDirectory\n" +
                "D:\\IntelliJ\\laborator\\task_13\\pdfDirectory\\presentation.pptx\n" +
                "D:\\IntelliJ\\laborator\\task_13\\textDirectory\\firstText.txt\n" +
                "D:\\IntelliJ\\laborator\\task_13\\textDirectory\\secondText.txt\n" +
                "D:\\IntelliJ\\laborator\\task_13\\wordDirectory\\laboratory.docx";
        actual = actual.replace("\n", "");
        assertEquals(mostExpected, actual);
    }
}