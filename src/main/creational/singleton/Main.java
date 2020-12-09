package main.creational.singleton;

public class Main {

    public static void main(String[] args) {
        CustomSingleton singleton =  CustomSingleton.getInstance();
        System.out.println(singleton.getName());
    }
}
