package main.creational.factory_method;

import main.creational.factory_method.impl.AgriBank;
import main.creational.factory_method.impl.TPBank;
import main.creational.factory_method.impl.VietcomBank;

public class BankFactory {
    public static Bank createBank(BankType type) {
        switch (type) {
            case AGRIBANK:
                return new AgriBank();
            case TPBANK:
                return new TPBank();
            default:
                return new VietcomBank();
        }
    }
}
