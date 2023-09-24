package session7.challenge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Challenge1 {

    //1. Displaying Today's Date
    //Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
    //Expected Output: Today's date in the format YYYY-MM-DD.

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        String formattedDate = dateFormat.format(today);
        System.out.println("Today`s date: " + formattedDate);
    }
}