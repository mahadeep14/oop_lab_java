abstract class Shape {
    abstract void area();
}

class Triangle extends Shape {
    void area() {
        System.out.println("Area of Triangle = 0.5 * b * h");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Area of Square = side * side");
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Shape s1 = new Triangle();
        Shape s2 = new Square();

        s1.area();
        s2.area();
    }
}