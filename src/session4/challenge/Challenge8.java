package session4.challenge;

public class Challenge8 {

    //8. Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.

    public static void main(String[] args) {
        int number = 8;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}