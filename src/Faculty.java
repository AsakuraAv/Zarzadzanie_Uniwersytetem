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
        if (professorList == null) {
            System.out.println("Professor cannot be null");
            return;
        }

        if (professorList.contains(professor)) {
            System.out.println("Professor is already in this faculty.");
        }
        else {
            professorList.add(professor);
            System.out.println("Professot " + professor.getProfessorName() + " added to the faculty.");
        }
    }

    public void addCourse(Course course) {
        if (courseList == null) {
            System.out.println("Course cannot be null");
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


}
