package Interface_Example_payement;

// Classe représentant un paiement via PayPal
class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
