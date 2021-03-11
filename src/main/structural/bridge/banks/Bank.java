package main.structural.bridge.banks;

import main.structural.bridge.accounts.Account;

public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract void createBank();
}
