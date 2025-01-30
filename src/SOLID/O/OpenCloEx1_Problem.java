package SOLID.O;

public class OpenCloEx1_Problem {
}
class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.width;
        }
        return 0;
    }
}

class Circle {
    double radius;
    public Circle(double radius) { this.radius = radius; }
}

class Rectangle {
    double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

