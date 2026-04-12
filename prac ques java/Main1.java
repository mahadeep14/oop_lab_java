import student.Results;
import student.Student;

public class Main1 {
    public static void main(String[] args) {

        Student s = new Student("Mahadeep", 18, "CSE");
        s.display();

        Results r = new Results("Mahadeep", 18, "CSE");
        r.grade();
    }
}