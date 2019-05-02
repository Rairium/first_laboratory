package com.company.task_5;

import java.util.Arrays;

public class AllNonemptySubstrings {
    public static int printAllSubstrings(String str) {
        String text = str.replace(" ", "");
        char[] modifiedText = text.toCharArray();
        int n = modifiedText.length;
        int count = 0;
        for (int len = 1; len <= n; len++)
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    if (!Arrays.toString(modifiedText).isEmpty()) {
                        System.out.print(modifiedText[k]);
                    }
                }
                count++;
                System.out.println();
            }
        return count;
    }
}

