package main.creational.builder;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.BankAccountBuilder("thanhtung98", 20, 2000000L)
                .setAddress("Mo Lao, Ha Dong")
                .setEmail("vuthanhtunghayquen98@gmail.com")
                .setNewletter("abz.mgz")
                .setMobileBaking("1588884477")
                .build();
        System.out.println(account);
    }
}
