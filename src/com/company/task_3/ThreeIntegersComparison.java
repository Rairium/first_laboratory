package com.company.task_3;

public class ThreeIntegersComparison {
    public static void compare(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("The largest integer is = " + x);
        } else if (y > z) {
            System.out.println("The largest integer is = " + y);
        } else {
            System.out.println("The largest integer is = " + z);
        }
    }
    public static void mathCompare(int x, int y, int z){
        int max = Math.max(x , y);
        max = Math.max(max, z);
        System.out.println("The largest integer is = " + max);
    }
}
