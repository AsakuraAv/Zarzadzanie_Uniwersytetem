public class Enrollment {
    private int grade;
    private Student student;
    private Course course;
    private double finalGrade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}
