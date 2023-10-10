package session9.challenges.college_management_system;

public class Course {

    private String courseName;
    private String schedule;
    private int duration;
    private String description;
    private Professor assignedProfessor;

    public Course(String courseName, String schedule, int duration, String description) {

    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getAssignedProfessor() {
        return assignedProfessor;
    }

    public void setAssignedProfessor(Professor assignedProfessor) {
        this.assignedProfessor = assignedProfessor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", schedule='" + schedule + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", assignedProfessor=" + assignedProfessor +
                '}';
    }
}
