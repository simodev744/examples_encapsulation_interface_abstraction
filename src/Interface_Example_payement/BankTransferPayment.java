package Interface_Example_payement;

// Classe représentant un paiement par virement bancaire
class BankTransferPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}
