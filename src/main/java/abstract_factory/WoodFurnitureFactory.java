package main.java.abstract_factory;

import main.java.abstract_factory.altars.Altar;
import main.java.abstract_factory.altars.WoodAltar;
import main.java.abstract_factory.chairs.Chair;
import main.java.abstract_factory.chairs.WoodChair;
import main.java.abstract_factory.tables.Table;
import main.java.abstract_factory.tables.WoodTable;

public class WoodFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Table createTable() {
        return new WoodTable();
    }

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Altar createAltar() {
        return new WoodAltar();
    }
}
