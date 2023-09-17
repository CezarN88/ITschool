package session4.challenge;

public class Challenge11 {

    //11. Write a Java program where you declare four integer variables: a, b, c, and d. Assign them values of 10, 20, 30, and 40 respectively. Create two more variables additionResult and multiplicationResult. Set additionResult to the sum of a and b and multiplicationResult to the product of c and d. Print the values of additionResult and multiplicationResult.

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int additionalResult = a + b;
        int multiplicationResult = c * d;

        System.out.println("Additional Result: " + additionalResult);
        System.out.println("Multiplication Result: " + multiplicationResult);
    }
}