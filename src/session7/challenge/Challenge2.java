package session7.challenge;

import java.util.Scanner;

public class Challenge2 {

    //2. Date Decomposition
    //Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
    //Input: A date in the format YYYY-MM-DD.
    //Expected Output:
    //makefile
    //Copy code
    //Year: YYYY
    //Month: MM
    //Day: DD

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        displayDateComponents(inputDate);
        scanner.close();
    }

    public static void displayDateComponents(String date) {
        String[] components = date.split("-");

        if (components.length == 3) {
            String year = components[0];
            String month = components[1];
            String day = components[2];

            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        } else {
            System.out.println("Invalid date format.Please use YYYY-MM-DD format.");
        }
    }
}