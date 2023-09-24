package session6.challenge;

import java.util.Scanner;

public class Challenge1 {

    //1. Reverse a String
    //Description: Use the StringBuilder class to write a program that reverses an input string. For example, the input "hello" should return "olleh".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }

    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
