package Payment;

import Characteristics.PaymentMethod;
import Order.ShoppingCart;

import java.time.LocalDate;

public class CreditCard implements PaymentMethod {

    private String cardNumber;
    private String cardHolder;
    private String expireDate;
    private String cvv;
    private double balance;

    public CreditCard(String cardNumber, String cardHolder, String expireDate, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.balance = balance;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public CreditCard setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public CreditCard setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
        return this;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public CreditCard setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    public String getCvv() {
        return cvv;
    }

    public CreditCard setCvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public CreditCard setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public boolean processPayment(double amount, ShoppingCart cart) {
        if (amount > this.balance) {
            System.out.print("You don't have enough money! You should return some products" +
                    " or use a different card!");
            return false;
        } else {
            this.balance -= amount;
            System.out.print("Thank you for your purchase and have a nice day! :)");
            return true;
        }
    }
}
