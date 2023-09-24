package session6.challenge;

import java.util.Scanner;

public class Challenge2 {

    //2. Palindrome Checker
    //Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class. A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        String reversed = stringBuilder.toString();
        return input.equalsIgnoreCase(reversed);
    }
}
