package session7.challenge;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Challenge6 {

    //6. Getting Current Time
    //Description: Write a method named displayCurrentTime that prints the current time to the console.
    //Expected Output: The current time in the format HH:MM:SS.

    public static void main(String[] args) {

        displayCurrentTime();
    }

    public static void displayCurrentTime() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.println("The current time: " + formattedTime);
    }
}