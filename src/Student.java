import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private int id;
    private List<Course> enrolledCourses;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
        enrolledCourses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getId() {
        return id;
    }

    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Course cannot be null");
            return;
        }

        if (enrolledCourses.contains(course)) {
            System.out.println("This student is already added to the list in this course");
        }
        else {
            enrolledCourses.add(course);
            course.addStudent(this);
            System.out.println("Added course " + course.getCourseName());
        }
    }

    public void removeCourse(Course course) {
        if (course == null) {
            System.out.println("Course cannot be null");
            return;
        }

        if (enrolledCourses.contains(course)) {
            enrolledCourses.remove(course);
            course.removeStudent(this);
            System.out.println("Removed course " + course.getCourseName());
        }
        else {
            System.out.println("This student is not added to the list in this course");
        }
    }

    public void displayCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println("There are no courses in this list.");
            return;
        }

        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }

    @Override
    public String toString() {
        return "Student name: " + studentName + ", id: " + id;
    }
}
