package session5.challenge;

public class Challenge3 {

    //3. Counting Negative Numbers
    //Given an array of integers, write a program to count and print the number of negative integers in the array.

    public static void main(String[] args) {
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count = 0;

        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }
        System.out.println("The number of negative integers in the array is: " + count);
    }
}