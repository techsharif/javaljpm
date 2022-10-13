package section10;

public class GenericMethod {

    public static <E> void print(E[] array) { // method
        for (E item : array) {
            System.out.println(item);
        }
    }

    public static <E> void print(E item) { // method
        System.out.println("single " + item);
    }

    public static <E, F> void print(E itemE, F itemF) { // method
        System.out.println("itemE " + itemE);
        System.out.println("itemF " + itemF);
    }


    public static void main(String[] args) {
        int a = 1;
        double b = 2;
        String[] c = {"one", "two"};
        float[] d = {1.2f, 1.3f, 1.4f}; // problem -> it will call the single method

        // only reference types, not primitive types (like int, double and char)
        Float[] e = {1.2f, 1.3f, 1.4f}; // it will work fine
        print(a);
        print(a, b);
        print(c);
        print(d);
        print(e);
    }

}