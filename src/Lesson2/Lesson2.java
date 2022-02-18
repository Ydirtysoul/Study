package Lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        int a = 7;
        int b = 8;
        sum(a, b);
        sum(3, a);
        sum(5, 23);

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите число:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    static void sum(int x, int y) {
        int z = (x + y);
        System.out.println(z);
    }
}
