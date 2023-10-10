package session9.challenges.school_gradebook;

public class GradeBook {

    public static void main(String[] args) {
        Classroom mathClass = new Classroom();
        Student student1 = new Student(1,"Alice");
        Student student2 = new Student(2,"Victor");

        mathClass.addStudent(student1);
        mathClass.addStudent(student2);

        mathClass.assignGrade(1,8.5);
        mathClass.assignGrade(2,9.5);

        mathClass.calculateAverageGrades();

    }
}
