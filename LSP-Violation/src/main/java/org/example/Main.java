package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       List<Account> accounts = new ArrayList<>();

       accounts.add(new SavingAccount());
       accounts.add(new CurrentAccount());
       accounts.add(new FixedTermAccount());

       BankClient bankClient = new BankClient(accounts);
       bankClient.processTransaction(); //Throws exception when withdrawing from FixedTermAccount
    }
}