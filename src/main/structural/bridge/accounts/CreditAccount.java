package main.structural.bridge.accounts;

public class CreditAccount implements Account {
    @Override
    public String info() {
        return "tài khoản tín dụng";
    }
}
