package session3.challenges;

import java.util.Scanner;

public class RelationalOp {
    public static void main(String[] args) {

        //Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1 + "is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + "is less than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }

        //Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 100) {
            System.out.println(number + "is in range of 1-100");
        } else {
            System.out.println(number + "is outside the range of 1-100");
        }
        scanner.close();
    }
}

