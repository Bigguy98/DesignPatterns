package main.creational.abstract_factory;

import main.creational.abstract_factory.altars.Altar;
import main.creational.abstract_factory.altars.PlasticAltar;
import main.creational.abstract_factory.chairs.Chair;
import main.creational.abstract_factory.chairs.PlasticChair;
import main.creational.abstract_factory.tables.PlasticTable;
import main.creational.abstract_factory.tables.Table;

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
