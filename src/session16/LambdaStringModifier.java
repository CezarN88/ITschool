package session16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaStringModifier {

    public static void main(String[] args) {
        Function<String, Integer> stringLenghtFinder = str -> str.length();
        System.out.println("String lenght: " + stringLenghtFinder.apply("Happy Friday"));

        List<String> myList = Arrays.asList("Bob", "Alice", "Tailor");
        //with streams and lambda
        myList.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(System.out::println);

        //without lambda
        for (String name : myList) {
            if (name.startsWith("B")) {
                System.out.println(name);
            }
        }
    }
}
