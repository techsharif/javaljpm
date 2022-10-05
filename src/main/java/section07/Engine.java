package section07;

public class Engine extends Parts {

    private int capacity;

    public Engine(String manufacturer, String model, int capacity) {
        super(manufacturer, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

