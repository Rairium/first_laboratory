package com.company.task_4;

import java.math.BigInteger;

public class FactorialComputing {
    public static void showFactorial(int number) {
        if (number < 0){
            System.out.println("The factorial from a negative number cannot be calculated");
            return;
        }
        BigInteger bigResult = new BigInteger("1");
        for (int i = 1; i < number; i++){
            bigResult = bigResult.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The result is = " + bigResult);
    }
}
