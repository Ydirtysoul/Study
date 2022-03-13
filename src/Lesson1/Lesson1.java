package Lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Ну, здравствуй World!\n");
        int value1 = 0;
        int value2 = 5;
        int sum = value1 + value2;
        System.out.println("Сумма " + sum);
        int multiply = value1 * value2;
        System.out.println("Произведение " + multiply);
        int difference = value1 - value2;
        System.out.println("Разность " + difference);
        Scanner userInput = new Scanner;
        String str = userInput.nextLine();
        System.out.println(str);
    }
}
