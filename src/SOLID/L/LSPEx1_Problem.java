package SOLID.L;

public class LSPEx1_Problem {
}
class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

// ❌ LSP Violation: Changing behavior of base class
class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // ⚠ Square forces height = width
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // ⚠ Square forces width = height
    }
}

 class LSP_Violation {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(4);
        rect.setHeight(5);

        // 🚨 Expected area = 4 * 5 = 20
        // ❌ But it returns 25, because Square forces width = height
        System.out.println("Area: " + rect.getArea());
    }
}

