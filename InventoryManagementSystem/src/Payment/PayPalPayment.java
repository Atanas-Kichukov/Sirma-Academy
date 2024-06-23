package Payment;

import Characteristics.PaymentMethod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;
    private double balance;

    public PayPalPayment(String email, String password, double balance) {
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public PayPalPayment setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public PayPalPayment setPassword(String password) {
        this.password = password;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public PayPalPayment setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public void validateCardDetails() {
        Pattern pattern = Pattern.compile(".*\\d{2,}.+");
        Matcher matcher = pattern.matcher(this.email);
        boolean validateEmail = matcher.find();
        boolean emailIsValid = !this.email.isEmpty() && this.email.length() > 10 && validateEmail;
        boolean passwordIsValid = !this.password.isEmpty() && this.password.length() > 5;
        if (!emailIsValid) {
            System.out.print("Your email is not valid! It shouldn't be empty, with length greater than 10 and at least 2 digits!");
        } else if (passwordIsValid) {
            System.out.print("Your password is not valid! It shouldn't be empty and at least 6 symbols!");
        } else {
            System.out.print("Your card is valid!");
        }


    }

    @Override
    public void processPayment(double amount) {
        if (amount > this.balance){
            System.out.print("You don't have enough money in yor PayPal. Please use another one or a credit card!");
        }else{
            this.balance -= amount;
            System.out.print("Thank you for your purchase! Have a nice day! :)");
        }
    }
}
