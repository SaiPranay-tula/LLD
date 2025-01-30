package SOLID.L;

public class LSPEx2_Problem {
}
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Sparrow extends Bird {
    // 🟢 Sparrow can fly
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}

 class BirdTest {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.fly();
    }
}
