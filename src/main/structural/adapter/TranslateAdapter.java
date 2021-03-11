package main.structural.adapter;

public class TranslateAdapter implements VietnameseTarget {

    private JapaneseAdaptee adaptee;

    public TranslateAdapter() {
        this.adaptee = new JapaneseAdaptee();
    }

    @Override
    public void send(String message) {
        System.out.println(adaptee.translate(message));
    }
}
