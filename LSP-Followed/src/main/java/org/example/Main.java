package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<WithdrawableAccount> withdrawableAccountList = new ArrayList<>();
        List<DepositOnlyAccount> depositOnlyAccountList = new ArrayList<>();

        withdrawableAccountList.add(new CurrentAccount());
        withdrawableAccountList.add(new SavingAccount());

        depositOnlyAccountList.add(new FixedTermAccount());

        BankClient bankClient = new BankClient(withdrawableAccountList, depositOnlyAccountList);
        bankClient.processTransaction();
    }
}