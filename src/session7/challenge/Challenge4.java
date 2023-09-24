package session7.challenge;

import java.time.LocalDate;
import java.util.Scanner;

public class Challenge4 {

    //4. Comparing User-Entered Dates
    //Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise.
    //Input: Two dates entered by the user in the format YYYY-MM-DD.
    //Expected Output:
    //true if both dates are equal.
    //false if they are different.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String date1 = scanner.nextLine();

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String date2 = scanner.nextLine();

        boolean datesAreEqual = areDatesEqual(date1, date2);

        System.out.println("Dates are equal: " + datesAreEqual);
        scanner.close();
    }

    public static boolean areDatesEqual(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);

        return localDate1.equals(localDate2);
    }
}