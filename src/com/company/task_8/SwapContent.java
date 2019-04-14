package com.company.task_8;

import org.omg.CORBA.IntHolder;

public class SwapContent {
    public static void swap(IntHolder a, IntHolder b) {
        System.out.println("Initial values = " + a.value + " and " + b.value);
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
        System.out.println("Final values = " + a.value + " and " + b.value);
    }
}
