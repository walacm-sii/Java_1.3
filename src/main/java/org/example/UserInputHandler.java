package org.example;

import java.util.Scanner;

public class UserInputHandler {

    public static String takeNotEmptyStringFromUser(Scanner scanner, String field) {
        String string = "";
        do {
            System.out.printf("Input %s. It cannot be empty!\n", field);
            string = scanner.nextLine();
        } while (string.isEmpty());
        return string;
    }

    public static int takePositiveIntegerFromUser(Scanner scanner, String field) {
        int salary;
        while (true) {

            System.out.printf("Input %s. It must be a positive integer\n", field);
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next();
            }
            salary = scanner.nextInt();//
            scanner.nextLine();

            if (salary > 0) {
                break;
            } else {
                System.out.println("Wrong number!");
            }
        }
        return salary;
    }
}
