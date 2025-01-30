package SOLID.O;

public class OpenCloEx2_Sol {
}
interface PaymentProcessor1 {
     void processPayment(String type);

//type
}

class CreditCardProccesor implements PaymentProcessor1{

    @Override
    public void processPayment(String type) {
        System.out.println("Processing credit card payment...");
    }
}
class PayPalProccesor implements PaymentProcessor1 {
    @Override
    public void processPayment(String type) {
        System.out.println("Processing PayPal payment...");
    }
}
