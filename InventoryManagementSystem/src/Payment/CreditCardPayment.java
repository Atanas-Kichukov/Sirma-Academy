package Payment;

import Characteristics.PaymentMethod;

import java.time.LocalDate;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;
    private String cardHolder;
    private String expireDate;
    private String cvv;
    private double balance;

    public CreditCardPayment(String cardNumber, String cardHolder, String expireDate, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public CreditCardPayment setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public CreditCardPayment setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
        return this;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public CreditCardPayment setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    public String getCvv() {
        return cvv;
    }

    public CreditCardPayment setCvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public CreditCardPayment setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public void validateCardDetails() {
        LocalDate expireDate = LocalDate.parse(this.expireDate);
        boolean isExpired = expireDate.isAfter(LocalDate.now());
        boolean cardNumberIsValid = !this.cardNumber.isEmpty() && this.cardNumber.length() <= 16;
        boolean cardHolderIsValid = !this.cardHolder.isEmpty();
        boolean cvv = !this.cvv.isEmpty() && this.cvv.length() <= 3;
        if (!isExpired) {
            System.out.print("Your card has expired. Use another card or another payment method!");

        } else if (!cardHolderIsValid) {
            System.out.print("You haven't entered information for the card holder!");

        } else if (!cardNumberIsValid) {
            System.out.print("You have entered wrong numbers for the card! Try again");

        } else if (!cvv) {
            System.out.print("The cvv is wrong! Fill it again.");

        } else {
            System.out.print("All information for the card is validated! You can pay your order.");
        }
    }

    @Override
    public void processPayment(double amount) {
        if (amount > this.balance) {
            System.out.print("You don't have enough money! You should return some products" +
                    " or use a different card!");
        } else {
            this.balance -= amount;
            System.out.print("Thank you for your purchase and have a nice day! :)");
        }
    }
}
