package main.behaviour.visitor.book;

import main.behaviour.visitor.Visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(CommicBook b) {
        System.out.println("Buying commic book!");
    }

    @Override
    public void visit(JavaBook b) {
        System.out.println("Buying java book!");
    }

    @Override
    public void visit(DesignPatternBook b) {
        System.out.println("Buying design pattern book!");
    }
}
