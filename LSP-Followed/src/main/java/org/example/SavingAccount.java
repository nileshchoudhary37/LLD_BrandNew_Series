package org.example;

public class SavingAccount implements WithdrawableAccount {

    private double balance;

    public SavingAccount(){
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit amount " + amount + " to Saving Account");
        System.out.println("Balance " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount " + amount + " from Saving Account");
            System.out.println("Balance " + balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
