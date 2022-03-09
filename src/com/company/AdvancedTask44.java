package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedTask44 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the amount of lines");
        int width = userInput.nextInt();
        System.out.println("Enter the amount of columns");
        int length = userInput.nextInt();
        int[][] startArray = new int[length][width];
        int[][] finishArray = new int[length][width];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                startArray[i][j] = userInput.nextInt();
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                finishArray[i][j] = startArray[length - 1 - i][width - 1 - j];
            }
        }

        Arrays.stream(startArray).map(Arrays::toString).forEach(System.out::println);
        System.out.println("\n");
        Arrays.stream(finishArray).map(Arrays::toString).forEach(System.out::println);
    }
}
