package section10;

class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class GenericClass {

    public static void main(String[] args) {

        // Box<int> box = new Box<int>(); // error -> can't use primitive type data like int, double
        Box<Integer> box = new Box<>(2);
    }
}
