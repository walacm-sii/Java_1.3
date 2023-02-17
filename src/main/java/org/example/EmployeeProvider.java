package org.example;

import java.util.Scanner;

public class EmployeeProvider {

    private final Scanner scanner;

    public EmployeeProvider(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee getEmployeeFromUser() {
        System.out.println("Please provide employee name, surname and salary.");
        String name = UserInputHandler.takeNotEmptyStringFromUser(scanner, "name");
        String surname = UserInputHandler.takeNotEmptyStringFromUser(scanner, "surname");
        int salary = UserInputHandler.takePositiveIntegerFromUser(scanner, "salary");
        return new Employee(name, surname, salary);
    }
}
