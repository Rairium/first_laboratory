package com.company.task_11_12;

public class LargestAndAverage {
    public static double average(Measurable[] objects) {
        double averageSalary = 0;
        for (Measurable object : objects) {
            averageSalary += object.getMeasure();
        }
        return averageSalary / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {
        double max = objects[0].getMeasure();
        Measurable largestSalary = null;
        for (Measurable measurable : objects) {
            if (measurable.getMeasure() >= max) {
                max = measurable.getMeasure();
                largestSalary = measurable;
            }
        }
        return largestSalary;
    }
}
