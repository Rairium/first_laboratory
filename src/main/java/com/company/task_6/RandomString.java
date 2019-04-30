package com.company.task_6;

import java.util.Random;

public class RandomString {

    private static final String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void showRandomString() {
        String randomStringFormat = "";
        long number = new Random().nextLong();
        if (number < 0) {
            number *= -1;
        }
        System.out.println(number);

        while (number > 0) {
            long digit = number % 36;
            randomStringFormat = base.charAt((int)digit) + randomStringFormat;
            number /= 36;
        }
        System.out.println("The new random string is " + randomStringFormat);
    }
}
