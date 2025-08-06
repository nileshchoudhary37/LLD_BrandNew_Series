package org.example;

import java.util.List;

public class BankClient {
    List<Account> accounts;

    public BankClient(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void processTransaction() {
        for (Account account : accounts) {
            account.deposit(5300); //all accounts allow deposit
            try{
                account.withdraw(500);
            }catch (UnsupportedOperationException e){
                System.out.println("Exception "+e.getMessage());
            }
        }
    }

}
