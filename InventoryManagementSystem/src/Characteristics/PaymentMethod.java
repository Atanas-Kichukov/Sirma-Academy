package Characteristics;

import Order.ShoppingCart;

public interface PaymentMethod {
    boolean processPayment(double amount, ShoppingCart cart);
}
