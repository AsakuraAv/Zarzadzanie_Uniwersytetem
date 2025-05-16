😊 University Management System

Struktura systemu(polish):
  University – reprezentuje uniwersytet (nazwa, lista wydziałów).
  Faculty – reprezentuje wydział (nazwa, lista profesorów i kursów).
  Professor – reprezentuje profesora (imię, lista prowadzonych kursów).
  Student – reprezentuje studenta (imię, numer indeksu, lista zapisanych kursów).
  Course – reprezentuje kurs (nazwa, prowadzący, maksymalna liczba studentów).
  Enrollment – zapis studenta na kurs (student, kurs, ocena końcowa).

Funkcjonalności:
- Dodawanie wydziałów do uniwersytetu
- Dodawanie profesorów i przypisywanie ich do kursów
- Zapisywanie studentów na kursy
- Śledzenie ocen studentów
- Wyświetlanie kursów studenta oraz listy studentów na kursie

✅ Możliwe rozszerzenia:
- Dodanie systemu logowania dla studentów i profesorów.
- Obsługa wielowątkowości w zarządzaniu zapisami na kursy.
- Możliwość zapisu i odczytu danych z pliku lub bazy danych zamiast przechowywania w pamięci.
- Obsługa wyjątków, na przykład w klasie Enrollment metoda addGrade.
- Dodanie listy wyrzuconych studentów.
- Dodanie walidacji id studenta i dodanie id dla professorów + walidacja.

Structura system(english):
  University – Represents a university (name, list of faculties).
  Faculty – Represents a faculty (name, list of professors and courses).
  Professor – Represents a professor (name, list of taught courses).
  Student – Represents a student (name, student ID number, list of enrolled courses).
  Course – Represents a course (name, professor, maximum number of students).
  Enrollment – Represents a student's enrollment in a course (student, course, final grade).

Functionality:
- Adding faculties to the university
- Adding professors and assigning them to courses
- Enrolling students in courses
- Tracking student grades
- Displaying a student's courses and the list of students in a course

✅ Possible Extensions:
- Adding a login system for students and professors.
- Implementing multithreading support for managing course enrollments.
- Enabling data storage and retrieval from files or a database instead of in-memory storage.
- Exception handling, for example, in the Enrollment class, specifically in the addGrade method.
- Adding a list of expelled students.
- Validating student ID's and adding professor ID's along with validation.

