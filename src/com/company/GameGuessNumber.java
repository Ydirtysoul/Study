package com.company;

import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {
        Scanner userUnput = new Scanner(System.in);
        int number = 1 + (int) (Math.random() * 100);
        System.out.println("Try to guess the number");
        int userTry = userUnput.nextInt();

        for (int i = 0; i < 9; i++) {
            if (userTry == number) {
                System.out.println("You God damn right");
                break;
            } else if (userTry < number) {
                System.out.println("You number is lower than guessed. Try one more time");
                userTry = userUnput.nextInt();
            } else {
                System.out.println("Your number is greater than guessed.Try one more time");
                userTry = userUnput.nextInt();
            }
        }
        System.out.println("Game over. Guessed number is " + number);
    }
}




