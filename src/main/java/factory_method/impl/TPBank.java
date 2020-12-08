package main.java.factory_method.impl;

import main.java.factory_method.Bank;

public class TPBank implements Bank {
    @Override
    public String getBankName() {
        return "This is TPBank";
    }

    @Override
    public String getInterestRate() {
        return "10% per year";
    }
}
