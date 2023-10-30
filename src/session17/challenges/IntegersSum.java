package session17.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegersSum {

    //6.Create a stream of integers from an array and find the sum of all integers using the reduce method. (Input: Integer[] numbers = {1, 2, 3, 4, 5};)

    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        int sum = numbers.stream()
                .reduce(0,(a,b) -> a + b);

        System.out.println("Sum of integers:" + sum);
    }
}