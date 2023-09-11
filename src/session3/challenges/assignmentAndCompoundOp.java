package session3.challenges;

import java.util.Scanner;


public class assignmentAndCompoundOp {
    public static void main(String[] args) {

        //Create a Java program that demonstrates the use of each compound assignment operator with integers.

        int x = 10, z = 2;
        System.out.println(x);
        System.out.println(z);
        x += z;
        System.out.println(x);
        x -= z;
        System.out.println(x);
        x *= z;
        System.out.println(x);
        x /= z;
        System.out.println(x);
        x %= z;
        System.out.println(x);
        x &= z;
        System.out.println(x);
        x |= z;
        System.out.println(x);
        x ^= z;
        System.out.println(x);
        x <<= z;
        System.out.println(x);
        x >>= z;
        System.out.println(x);
        x >>>= z;

        System.out.println(x);

        //Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter the discount: ");
        double discount = scanner.nextDouble();
        double discountPercentage = (price * discount) / 100;
        price -= discountPercentage;
        System.out.println(price);
        scanner.close();

    }
}
