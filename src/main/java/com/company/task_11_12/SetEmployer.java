package com.company.task_11_12;

import java.util.concurrent.ThreadLocalRandom;

public class SetEmployer {
    public static Employee[] setEmployer() {
        Employee[] employees = new Employee[5];
        String[] names = {"John", "Jaime", "Max", "Ed", "Michael"};
        int max = 10000;
        int min = 2000;
        for (int i = 0; i < employees.length; i++) {
            int j = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println(names[i] + " has " + j + " $ salary");
            employees[i] = new Employee(j, names[i]);
        }
        return employees;
    }
}
