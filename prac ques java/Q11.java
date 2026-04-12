import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    int radius;

    void area() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = sc.nextInt();  

        double a = 3.14 * radius * radius;  
        System.out.println("Area of Circle: " + a);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class Q11 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle(4, 6);

        for (Shape s : shapes) {
            s.area();   
        }
    }
}