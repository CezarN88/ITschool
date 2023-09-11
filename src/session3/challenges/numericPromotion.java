package session3.challenges;

public class numericPromotion {
    public static void main(String[] args) {

        //Write a program where you perform operations between an integer and a double. Display the result and discuss why it is in that format (due to Numeric Promotion).

        int Integer = 2;
        double Double = 2.5;
        double addition = Integer + Double;
        System.out.println(addition);

        //Create a program that takes two byte values, adds them together, and stores the result in a byte variable. Explain why the result is or is not what you'd expect, based on the rules of numeric promotion.

        byte byte1 = 50;
        byte byte2 = 70;
        // byte3 = byte1 + byte2;
        //This error occurs because the result of adding two byte values is promoted to an int, and you cannot directly store an int into a byte variable byte.
        System.out.println("//byte3");

    }
}