package main.creational.abstract_factory;

public class FactoryFactory {
    public static AbstractFurnitureFactory createFactory(FactoryType type) {
        switch (type) {
            case WOOD:
                return new WoodFurnitureFactory();
            default:
                return new PlasticFurnitureFactory();
        }
    }
}
