import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Professor> professorList;
    private List<Course> courseList;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        professorList = new ArrayList<>();
        courseList = new ArrayList<>();
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void addProfessor(Professor professor) {
        if (professor == null) {
            System.out.println("Professor cannot be null.");
            return;
        }

        if (professorList.contains(professor)) {
            System.out.println("Professor is already in this faculty.");
        }
        else {
            professorList.add(professor);
            System.out.println("Professor " + professor.getProfessorName() + " added to the faculty.");
        }
    }

    public void removeProfessor(Professor professor) {
        if (professorList.isEmpty()) {
            System.out.println("Professor not have been added to the faculty.");
            return;
        }
        if (professorList.contains(professor)) {
            professorList.remove(professor);
            System.out.println("Professor removed from the faculty " + professor.getProfessorName());
        }
        else {
            System.out.println("Professor not in the faculty.");
        }
    }

    public void displayProfessorList() {
        if (professorList.isEmpty()) {
            System.out.println("No professors have been added to the faculty.");
            return;
        }

        System.out.println("Professors in faculty " + facultyName + ":");
        for (Professor professor : professorList) {
            System.out.println("- " + professor.getProfessorName());
        }
    }

    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Course cannot be null.");
            return;
        }

        if (courseList.contains(course)) {
            System.out.println("Course is already in this faculty.");
        }
        else {
            courseList.add(course);
            System.out.println("Course " + course.getCourseName() + " added to the faculty.");
        }
    }

    public void removeCourse(Course course) {
        if (courseList.isEmpty()) {
            System.out.println("Course not have been added to the faculty.");
            return;
        }

        if (courseList.contains(course)) {
            courseList.remove(course);
            System.out.println("Course removed from the faculty " + course.getCourseName());
        }
        else {
            System.out.println("Course not in the faculty.");
        }
    }

    public void displayCourseList() {
        if (courseList.isEmpty()) {
            System.out.println("No course have been added to the faculty.");
            return;
        }

        System.out.println("Course in faculty " + facultyName + ":");
        for (Course course : courseList) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
