import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;
    private List<Faculty> facultyList;

    public University(String universityName) {
        this.universityName = universityName;
        facultyList = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void addFaculty(Faculty faculty) {
        if (faculty == null) {
            System.out.println("Faculty cannot be null.");
            return;
        }

        if (facultyList.contains(faculty)) {
            System.out.println("This faculty is already added in this University.");
        }
        else {
            facultyList.add(faculty);
            System.out.println("Added faculty: " + faculty.getFacultyName());
        }
    }

    public void removeFaculty(Faculty faculty) {
        if (facultyList.isEmpty()) {
            System.out.println("Faculty list is empty.");
            return;
        }

        if (!facultyList.contains(faculty)) {
            System.out.println("This faculty is not in this University.");
        }
        else {
            facultyList.remove(faculty);
            System.out.println("Removed faculty: " + faculty.getFacultyName());
        }
    }

    public void displayFacultyList() {
        if (facultyList.isEmpty()) {
            System.out.println("Faculty list is empty.");
            return;
        }

        System.out.println("Faculty in university " + universityName + ": ");
        for (Faculty faculty : facultyList) {
            System.out.println("- " + faculty.getFacultyName());
        }
    }
}
