package com.company.task_2;

public class AngleNormalizer {
    public static int normalize(int angle) {
        if (angle >= 0) {
            return angle % 360;
        } else {
            return 360 + angle % 360;
        }
    }

    public static int mathNormalize(int angle) {
       return Math.floorMod(angle, 360);
    }
}
