abstract class Modifiers {
    final String country = "India";
    static String planet = "Earth";

    public String name;
    protected int age;
    String city;
    private int salary;

    public void setSalary(int s) {
        salary = s;
    }

    public void showDetails() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("City = " + city);
        System.out.println("Salary = " + salary);
        System.out.println("Country = " + country);
        System.out.println("Planet = " + planet);
    }

    abstract void work();
}

class Student extends Modifiers {
    void work() {
        System.out.println("Student is studying");
    }

    final void message() {
        System.out.println("This is a final method");
    }

    static void info() {
        System.out.println("Static method inside Student class");
    }
}

public class ModifiersDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Mahadeep";
        s.age = 18;
        s.city = "Hyderabad";
        s.setSalary(5000);

        s.showDetails();
        s.work();
        s.message();

        Student.info();
        System.out.println(Modifiers.planet);
    }
}
