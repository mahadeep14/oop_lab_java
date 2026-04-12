package results;

import student.Student;
import java.util.Scanner;

public class Results extends Student {

    public Results(String name, int age, String course) {
        super(name, age, course);
    }

    public void grade() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int num = sc.nextInt();

        if (num > 90 && num <= 100) {
            System.out.println("A++");
        } else if (num > 85 && num <= 90) {
            System.out.println("A+");
        } else if (num > 80 && num <= 85) {
            System.out.println("A");
        } else if (num > 70 && num <= 80) {
            System.out.println("B");
        } else if (num > 60 && num <= 70) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Results r = new Results("Mahadeep", 20, "CSE");

        r.display();
        r.grade();
    }
}