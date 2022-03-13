package com.company.AdvancedTasks.AdvancedTask2;

import java.util.Scanner;

public class AdvancedTask2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int value = userInput.nextInt();

        if (value > 10) {
            System.out.println("The number is greater than 10");
        } else if (value < 10) {
            System.out.println("The number is lower than 10");
        } else {
            System.out.println("Число равно is equal 10");
        }

        boolean statement;
        int a, b;

        a = 10;
        b = 5;
        statement = a > b;
        System.out.println("\n" + statement);

        a = 50;
        b = 25;
        statement = a > b;
        System.out.println("\n" + statement);

        a = 67;
        b = 23;
        statement = a < b;
        System.out.println("\n" + statement);

        a = 90;
        b = 80;
        statement = a == b;
        System.out.println("\n" + statement);

        System.out.println("\nEnter an integer number a");
        a = userInput.nextInt();
        ;
        b = 80;
        statement = a == b;
        System.out.println(statement);

        System.out.println("\nEnter an integer number b greater than 100");
        a = 100;
        b = userInput.nextInt();
        statement = a < b;
        if (statement) {
            System.out.println(statement);
        } else {
            System.out.println("Look carefully at the requirement for the number b");
        }

        System.out.println("\nEnter an integer number a equal b/2");
        a = userInput.nextInt();
        b = 60;
        a = a + b / 2;
        statement = a == b;
        if (statement) {
            System.out.println(statement);
        } else {
            System.out.println("Look carefully at the requirement for the number a");
        }

        System.out.println("\nEnter an integer number a equal b/2");
        a = userInput.nextInt();
        b = 146;
        a = a + b / 2;
        statement = a == b;
        if (statement) {
            System.out.println(statement);
        } else {
            System.out.println("Look carefully at the requirement for the number a");
        }

        String answer;
        boolean comparance;
        System.out.println("\nWhat does the pussy say?");
        answer = userInput.next();
        if (comparance = answer.equalsIgnoreCase("meow")) {
            System.out.println("You God damn right.");
        } else {
            System.out.println("This must be told by another animal");
        }

        System.out.println("\nEnter an integer number 1");
        int value1 = userInput.nextInt();
        System.out.println("\nEnter an integer number 2");
        int value2 = userInput.nextInt();
        boolean statement1, statement2;
        statement1 = value1 > value2;
        statement2 = value1 < value2;

        if (statement1) {
            System.out.println("\nFirst integer is greater than second");
        } else if (statement2) {
            System.out.println("First integer is lower than second");
        } else {
            System.out.println("Integers is equal");
        }
    }
}
