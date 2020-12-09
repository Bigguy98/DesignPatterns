package main.creational.abstract_factory;

import main.creational.abstract_factory.altars.Altar;
import main.creational.abstract_factory.chairs.Chair;
import main.creational.abstract_factory.tables.Table;

public class Main {

    public static void main(String[] args) {

        AbstractFurnitureFactory furnitureFactory = FactoryFactory.createFactory(FactoryType.WOOD);

        Table table = furnitureFactory.createTable();
        System.out.println(table.getName());

        Chair chair = furnitureFactory.createChair();
        System.out.println(chair.getName());

        Altar altar = furnitureFactory.createAltar();
        System.out.println(altar.getName());


    }
}
