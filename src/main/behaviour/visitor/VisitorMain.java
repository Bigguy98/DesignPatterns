package main.behaviour.visitor;

import main.behaviour.visitor.book.*;

public class VisitorMain {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        Book book1 = new CommicBook();
        book1.accept(visitor);
        Book book2 = new JavaBook();
        book2.accept(visitor);
        Book book3 = new DesignPatternBook();
        book3.accept(visitor);
    }
}
