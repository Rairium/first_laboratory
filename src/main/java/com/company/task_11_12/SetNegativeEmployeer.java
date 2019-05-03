package com.company.task_11_12;

public class SetNegativeEmployeer {
    public static Employee[] setNegativeEmployer() {
        Employee[] employees = new Employee[5];
        String[] names = {"Ivan", "Jaime", "Max", "Ed", "Michael"};
        int j = -2000;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(names[i] + " has " + j + " $ salary");
            employees[i] = new Employee(j, names[i]);
            j += 1000;
        }
        return employees;
    }
}
