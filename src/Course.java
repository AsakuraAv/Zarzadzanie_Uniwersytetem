import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private int capacity;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String courseName, int capacity, Professor professor) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.professor = professor;
        enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void addStudent(Student student) {
        if (enrolledStudents == null) {
            System.out.println("Student cannot be null.");
        }

        if (enrolledStudents.size() >= capacity) {
            System.out.println("Course is full.");
        }

        if (enrolledStudents.contains(student)) {
            System.out.println("Student is already add in this course.");
        }
        else {
            enrolledStudents.add(student);
            student.addCourse(this);
            System.out.println("Student "  + student.getStudentName() + "added for course.");
        }
    }

    public void removeStudent(Student student) {
        if (enrolledStudents == null) {
            System.out.println("Student cannot be null.");
            return;
        }

        if (enrolledStudents.contains(student)) {
            enrolledStudents.remove(student);
            student.removeCourse(this);
            System.out.println("Student " + student.getStudentName() + "removed from course.");
        }
        else {
            System.out.println("Student is not add in this course.");
        }
    }

    public void displayStudents() {
        if (enrolledStudents.isEmpty()) {
            System.out.println("There are no student in this course.");
            return;
        }

        for (Student student : enrolledStudents) {
            System.out.println(student.toString());
        }
    }

    public void setProfessor(Professor professor) {
        if (professor == null) {
            System.out.println("Professor cannot be null.");
            return;
        }
        else {
            this.professor = professor;
            System.out.println("Professor " + professor.getProfessorName() + "added for course.");
        }
    }
}
