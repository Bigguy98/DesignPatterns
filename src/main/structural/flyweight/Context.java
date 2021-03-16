package main.structural.flyweight;


public class Context {
    private Integer id;
    private Integer level;

    public Context(Integer id, Integer level) {
        this.id = id;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public Integer getLevel() {
        return level;
    }
}
