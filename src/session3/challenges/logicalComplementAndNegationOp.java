package session3.challenges;

import java.util.Scanner;

public class logicalComplementAndNegationOp {
    public static void main(String[] args) {

        //Write a program to check if a number is positive or negative using logical complement operator.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPositive = !(number < 0);
        if (isPositive) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative.");
        }

        //Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result

        System.out.print("Enter the first boolean: ");
        boolean boo1 = scanner.nextBoolean();
        System.out.print("Enter the second boolean: ");
        boolean boo2 = scanner.nextBoolean();
        boolean result1 = !boo1;
        boolean result2 = !boo2;

        System.out.println(result1);
        System.out.println(result2);

        scanner.close();
    }

}
