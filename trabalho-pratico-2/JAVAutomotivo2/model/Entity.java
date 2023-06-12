package model;

public abstract class Entity {

    private int id;

    public Entity(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public abstract Object[] getData();

}