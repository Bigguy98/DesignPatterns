package main.behaviour.visitor.book;

import main.behaviour.visitor.Visitor;

public class JavaBook implements DeveloperBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
