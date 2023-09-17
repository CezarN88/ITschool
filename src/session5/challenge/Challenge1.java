package session5.challenge;

import java.util.Scanner;

public class Challenge1 {

    //1. Even or Odd Checker
    //Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        scanner.close();
    }
}