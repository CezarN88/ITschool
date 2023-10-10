package session8.challenges;

import java.util.ArrayList;

public class Challenge3 {

    /*3. Create :
    2 empty ArrayLists: studentList and graduateStudentList
    populate studentList with 10 students
    copy values from studentList to graduateStudentList
    iterate through graduateStudentList and print each graduated student*/

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        studentList.add("Ionut");
        studentList.add("Vasile");
        studentList.add("George");
        studentList.add("Marius");
        studentList.add("Marian");
        studentList.add("Ioana");
        studentList.add("Vasilica");
        studentList.add("Georgeta");
        studentList.add("Mariana");
        studentList.add("Marina");


        graduateStudentList.addAll(studentList);
        System.out.println("Graduate Student List:");
        for (String graduateStudent : graduateStudentList) {
            System.out.println(graduateStudent);
        }
    }
}