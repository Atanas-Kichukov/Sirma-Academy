package Characteristics;

public interface PaymentMethod {
    void validateCardDetails();
    void processPayment(double amount);
}
