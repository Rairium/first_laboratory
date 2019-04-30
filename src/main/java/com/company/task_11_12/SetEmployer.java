package com.company.task_11_12;

public class SetEmployer {
    public static Employee[] setEmployer() {
        Employee[] employees = new Employee[5];
        String[] names = {"John", "Jaime", "Max", "Ed", "Michael"};
        int j = 2000;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(names[i] + " has " + j + " $ salary");
            employees[i] = new Employee(j, names[i]);
            j += 2000;
        }
        return employees;
    }
}
