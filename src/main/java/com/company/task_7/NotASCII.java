package com.company.task_7;

import java.util.ArrayList;

public class NotASCII {
    public static ArrayList<Character> printNotASCII(String text) {
        ArrayList<Character> arrayList = new ArrayList<>();
        char[] myText = text.toCharArray();
        for (char c : myText) {
            if ((int) c > 255) {
                System.out.print("This is a non-ASCII character ");
                System.out.println(c + " " + (int) c);
                arrayList.add(c);
            }
        }
        return arrayList;
    }
}
