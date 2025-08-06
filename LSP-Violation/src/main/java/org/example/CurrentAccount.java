package org.example;

public class CurrentAccount implements Account{

    private double balance;

    public CurrentAccount() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit amount " + amount + " to Current Account");
        System.out.println("Balance " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount " + amount + " from Current Account");
            System.out.println("Balance " + balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
