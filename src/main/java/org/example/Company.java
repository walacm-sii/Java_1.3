package org.example;

import java.util.ArrayList;

public class Company {

    private final ArrayList<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public int getSumOfSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
