package main.java.abstract_factory;

import main.java.abstract_factory.altars.Altar;
import main.java.abstract_factory.altars.PlasticAltar;
import main.java.abstract_factory.chairs.Chair;
import main.java.abstract_factory.chairs.PlasticChair;
import main.java.abstract_factory.tables.PlasticTable;
import main.java.abstract_factory.tables.Table;

public class PlasticFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Table createTable() {
        return new PlasticTable();
    }

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Altar createAltar() {
        return new PlasticAltar();
    }
}
