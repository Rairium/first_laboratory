package com.company.task_7;

public class NotASCII {
    public static void printNotASCII(String text) {
        char[] myText = text.toCharArray();
        for (char c : myText) {
            if ((int) c > 255) {
                System.out.print("This is a non-ASCII character ");
                System.out.println(c + " " + (int) c);
            }
        }
    }
}
