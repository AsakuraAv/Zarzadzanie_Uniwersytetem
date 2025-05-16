import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private int id;
    private List<Enrollment> enrollments;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
        enrollments = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getId() {
        return id;
    }

    public void addEnrollment(Enrollment enrollment) {
        if (enrollment == null) {
            System.out.println("Enrollement cannot be null.");
            return;
        }

        enrollments.add(enrollment);
        System.out.println("Added enrollment for course " + enrollment.getCourse().getCourseName());
    }

    public void removeEnrollment(Enrollment enrollment) {
        if (enrollment == null) {
            System.out.println("Enrollement cannot be null.");
            return;
        }

        if (enrollments.contains(enrollment)) {
            enrollments.remove(enrollment);
            System.out.println("Removed enrollment for course " + enrollment.getCourse().getCourseName());
        }
        else {
            System.out.println("This student is not enrolled in this course.");
        }
    }

    public void displayCourses() {
        if (enrollments.isEmpty()) {
            System.out.println(studentName + " is not enrolled in any courses.");
            return;
        }

        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.getCourse().getCourseName());
        }
    }

    @Override
    public String toString() {
        return "Student name: " + studentName + ", id: " + id;
    }
}
