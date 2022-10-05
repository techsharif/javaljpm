package section07;

public class Car extends Vehicle { // is a relationship

    private int doors;
    private Door door;
    private Engine engine; // has a relationship

    public Car(String name, int doors, Door door, Engine engine) {
        super(name);
        this.doors = doors;
        this.door = door;
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
