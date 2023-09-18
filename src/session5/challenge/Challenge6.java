package session5.challenge;

import java.util.Scanner;

public class Challenge6 {
    //6. While Loop
    //Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (enter -1 to finish): ");
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of all numbers entered (excluding -1): " + sum);
        scanner.close();
    }
}