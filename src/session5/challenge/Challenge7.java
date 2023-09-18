package session5.challenge;

import java.util.Scanner;

public class Challenge7 {

    //7. Do-While Loop
    //Create a program where the user is prompted to guess a predefined number. After each guess, the program should inform the user if the guess is too high or too low. The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please guess the number! : ");
        int predefinedNumber = 88;
        int inputNumber = scanner.nextInt();

        while (inputNumber != predefinedNumber) {
            if (inputNumber > predefinedNumber) {
                System.out.println("Number too high!");
            } else {
                System.out.println("Number too low!");
            }
            System.out.println("Please try again!");
            inputNumber = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Perfect!You guess the number!: " + predefinedNumber);
    }
}