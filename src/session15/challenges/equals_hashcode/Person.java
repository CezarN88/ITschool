package session15.challenges.equals_hashcode;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 20, "alice@gmail.com");
        Person person2 = new Person("Alice", 20, "alice22@gmail.com");

        System.out.println("person1 equals person2: " + person1.equals(person2));

        System.out.println("Hashcode of person1: " + person1.hashCode());
        System.out.println("Hashcode of person2: " + person2.hashCode());
    }
}