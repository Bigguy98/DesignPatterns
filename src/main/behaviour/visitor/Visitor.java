package main.behaviour.visitor;

import main.behaviour.visitor.book.CommicBook;
import main.behaviour.visitor.book.DesignPatternBook;
import main.behaviour.visitor.book.JavaBook;

public interface Visitor {
    void visit(CommicBook b);
    void visit(JavaBook b);
    void visit(DesignPatternBook b);
}
