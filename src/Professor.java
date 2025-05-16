import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String professorName;
    private List<Course> courseList;

    public Professor(String professorName) {
        this.professorName = professorName;
        courseList = new ArrayList<>();
    }

    public String getProfessorName() {
        return professorName;
    }

    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Course cannot be null.");
            return;
        }

        if (courseList.contains(course)) {
            System.out.println("This professor already teaches this course.");
        }
        else {
            courseList.add(course);
            System.out.println("Course " + course.getCourseName() + " added to professor.");
        }
    }

    public void displayCourseList() {
        if (courseList.isEmpty()) {
            System.out.println(professorName + " is not teaching any courses.");
            return;
        }

        System.out.println("Courses taught by " + professorName + ":");
        for (Course course : courseList) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public void removeCourse(Course course) {
        if (courseList.isEmpty()) {
            System.out.println("No courses to remove.");
            return;
        }

        if (courseList.contains(course)) {
            courseList.remove(course);
            System.out.println("Course " + course.getCourseName() + " removed from professor.");
        }
        else {
            System.out.println("This professor is not have this course.");
        }
    }
}
