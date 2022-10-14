package section10.bound;

// basic
class GenericClass1<T> {

    public void print(T item) {
        System.out.println(item);
    }
}

// basic bounded
class GenericClass2<T extends Number> {

    public void print(T number) {
        System.out.println(number.doubleValue() + 5);
        // System.out.println(number + 5); // error -> only methods
        // System.out.println(number + Integer.valueOf(5)); // error
    }
}


public class Main {
    public static void main(String[] args) {
        GenericClass1<Integer> genericClass1 = new GenericClass1<>();
        genericClass1.print(1);

        GenericClass2<Integer> genericClass2 = new GenericClass2<>();
        genericClass2.print(5);

    }
}
