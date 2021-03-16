package main.structural.flyweight;

public class Soldier implements ISoldier {

    private String type;

    public Soldier(String type) {
        this.type = type;
    }

    @Override
    public void showInfo(Context context) {
        System.out.println("type " + type + " id: " + context.getId() + " level: " + context.getLevel());
    }
}
