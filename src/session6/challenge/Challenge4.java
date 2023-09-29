package session6.challenge;

import java.util.Scanner;

public class Challenge4 {

    //4. Removing Vowels
    //Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeVowels(input);

        System.out.println("String after removing vowels: " + result);
        scanner.close();
    }

    public static String removeVowels(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!isVowel(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}