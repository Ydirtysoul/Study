package Lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int userInput = new Scanner(System.in).nextInt();
        if (userInput % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
        }

