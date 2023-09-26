package session8.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();

        for (int index = 0; index < 500000; index++) {
            arrayList.add(String.valueOf(index));
            linkList.add(String.valueOf(index));
        }

        // timer for ArrayList
        long startTimerArrayList = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            arrayList.add(0, String.valueOf(index));
        }
        long endTimerArrayList = System.currentTimeMillis();

        // timer for LinkedList
        long startTimerLinkedList = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            linkList.add(0, String.valueOf(index));
        }
        long endTimerLinkedList = System.currentTimeMillis();

        System.out.println("ArrayList time: " + (endTimerArrayList - startTimerArrayList));
        System.out.println("LinkedList: " + (endTimerLinkedList - startTimerLinkedList));
    }
}
