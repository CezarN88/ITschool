package session4.challenge;

import javax.sound.midi.Soundbank;

public class Challenge16 {

    //16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.

    public static void main(String[] args) {
        int number = 50;
        int negatedNumber = -number;

        System.out.println("Negated Number: " + negatedNumber);

        int absoluteValue = Math.abs(negatedNumber);
        System.out.println("Absolute Value: " + absoluteValue);

        int incrementedValue = absoluteValue + 1;
        System.out.println("Incremented Value: " + incrementedValue);
    }
}