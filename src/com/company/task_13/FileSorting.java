package com.company.task_13;

import java.io.File;
import java.util.*;

public class FileSorting {
    public static void sorting(File file) {
        List<File> list = new ArrayList<>();
        for (File f : Objects.requireNonNull(file.listFiles()))
            if (f.listFiles() != null) {
                list.add(f);
                Collections.addAll(list, Objects.requireNonNull(f.listFiles()));
            }
        File[] fileArray = new File[list.size()];
        fileArray = list.toArray(fileArray);
        Arrays.sort(fileArray, (File a, File b) ->
                {
                    int comparator = Boolean.compare(b.isDirectory(), a.isDirectory());
                    if (comparator == 0)
                        comparator = (a).compareTo(b);
                    return comparator;
                }
        );
        for (File f : fileArray)
            System.out.println(f);

    }
}


