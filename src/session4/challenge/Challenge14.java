package session4.challenge;

public class Challenge14 {

    //14. Write a Java program where you declare an integer variable counter with a value of 0. Use the increment operator to increase the value of counter by 1 and then print the value. After that, use the decrement operator to decrease the value of counter by 1 and then print the value.

    public static void main(String[] args) {
        int counter = 0;
        counter++;

        System.out.println("Increment counter: " + counter);

        counter--;
        System.out.println("Decrement counter: " + counter);
    }
}