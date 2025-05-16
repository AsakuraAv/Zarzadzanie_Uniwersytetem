import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private double finalGrade;
    private Student student;
    private Course course;
    private List<Double> grades;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.finalGrade = 0.0;
        grades = new ArrayList<Double>();
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void addGrade (double grade) {
        if (grade < 0.0 || grade > 100.0) {
//            throw new IllegalArgumentException("Grade must be between 0.0 and 100.0");
            System.out.println("Grade must be between 0.0 and 100.0.");
            return;
        }
        grades.add(grade);
        System.out.println("Grade " + grade + "added to list.");
    }

    public void setFinalGrade() {
        if (grades.isEmpty()) {
            System.out.println("No grades added to list.");
            return;
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        this.finalGrade = sum / grades.size();
        System.out.println("Final grade for " + student.getStudentName() + ": " + finalGrade);
    }
}
