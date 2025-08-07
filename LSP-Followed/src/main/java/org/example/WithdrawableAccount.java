package org.example;

public interface WithdrawableAccount extends DepositOnlyAccount {
    void withdraw(double amount);
}
