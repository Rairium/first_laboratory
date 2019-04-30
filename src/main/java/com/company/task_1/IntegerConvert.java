package com.company.task_1;

public class IntegerConvert {
    public static String convertToBinary(int number) {
        if (number < 0) {
            return null;
        }
        String binaryFormat = "";
        if (number == 0) {
            return "0";
        }
        while (number != 0) {
            binaryFormat = (number % 2) + binaryFormat;
            number /= 2;
        }
        return binaryFormat;
    }

    public static String convertToHexa(int number) {
        if (number < 0) {
            return null;
        }
        String hexaDigits = "0123456789ABCDEF";
        String hexadecimalFormat = "";

        if (number == 0) {
            return "0";
        }
        while (number != 0) {
            int digit = number % 16;
            hexadecimalFormat = hexaDigits.charAt(digit) + hexadecimalFormat;
            number /= 16;
        }
        return hexadecimalFormat;
    }

    public static String convertToOctal(int number) {
        if (number < 0) {
            return null;
        }
        String octalFormat = "";
        if (number == 0) {
            return "0";
        }
        while (number != 0) {
            octalFormat = (number % 8) + octalFormat;
            number /= 8;
        }
        return octalFormat;
    }

}
