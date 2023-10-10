package session7.challenge;

import java.time.LocalDate;

public class Challenge5 {

    //5. Is Today a Specific Date?
    //Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
    //Expected Output:
    //true if today's date is 2019-12-10.
    //false otherwise.

    public static void main(String[] args) {

        System.out.println("Today`s date is 2019-12-10:" + isTodaySpecificDate());
        boolean isTodaySpecific = isTodaySpecificDate();
    }

    public static boolean isTodaySpecificDate() {
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2019, 12, 10);

        return today.equals(specificDate);
    }
}