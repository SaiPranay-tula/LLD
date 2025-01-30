package SOLID.O;

public class OpenCloEx1_Sol {
}
// Step 1: Create an interface for shapes
interface Shape {
    double calculateArea();
}

// Step 2: Implement different shapes
class Circle1 implements Shape {
    private double radius;
    public Circle1(double radius) { this.radius = radius; }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 implements Shape {
    private double length, width;
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Step 3: AreaCalculator now works with any shape without modification!
class AreaCalculator1 {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

// Test the OCP-compliant code
 class Main {
    public static void main(String[] args) {
        Shape circle = new Circle1(5);
        Shape rectangle = new Rectangle1(4, 6);

        AreaCalculator1 calculator = new AreaCalculator1();
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
    }
}
