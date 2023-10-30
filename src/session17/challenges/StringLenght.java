package session17.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLenght {

    //7.Use streams to transform a list of strings into a list of their respective lengths. (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");

        List<Integer> stringLenghts = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("String lengths:" + stringLenghts);
    }
}