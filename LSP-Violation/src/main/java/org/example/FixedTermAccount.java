package org.example;

public class FixedTermAccount implements Account{

    private double balance;

    public FixedTermAccount() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit amount " + amount + " to your FixedTerm Account");
        System.out.println("Balance " + balance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawal not allowed in FixedTerm Account.");
    }
}
