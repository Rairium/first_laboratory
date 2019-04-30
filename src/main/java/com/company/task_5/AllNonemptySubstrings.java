package com.company.task_5;

import java.util.Arrays;

public class AllNonemptySubstrings {
    public static String printAllSubstrings(String text) {
        char[] modifiedText = text.toCharArray();
        int n = modifiedText.length;
        for (int len = 1; len <= n; len++)
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    if (!Arrays.toString(modifiedText).isEmpty() && !(Arrays.toString(modifiedText).equals(" ")))
                        System.out.print(modifiedText[k]);
                }
                System.out.println();
            }
        String finalText = Arrays.toString(modifiedText);
        return finalText;
    }
}

