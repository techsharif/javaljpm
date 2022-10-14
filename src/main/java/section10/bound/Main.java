package section10.bound;

class GenericClass1<T> {

    public void print(T item) {
        System.out.println(item);
    }
}


public class Main {
    public static void main(String[] args) {
        GenericClass1<Integer> genericClass1 = new GenericClass1<>();
        genericClass1.print(1);


    }
}
