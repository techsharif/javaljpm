package section12.immutableclass;

final class MyImmutableClass { // final to restrict extend
    private final int x;
    private final int y;

    public MyImmutableClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "MyImmutableClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        MyImmutableClass myImmutableClass = new MyImmutableClass(5, 6);
        System.out.println(myImmutableClass);

        // as there is no setter we can't change the value
    }
}
