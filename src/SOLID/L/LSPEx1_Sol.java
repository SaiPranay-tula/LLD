package SOLID.L;

public class LSPEx1_Sol {
}
// ✅ Create a common interface instead of forcing inheritance
interface Shape {
    int getArea();
}

// ✅ Rectangle class
class Rectangle1 implements Shape {
    protected int width;
    protected int height;

    public Rectangle1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

// ✅ Square class
class Square1 implements Shape {
    private int side;

    public Square1(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

 class LSP_Correct {
    public static void main(String[] args) {
        Shape rect = new Rectangle1(4, 5);
        System.out.println("Rectangle Area: " + rect.getArea()); // ✅ 4 * 5 = 20

        Shape square = new Square1(4);
        System.out.println("Square Area: " + square.getArea()); // ✅ 4 * 4 = 16
    }
}
