import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private int capacity;
    private Professor professor;
    private List<Enrollment> enrollments;

    public Course(String courseName, int capacity, Professor professor) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.professor = professor;
        enrollments = new ArrayList<>();
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

    public void enrollStudent(Student student) {
        if (student == null) {
            System.out.println("Student cannot be null.");
            return;
        }

        if (enrollments.size() >= capacity) {
            System.out.println("Course is full.");
            return;
        }

        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent().equals(student)) {
                System.out.println("Student is already add in this course.");
                return;
            }
        }

        Enrollment enrollment = new Enrollment(student, this);
        enrollments.add(enrollment);
        student.addEnrollment(enrollment);
        System.out.println("Student "  + student.getStudentName() + " enrolled for course " + courseName);
    }

    public void removeEnrollment(Student student) {
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments to remove.");
            return;
        }

        Enrollment toRemove = null;
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent().equals(student)) {
                toRemove = enrollment;
                break;
            }
        }
        if (toRemove != null) {
            enrollments.remove(toRemove);
            student.removeEnrollment(toRemove);
            System.out.println("Student " + student.getStudentName() + " removed from course.");
        }
        else {
            System.out.println("Student is not enrolled in this course.");
        }

//        Simple variant, but I can have problem with multithreading (ArrayList) in future. (проблема з багатопотоківостю ArrayList'a.)
//        for (Enrollment enrollment : enrollments) {
//            if (enrollment.getStudent().equals(student)) {
//                enrollments.remove(enrollment);
//                student.removeEnrollment(enrollment);
//                System.out.println("Student " + student.getStudentName() + " removed enrollment for course.");
//                return;
//            }
//        }
//
//        System.out.println("Student is not enrolled in this course.");
    }

    public void displayStudents() {
        if (enrollments.isEmpty()) {
            System.out.println("No students enrolled in " + courseName + ".");
            return;
        }

        System.out.println("Students enrolled in " + courseName + ":");
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.getStudent().getStudentName());
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
