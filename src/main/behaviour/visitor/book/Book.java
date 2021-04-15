package main.behaviour.visitor.book;

import main.behaviour.visitor.Visitor;

public interface Book {
    void accept(Visitor v);
}
