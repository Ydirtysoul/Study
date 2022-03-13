package com.company;

import java.util.Scanner;

public class AdvancedTask42 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the bottom limit of the range");
        int valueMin = userInput.nextInt();
        System.out.println("Enter the upper limit of the range");
        int valueMax = userInput.nextInt();
        System.out.println("Range of even numbers:");
        evenNumbers(valueMin, valueMax);
    }

    public static int evenNumbers(int a, int b) {
        for (int i = a; a <= b; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
        return a;
    }
}
