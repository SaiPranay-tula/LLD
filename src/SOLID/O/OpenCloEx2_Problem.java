package SOLID.O;

public class OpenCloEx2_Problem {
}
class PaymentProcessor {
    public void processPayment(String type) {
        if (type.equals("CreditCard")) {
            System.out.println("Processing credit card payment...");
        } else if (type.equals("PayPal")) {
            System.out.println("Processing PayPal payment...");
        }
    }
}
