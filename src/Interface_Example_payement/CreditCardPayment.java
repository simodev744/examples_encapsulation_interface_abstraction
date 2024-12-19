package Interface_Example_payement;

// Classe représentant un paiement par carte de crédit
class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
