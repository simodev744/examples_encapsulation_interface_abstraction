package Interface_Example_payement;

public class Main {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCardPayment();
        PaymentMethod payment2 = new PayPalPayment();
        PaymentMethod payment3 = new BankTransferPayment();

        payment1.processPayment(100.0);
        payment2.processPayment(200.0);
        payment3.processPayment(300.0);
    }
}