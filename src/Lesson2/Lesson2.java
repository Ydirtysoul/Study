package Lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        add(a, b);
        add(3, a);
        add(5, 23);

        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aGreaterOrEqualThenB = a >= b;
        boolean aLessOrEqualThenB = a <= b;

        if (aGreaterThenB) {
            System.out.println("a > b");
        } else {
            System.out.println("False");
        }
        if (aLessThenB) {
            System.out.println("a < b");
        } else {
            System.out.println("False");
        }
        if (aGreaterOrEqualThenB) {
            System.out.println("a >= b");
        } else {
            System.out.println("False");
        }
        if (aLessOrEqualThenB) {
            System.out.println("a <= b");
        } else {
            System.out.println("False");
        }

        System.out.println("\nEnter an integer:");
        int num = checkInput();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    static void add(int x, int y) {
        int z = (x + y);
        System.out.println(z);
    }
    public static int checkInput() {
        Scanner userInput = new Scanner(System.in);
        while (!userInput.hasNextInt()) {
            System.out.println("This is not an integer");
            userInput.next();
        }
        return userInput.nextInt();
    }
}
