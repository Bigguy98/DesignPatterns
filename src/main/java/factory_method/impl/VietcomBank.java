package main.java.factory_method.impl;

import main.java.factory_method.Bank;

public class VietcomBank implements Bank {
    @Override
    public String getBankName() {
        return "This is VietcomBank";
    }

    @Override
    public String getInterestRate() {
        return "8% per year";
    }
}
