public class Main {
    public static void main(String[] args) {
        University university = new University("Politechnika Gdańsk");

        Faculty faculty1 = new Faculty("Informatyka");
        Faculty faculty2 = new Faculty("Matematyka");

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        Professor professor1 = new Professor("Dr. Adam");
        Professor professor2 = new Professor("Inż. Nataliia");

        faculty1.addProfessor(professor1);
        faculty1.addProfessor(professor2);

        Course course1 = new Course("Python", 50, professor1);
        Course course2 = new Course("Java", 40, professor2);

        faculty1.addCourse(course1);
        faculty1.addCourse(course2);

        Student student1 = new Student("Viktor", 23534);
        Student student2 = new Student("Valeria", 23995);

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student2);

        Enrollment enrollment1 = new Enrollment(student1, course1);
        enrollment1.addGrade(60);
        enrollment1.addGrade(70);
        enrollment1.addGrade(110);
        enrollment1.setFinalGrade();

        Enrollment enrollment2 = new Enrollment(student2, course2);
        enrollment2.addGrade(80);
        enrollment2.addGrade(90);
        enrollment2.setFinalGrade();

        university.displayFacultyList();
        faculty1.displayProfessorList();
        faculty1.displayCourseList();
        course1.displayStudents();
        course2.displayStudents();
    }
}