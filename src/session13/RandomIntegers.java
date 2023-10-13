package session13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntegers {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random generator = new Random();
        generator.nextInt();

        for (int counter = 0; counter < 7; counter++) {
            integers.add(generator.nextInt(100));
        }
        System.out.println(integers);
        System.out.println(getSmallest(integers));
    }

    public static int getSmallest(List<Integer> integers) {
        int smallest = integers.get(0);
        for (int num : integers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
}

