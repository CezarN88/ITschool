package session4.challenge;

public class Challenge2 {

    //2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.

    public  static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 8;

        System.out.println(firstNumber == secondNumber);

        String firstString = "OpenAI";
        String secondString = "OpenAI";
        boolean stringResult = firstString.equals(secondString);

        System.out.println(stringResult);
    }
}
