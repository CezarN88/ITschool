package session4.challenge;

import java.util.ArrayList;

public class Challenge10 {

    //10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.

    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        listOne.add(1);
        listOne.add(2);
        listOne.add(3);

        listOne = listTwo;

        System.out.println(listOne);

        listOne.add(4);

        System.out.println(listOne);
        System.out.println(listTwo);
    }
}