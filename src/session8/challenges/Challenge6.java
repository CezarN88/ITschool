package session8.challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge6 {

    //6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that name from the list.

    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();

        studentList.add("Ionut");
        studentList.add("Vasile");
        studentList.add("Catalin");
        studentList.add("Marian");
        studentList.add("Andrei");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student to remove:  ");
        String studentToRemove = scanner.nextLine();

        boolean found = studentList.contains(studentToRemove);
        if (found) {
            studentList.remove(studentToRemove);
            System.out.println(studentToRemove + " has been removed from the list");
        } else {
            System.out.println(studentToRemove + " was not found in the list");
        }
        scanner.close();

        System.out.println("Student List updated: ");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}