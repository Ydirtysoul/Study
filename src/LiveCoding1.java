import java.util.Scanner;

public class LiveCoding1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first variable");
        int value1 = checkInput();
        System.out.println("Enter second variable");
        int value2 = checkInput();

        System.out.println("\nEnter the number of the operation: 1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int operationNumber = userInput.nextInt();

        switch (operationNumber) {
            case 1:
                System.out.println("Addition = " + add(value1, value2));
                break;
            case 2:
                System.out.println("Subtraction = " + subtract(value1, value2));
                break;
            case 3:
                System.out.println("Multiplication = " + multiply(value1, value2));
                break;
            case 4:
                System.out.println("Division = " + devide(value1, value2));
                break;
            default:
                System.out.println("Operation is undetermined");
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double devide(int x, int y) {
        return (double) x / y;
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
