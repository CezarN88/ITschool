package session4.challenge;

public class Challenge5 {

    //5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printEvenNumbersUpTo(int limitValue) {
        for (int i = 0; i <= limitValue; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}