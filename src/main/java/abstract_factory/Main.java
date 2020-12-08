package main.java.abstract_factory;

import main.java.abstract_factory.altars.Altar;
import main.java.abstract_factory.chairs.Chair;
import main.java.abstract_factory.tables.Table;

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
