package session5.challenge;

import java.util.Scanner;

public class Challenge5 {

    //5. Fibonacci Series Generator
    //Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.

    public static void main(String[] args) {
        int n, number1 = 0, number2 = 1, number3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();

        System.out.print("Fibonacci series is: ");
        if (n == 1) {
            System.out.print(number1);
        } else if (n == 2) {
            System.out.print(number1 + " " + number2);
        } else if (n > 2) {
            System.out.print(number1 + " " + number2 + " ");
            for (int index = 3; index <= n; index++) {
                number3 = number1 + number2;
                System.out.print(number3 + " ");
                number1 = number2;
                number2 = number3;
            }
        } else {
            System.out.print("Invalid Input - Enter the value of n greater than 0");
        }
        scanner.close();
    }
}