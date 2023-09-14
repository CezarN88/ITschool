package session4.challenge;

public class challenge4 {

    //4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.

    public static void main(String[] args) {
        int heightOne = 35;
        int heightTwo = 88;
        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
        System.out.println(maximumHeight);
    }
}
