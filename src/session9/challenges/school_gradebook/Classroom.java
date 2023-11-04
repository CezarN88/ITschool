package session9.challenges.school_gradebook;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignGrade(int studentId, double grade) {
        for (Student student : students) {
            if (student.getStudentID() == studentId) {
                student.addGrade(grade);
                break;
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void calculateAverageGrades() {
        for (Student student : students) {
            double averageGrade = student.calculateAverageGrade();
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentID() + ", Average Grade: " + averageGrade);
        }
    }
}