package org.example;

import java.util.List;

public class BankClient {
    private final List<WithdrawableAccount> withdrawableAccounts;
    private final List<DepositOnlyAccount> depositOnlyAccounts;

    public BankClient(List<WithdrawableAccount> withdrawableAccounts, List<DepositOnlyAccount> depositOnlyAccounts) {
        this.withdrawableAccounts = withdrawableAccounts;
        this.depositOnlyAccounts = depositOnlyAccounts;
    }

    public void processTransaction() {
        for (WithdrawableAccount account : withdrawableAccounts) {
            account.deposit(5300);
            account.withdraw(500);
        }
        for (DepositOnlyAccount account : depositOnlyAccounts) {
            account.deposit(500);
        }
    }

}
