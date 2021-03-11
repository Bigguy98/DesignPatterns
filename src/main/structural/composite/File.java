package main.structural.composite;

public class File implements Storage {
    private String property;
    private int size;

    public File(String property, int size) {
        this.property = property;
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println(property + " volume: " + totalSize());
    }

    @Override
    public int totalSize() {
        return size;
    }
}
