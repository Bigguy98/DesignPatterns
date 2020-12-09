package main.creational.factory_method.impl;

import main.creational.factory_method.Bank;

public class AgriBank implements Bank {
    @Override
    public String getBankName() {
        return "This is AgriBank";
    }

    @Override
    public String getInterestRate() {
        return "9% per year";
    }
}
