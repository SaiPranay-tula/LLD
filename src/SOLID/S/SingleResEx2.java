package SOLID.S;

public class SingleResEx2 {

    class OrderService {
        public void placeOrder(String item, int quantity) {
            System.out.println("Order placed: " + item + " (Quantity: " + quantity + ")");
        }
    }
class EmailService {
    public void sendEmailConfirmation(String email) {
        System.out.println("Sending email confirmation to: " + email);
    }
}
class DbService{
        public void saveOrderToDatabase(String item, int quantity) {
            System.out.println("Saving order to database: " + item + " (Quantity: " + quantity + ")");
        }
    }
}
class OrderService_Problem {
    public void placeOrder(String item, int quantity) {
        System.out.println("Order placed: " + item + " (Quantity: " + quantity + ")");
    }

    public void sendEmailConfirmation(String email) {
        System.out.println("Sending email confirmation to: " + email);
    }

    public void saveOrderToDatabase(String item, int quantity) {
        System.out.println("Saving order to database: " + item + " (Quantity: " + quantity + ")");
    }
}
