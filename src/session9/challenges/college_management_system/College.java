package session9.challenges.college_management_system;

import java.util.ArrayList;
import java.util.List;

public class College {

    private List<Student> students;
    private List<Professor> professors;
    private List<Course> courses;

    public College() {
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {

    }

    public void addProfessor(Professor professor) {

    }

    public void addCourse(Course course) {

    }

    public void assignProfessorToCourse(Professor professor, Course course) {

    }

    public String getCourseDetails(String courseName) {
        return courseName;
    }
}