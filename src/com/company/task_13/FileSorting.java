package com.company.task_13;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class FileSorting {
    public static void sorting(File file) {
        File[] files = file.listFiles();
        Arrays.sort(files, Comparator.comparing(File::isFile));
        System.out.println(Arrays.toString(files));
    }
}
// :: transmite functiile ca argument


