package session3.challenges;

import java.util.Scanner;

public class IncrementAndDecrementOp {
    public static void main(String[] args) {

        // Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1

        System.out.println("Counting to 10:");
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }

        System.out.println("Counting to 1:");
        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
        }

        //Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        int incrementedNumber = number + 1;
        int decrementedNumber = number - 1;

        System.out.println(number);
        System.out.println(incrementedNumber);
        System.out.println(decrementedNumber);
        scanner.close();
    }
}