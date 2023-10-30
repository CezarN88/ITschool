package session17.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenation {

    //4.Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a comma. (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");

        String concatenatedString = strings.stream()
                .collect(Collectors.joining(", "));

        System.out.println(concatenatedString);
    }
}