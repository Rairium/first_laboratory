package com.company.task_5;

public class AllNonemptySubstrings {
    public static void printAllSubstrings(String text) {
        StringBuilder modifiedText = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                modifiedText.deleteCharAt(i);
                text = modifiedText.toString();
                i--;
            }
        }
        String newText = modifiedText.toString();
        if (newText.isEmpty()) {
            System.out.println("The new text is empty");
        } else
            System.out.println("The modified text is " + newText);
    }
}
