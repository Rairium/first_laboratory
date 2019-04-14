package com.company.task_2;

public class AngleNormalizer {
    public static void normalize(int angle) {
        if (angle >= 0) {
            System.out.println("Normalized angle = " + angle % 360);
        } else {
            System.out.println("Normalized angle = " + (360 + angle % 360));
        }
    }

    public static void mathNormalize(int angle) {
        System.out.println("Normalized angle = " + Math.floorMod(angle, 360));
    }
}
