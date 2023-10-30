package session17.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCounter {

    //8.Given a string, use streams to count the number of vowels in it. (Input: String sentence = "Hello World";)

    public static void main(String[] args) {
        String sentence = "Hello World";
        List<String> vowels = new ArrayList<>(List.of("A", "a", "E", "e", "I", "i", "O", "o", "U", "u"));

        int numberOfVowels = (int) Arrays.stream(sentence.split(""))
                .filter(vowels::contains)
                .count();

        System.out.println(numberOfVowels);
    }
}