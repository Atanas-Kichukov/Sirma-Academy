package Payment;

import Characteristics.PaymentMethod;
import Order.ShoppingCart;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PayPal implements PaymentMethod {
    private String email;
    private String password;
    private double balance;

    public PayPal(String email, String password, double balance) {
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public PayPal setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public PayPal setPassword(String password) {
        this.password = password;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public PayPal setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public boolean processPayment(double amount, ShoppingCart cart) {
        if (amount > this.balance){
            System.out.print("You don't have enough money in yor PayPal. Please use another one or a credit card!");
            return false;
        }else{
            this.balance -= amount;
            System.out.print("Thank you for your purchase! Have a nice day! :)");
            return true;
        }
    }
}
