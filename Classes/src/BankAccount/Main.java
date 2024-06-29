package BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        List<BankAccount>bankAccounts = new ArrayList<>();
        int id;
        BankAccount bankAccount;
        while(!command[0].equals("End")) {
            switch (command[0]){
                case"Create":
                     bankAccount = new BankAccount();
                    bankAccounts.add(bankAccount);

                    System.out.printf("Account ID%d created%n",bankAccount.getId());
                    break;
                case"Deposit":
                     id = Integer.parseInt(command[1]);
                    int valueToDeposit = Integer.parseInt(command[2]);
                    if(id<0 || id>bankAccounts.size()){
                        System.out.println("Account does not exist");
                    }else {
                        bankAccounts.get(id - 1).deposit(valueToDeposit);
                        System.out.printf("Deposited %d to ID%d %n", valueToDeposit, id);
                    }
                    break;
                case"GetInterest":
                     id = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    if(id<0 || id>bankAccounts.size()){
                        System.out.println("Account does not exist");
                    }else {
                        double interestRate = bankAccounts.get(id - 1).getInterestRate(years);
                        System.out.printf("%.2f",interestRate);
                    }
                    break;

            }



            command = scanner.nextLine().split("\\s+");
        }
    }
}
