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

// basic bounded with custom class
class GenericClass3<T extends ParentClass> {

    public void print(T item) {
        System.out.println(item.getParentData() + 5);
    }
}

// basic bounded with interface
class GenericClass4<T extends DummyInterface> { // for interface it's extends not implements

    public void print(T item) {
        item.dummy();
    }
}


public class Main {
    public static void main(String[] args) {
        GenericClass1<Integer> genericClass1 = new GenericClass1<>();
        genericClass1.print(1);

        GenericClass2<Integer> genericClass2 = new GenericClass2<>();
        genericClass2.print(5);

        GenericClass3<ParentClass> genericClass3 = new GenericClass3<>();
        genericClass3.print(new ChildClass(1, 2));

        GenericClass4<DummyInterface> genericClass4 = new GenericClass4<>();
        genericClass4.print(new DummyInterfaceImpl());
        genericClass4.print(() -> {
            System.out.println("Custom dummy");
        }); // using lambda

    }
}
