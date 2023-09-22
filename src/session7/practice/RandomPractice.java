package session7.practice;

import java.util.*;

public class RandomPractice {

    public static void main(String[] args) {
        Random random = new Random();


        for (int index = 0 ; index <= 100; index++) {
            int randomInt = random.nextInt(1, 100);
            System.out.println("Random number " + index + ": " + randomInt);
            System.out.println("UUID" + index + ": " + UUID.randomUUID());
        }

        String[] fruits = {"apple", "banana","cherry"};
        for (int index = 0; index < 3; index++) {
            String randomFruit = fruits[random.nextInt(fruits.length)];
            System.out.println(randomFruit);
        }

        List<Integer> nunbers = Arrays.asList(1,2,3,4,5);
        Collections.shuffle(nunbers, random);
        System.out.println("shuffled list: " + nunbers);

    }
}
