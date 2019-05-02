package com.company.task_6;

import java.util.Random;

public class RandomString {

    private static final String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String showRandomString(long number) {
        StringBuilder randomStringFormat = new StringBuilder();
        System.out.println(number);
        while (number > 0) {
            long digit = number % 36;
            randomStringFormat.insert(0, base.charAt((int) digit));
            number /= 36;
        }
        return randomStringFormat.toString();
    }
    public static String showRandomString() {
        StringBuilder randomStringFormat = new StringBuilder();
        long number = new Random().nextLong();
        if (number < 0) {
            number *= -1;
        }
        System.out.println(number);

        while (number > 0) {
            long digit = number % 36;
            randomStringFormat.insert(0, base.charAt((int) digit));
            number /= 36;
        }
        return randomStringFormat.toString();
    }
}
