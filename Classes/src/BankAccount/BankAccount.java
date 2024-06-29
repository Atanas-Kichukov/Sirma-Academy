package BankAccount;

public class BankAccount {
    private static int nextId = 1;
    private int id;
    private double balance;
    private double interestRate = 0.02;

    public BankAccount() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public BankAccount setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public double getInterestRate(int years) {
        return interestRate * years * balance;
    }
    public void deposit(double amount){
        this.balance +=amount;
    }

}
