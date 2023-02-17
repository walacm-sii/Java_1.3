package org.example;

import java.util.Scanner;

public class Main {

    private static final int INITIAL_NR_OF_EMPLOYEES = 2;
    private static Company company;
    private static Scanner scanner;
    private static EmployeeProvider employeeProvider;

    private static final String MENU = """
            1 – Print sum of all employees salary
            2 – Display all employees data
            3 – Add new employee
            4 – End program""";

    public static void main(String[] args) {
        company = new Company();
        scanner = new Scanner(System.in);
        employeeProvider = new EmployeeProvider(scanner);

        addInitialEmployees();

        outerloop:
        while (true) {
            System.out.println(MENU);
            switch (scanner.nextLine()) {
                case "1" -> displaySumOfSalaries();
                case "2" -> displayAllEmployeesData();
                case "3" -> addEmployee();
                case "4" -> {
                    break outerloop;
                }
                default -> System.out.println("Wrong option");
            }
        }
    }

    private static void displaySumOfSalaries() {
        System.out.printf("Sum of all employees salary is %d\n", company.getSumOfSalaries());
    }

    private static void displayAllEmployeesData() {
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.toString());
        }
    }

    private static void addEmployee() {
        company.addNewEmployee(employeeProvider.getEmployeeFromUser());
    }

    private static void addInitialEmployees() {
        for (int i = 0; i < INITIAL_NR_OF_EMPLOYEES; i++) {
            addEmployee();
        }
    }
}