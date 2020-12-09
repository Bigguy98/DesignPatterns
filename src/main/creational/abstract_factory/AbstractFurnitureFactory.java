package main.creational.abstract_factory;

import main.creational.abstract_factory.altars.Altar;
import main.creational.abstract_factory.chairs.Chair;
import main.creational.abstract_factory.tables.Table;

public interface AbstractFurnitureFactory {
     Table createTable();
     Chair createChair();
     Altar createAltar();
}
