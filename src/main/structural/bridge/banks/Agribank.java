package main.structural.bridge.banks;

import main.structural.bridge.accounts.Account;

public class Agribank extends Bank {
    public Agribank(Account account) {
        super(account);
    }

    @Override
    public void createBank() {
        System.out.println( "Khởi tạo thành công " + account.info()  + " tại Agribank!");
    }
}
