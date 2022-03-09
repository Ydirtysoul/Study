package com.company;

import java.util.Scanner;

public class AdvancedTask43 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = userInput.nextInt();
        System.out.println("Enter the elements of the array");
        String[] array = new String[length];

        for (int i = 0; i < length; i++) {
            array[i] = userInput.next();
        }
        reversedArray(array);
    }
    public static String[] reversedArray(String[] a) {
        for (int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        return a;
    }
}
