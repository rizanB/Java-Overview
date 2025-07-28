package OOP;

public class AbstractExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }

}

abstract class Shape{
    abstract double area(); // this is abstract method
    void hello() {} // this is non-abstract method (CONCRETE METHOD)
}

class Circle extends Shape {
    @Override
    double area() {
        return 1;
    }
}

class Rectangle extends Shape {
    @Override
    double area() {
        return 10;
    }
}

class Triangle extends  Shape {
    @Override
    double area() {
        return 100;
    }
}