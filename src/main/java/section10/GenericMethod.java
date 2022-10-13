package section10;

public class GenericMethod {

    public static <E> void print(E[] array) { // method
        for (E item : array) {
            System.out.println(item);
        }
    }

    public static <E> void print(E item) { // method
        System.out.println(item);
    }

    public static <E, F> void print(E itemE, F itemF) { // method
        System.out.println("itemE " + itemE);
        System.out.println("itemF " + itemF);
    }

    public static void main(String[] args) {
        int a = 1;
        double b = 2;
        String[] c = {"one", "two"};
        print(a);
        print(a, b);
        print(c);
    }


}
