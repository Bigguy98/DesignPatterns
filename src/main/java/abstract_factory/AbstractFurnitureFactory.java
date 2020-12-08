package main.java.abstract_factory;

import main.java.abstract_factory.altars.Altar;
import main.java.abstract_factory.chairs.Chair;
import main.java.abstract_factory.tables.Table;

public interface AbstractFurnitureFactory {
     Table createTable();
     Chair createChair();
     Altar createAltar();
}
