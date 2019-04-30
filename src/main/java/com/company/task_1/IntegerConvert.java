package com.company.task_1;

public class IntegerConvert {
    public static void convert(int number) {
        if (number < 0) {
            System.out.println("Not a positive number !!!");
            return;
        }
        String hexaDigits = "0123456789ABCDEF";
        String binaryFormat = "";
        String octalFormat = "";
        String hexadecimalFormat = "";
        if (number == 0) {
            System.out.println("Binary format = " + 0);
            System.out.println("Octal format = " + 0);
            System.out.println("Hexadecimal format = " + 0);
            return;
        }
        int initialNumber = number;
        while (number != 0) {
            binaryFormat = (number % 2) + binaryFormat;
            number /= 2;
        }
        number = initialNumber;
        while (number != 0) {
            octalFormat = (number % 8) + octalFormat;
            number /= 8;
        }
        number = initialNumber;
        while (number != 0) {
            int digit = number % 16;
            hexadecimalFormat = hexaDigits.charAt(digit) + hexadecimalFormat;
            number /= 16;
        }
        //three top functions can be in one by taking the format ( binary, octal or hexa) it will reduce some functions
        System.out.println("Binary format = " + binaryFormat);
        System.out.println("Octal format = " + octalFormat);
        System.out.println("Hexadecimal format = " + hexadecimalFormat);
    }
}
