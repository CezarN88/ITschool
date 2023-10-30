package session17.challenges;

import java.util.Arrays;
import java.util.List;

public class CharacterSum {

    //10.Using streams, find the total number of characters across a list of strings excluding whitespace characters. (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        int numbers = strings.stream()
                .flatMap(string -> Arrays.stream(string.split(" ")))
                .map(String::length)
                .reduce(0,Integer::sum);

        System.out.println(numbers);
    }
}
