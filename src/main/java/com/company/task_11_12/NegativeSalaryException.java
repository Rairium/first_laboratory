package com.company.task_11_12;

public class NegativeSalaryException extends Exception{
    public NegativeSalaryException(String errorMsg){
        super(errorMsg);
    }
}