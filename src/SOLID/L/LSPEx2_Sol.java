package SOLID.L;

public class LSPEx2_Sol {
}
// ✅ Interface for birds that can fly
interface Flyable {
    void fly();
}

// ✅ Base class for all birds
class Bird1 {
    public void eat() {
        System.out.println("Eating...");
    }
}

// ✅ Sparrow can fly, so it implements Flyable
class Sparrow1 extends Bird1 implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

// ✅ Penguin does NOT implement Flyable (LSP-compliant)
class Penguin1 extends Bird {
    public void swim() {
        System.out.println("Penguin is swimming...");
    }
}

// ✅ Test the solution
 class LSP_Correct_Birds {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow1();
        sparrow.fly(); // ✅ "Sparrow is flying..."

        Bird penguin = new Penguin1();
        ((Penguin1) penguin).swim(); // ✅ "Penguin is swimming..."
    }
}
