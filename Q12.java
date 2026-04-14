abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double areaC() {
        return 3.14 * radius * radius;
    }

    void area() {
        System.out.println("Area of Circle: " + areaC());
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    int areaR() {
        return length * breadth;   
    }

    void area() {
        System.out.println("Area of Rectangle: " + areaR());
    }
}

public class Q12 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 8);

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].area();   
        }
    }
}