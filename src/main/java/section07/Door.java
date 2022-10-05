package section07;

public class Door extends Parts {
    int Size;

    public Door(String manufacturer, String model, int size) {
        super(manufacturer, model);
        Size = size;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

}
