package main.structural.composite;

public class Folder implements Storage {
    Storage[] childs;

    public Folder(Storage[] childs) {
        this.childs = childs;
    }

    @Override
    public void showProperty() {
        for(Storage storage: childs) {
            storage.showProperty();
        }
    }

    @Override
    public int totalSize() {
        int total = 0;
        for(Storage storage: childs) {
            total += storage.totalSize();
        }
        return total;
    }
}
