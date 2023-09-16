package session3.challenges;

import java.util.Scanner;

public class UnaryOp {
    public static void main(String[] args) {

        //Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.

        Scanner scanner = new Scanner(System.in);
        int variable = 5;
        System.out.println(variable);
        //Increment
        variable++;
        System.out.println(variable);
        //Decrement
        variable--;
        System.out.println(variable);

        //Write a program that reverses the sign of an entered integer using unary minus operator.

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = -number;

        System.out.println(number);
        System.out.println(reversedNumber);
        scanner.close();
    }
}
