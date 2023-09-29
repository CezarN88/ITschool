package session7.challenge;

import java.time.LocalDate;

public class Challenge3 {

    //3. Create a Specific Date
    //Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
    //Expected Output: A date object for 2025-8-19.

    public static void main(String[] args) {
        LocalDate date = createSpecificDate();

        System.out.println("A date object for: " + date);
    }

    public static LocalDate createSpecificDate() {
        LocalDate specificDate = LocalDate.of(2025, 8, 19);
        return specificDate;
    }
}