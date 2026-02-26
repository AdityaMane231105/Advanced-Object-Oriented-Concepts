abstract class Shape {
    double dim1, dim2;

    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area();
}

class Rectangle extends Shape {

    Rectangle(double l, double b) {
        super(l, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {

    Triangle(double b, double h) {
        super(b, h);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 6);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}
