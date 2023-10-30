package session17.challenges.challange5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPerson {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

        List<Person> adults = people.stream()
                .filter(person -> person.age > 18)
                .collect(Collectors.toList());

        adults.forEach(person -> {
            System.out.println("Name: " + person.firstName + " " + person.lastName);
            System.out.println("Age: " + person.age);
        });
    }
}