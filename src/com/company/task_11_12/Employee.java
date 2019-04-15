package com.company.task_11_12;

public class Employee implements Measurable {

    private double salary;
    private String name;

    Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

}

