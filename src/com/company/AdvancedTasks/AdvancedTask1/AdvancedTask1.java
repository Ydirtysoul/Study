package com.company.AdvancedTasks.AdvancedTask1;

import java.util.Scanner;

public class AdvancedTask1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter first integer number");
        int value1 = userInput.nextInt();

        System.out.println("Enter second integer number");
        int value2 = userInput.nextInt();

        System.out.println("Sum = "  + (value1 + value2));
        System.out.println("Difference = "  + (value1 - value2));
        System.out.println("Product = "  + (value1 * value2));
        System.out.println("Quotient = "  + ((double) value1 / value2));
        userInput.nextLine();

        System.out.println("\nEnter your surname");
        String userSurname = userInput.nextLine();

        System.out.println("Enter your name");
        String userName = userInput.nextLine();

        System.out.println("Enter your age");
        int userAge = userInput.nextInt();

        System.out.println("\nSurname: " + userSurname + "\nName: " + userName + "\nAge: " + userAge);
    }
}
