package com.example.employeemanagement;

public class Main {
    public static void main(String[] args) {
        // Skapa en Person instans
        Person person = new Person("John Doe", 25);
        person.getAge();

        // Skapa en Employee instans
        Employee employee = new Employee("Alice", 30, "Ingenjör");
        employee.work();
    }
}

