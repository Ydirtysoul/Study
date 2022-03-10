package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        int number = 0;
        switch (number) {

            case 1:
                System.out.println("Число равно 1");
                break;
            case 8:
                System.out.println("Число равно 8");
                break;
            case 9:
                System.out.println("Число равно 9");
                break;
            default:
                System.out.println("Число не равно 1,8,9\n");
        }
        int counter = 1;
        while (counter < 100) {
            counter++;
            System.out.println(counter);
        }
        int year = 0;
        int leapYear = 0;
        while (year <= 85) {
            if (year % 4 == 0) {
                leapYear++;
                year++;
            } else {
                year++;
            }
        }
        System.out.println("\nКоличество високосных лет - " + leapYear);
    }
    public static int magic(int x){
        return x == 10 ? 1 : 0;
    }
}