package SOLID.S;

import java.util.ArrayList;
import java.util.List;

public class SingleResEx6 {
}
class ShoppingCart {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void calculateTotalPrice() {
        System.out.println("Calculating total price...");
    }

    public void printReceipt() {
        System.out.println("Printing receipt...");
    }

    public void processPayment() {
        System.out.println("Processing payment...");
    }
}

