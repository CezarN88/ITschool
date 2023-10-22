package session15.challenges.equals_hashcode;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int studentId;
    private String email;

    public Student(String name, int age, int studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }


    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 1, "alice@gmail.com");
        Student student2 = new Student("Alice", 20, 2, "alice@gmail.com");

        System.out.println("student1 equals student2: " + student1.equals(student2));

        System.out.println("Hashcode of student1: " + student1.hashCode());
        System.out.println("Hashcode of student2: " + student2.hashCode());
    }
}