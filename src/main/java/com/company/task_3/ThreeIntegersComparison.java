package com.company.task_3;

public class ThreeIntegersComparison {
    public static int compare(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static int mathCompare(int x, int y, int z) {
        int max = Math.max(x, y);
        max = Math.max(max, z);
        return max;
    }
}
