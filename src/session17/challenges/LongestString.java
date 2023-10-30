package session17.challenges;

import java.util.Arrays;
import java.util.List;

public class LongestString {

    //2.Using a list of strings, find and print the longest string using Java streams. (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        String longestString = strings.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse("");

        System.out.println("Longest string: " + longestString);
    }
}