package com.company;

import java.util.Scanner;

public class AdvancedTask41 {
    public static void main(String[] args) {
        int factor;
        System.out.println("Enter an integer number for calculation");
        Scanner userInput = new Scanner(System.in);
        factor = userInput.nextInt();
        factor = factorial(factor);
        System.out.println(factor);
    }

    public static int factorial(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x = x * i;
        }
        return x;
    }
}
