package session3.challenges;

import java.util.Scanner;

public class BinaryArithmeticOp {
    public static void main(String[] args) {

        //Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulus = num1 % num2;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulus);

        //Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        double area = length * breadth;

        System.out.println(area);
        scanner.close();
    }
}