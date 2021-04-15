package main.behaviour.visitor.book;

import main.behaviour.visitor.Visitor;

public class CommicBook implements Book {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
