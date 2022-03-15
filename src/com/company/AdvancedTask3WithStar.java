package com.company;

public class AdvancedTask3WithStar {
    public static void main(String[] args) {
        String monthName = new String();
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < month.length; i++) {
            monthName = month[i];
            switch (monthName) {
                case "December":
                case "January":
                case "February":
                    System.out.println("This is winter month");
                    break;
                case "March":
                case "April":
                case "May":
                    System.out.println("This is spring month");
                    break;
                case "June":
                case "July":
                case "August":
                    System.out.println("This is summer month");
                    break;
                case "September":
                case "October":
                case "November":
                    System.out.println("This is autumn month");
            }
        }
    }
}
