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

    // System.out.println(cast(4.5, Float.class));
    // it will not work
    public static <E, F> F cast(E item, Class<F> clazz) { // method
        System.out.println(clazz.toString());
        return clazz.cast(item);
    }

    //
    public static <E, F> F customOutput(E item, Class<F> clazz) {
        if (clazz.isInstance(item)) {
            return clazz.cast(item);
        }

        if (clazz == String.class) {
            return clazz.cast(item.getClass().toString());
        }

        return null;
    }

    public static <E, F> void print(E itemE, F itemF) { // method
        System.out.println("itemE " + itemE);
        System.out.println("itemF " + itemF);

        // System.out.println(itemE + itemF); // error
    }

    public static <E extends Number, F extends Number, G extends Number> void print(E itemE, F itemF, G itemG) { // method bounded
        System.out.println("itemE + itemF + itemG " + itemE + itemF + itemG);
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

        Integer aa = 1;
        Integer bb = 2;
        Integer cc = 3;
        print(aa, bb, cc);

        System.out.println(customOutput(1, Integer.class));
        ;
        System.out.println(customOutput(1, Double.class));
        ;
        System.out.println(customOutput(1, String.class));
        ;
    }


}
