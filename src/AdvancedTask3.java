import java.util.Scanner;

public class AdvancedTask3 {
    public static void main(String[] args) {
        for (int month = 1; month <= 12; month++)
            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("This is winter month");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("This is spring month");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("This is summer month");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("This is autumn month");
                    break;
            }

        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter variable 'number'");
        int number = userInput.nextInt();
        System.out.println("Enter variable 'i'");
        int i = userInput.nextInt();
        if (number < i) {
            for (int amount = number; amount < i; amount++)
                System.out.println("Random phrase");
        } else {
            System.out.println("\nThe number is greater or equal to i");
        }

        System.out.println("\nEnter variable 'a'");
        double a = userInput.nextInt();
        a = ((a == 0) || (a == 2) ? a+7 : a/10);
        System.out.println(a);

        System.out.println("\nEnter variable 'a'");
        int variableA = userInput.nextInt();
        System.out.println((variableA > 0) & (variableA < 5) ? "Right" : "Wrong");
    }
}
