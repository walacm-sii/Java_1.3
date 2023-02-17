package org.example;

public class Employee {

    private final String name;

    private final String surname;

    private final int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Salary for %s %s is %d", name, surname, salary);
    }
}
