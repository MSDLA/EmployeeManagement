package com.example.employeemanagement;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public void work() {
        System.out.println("Jag arbetar som en " + this.jobTitle + ".");
    }
}

