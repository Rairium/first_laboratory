package com.company.task_4;

import java.math.BigInteger;

public class FactorialComputing {
    public static BigInteger showFactorial(int number) {
        if (number < 0){
            return BigInteger.valueOf(1);
        }
        BigInteger bigResult = new BigInteger("1");
        for (int i = 1; i <= number; i++){
            bigResult = bigResult.multiply(BigInteger.valueOf(i));
        }
        return bigResult;
    }
}
