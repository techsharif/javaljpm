# Generic Complete example

<aside>
💡 Main.java

</aside>

```java
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

// basic bounded with interface
class GenericClass5<T extends ParentClass & DummyInterface> { // for interface and class

    // make sure first item is the class (only one class as java doesn't support multiple inheritance)
    // there may be multiple interfaces, as java support multiple interface implements

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

        GenericClass5<ChildClassWithDummyInterface> genericClass5 = new GenericClass5<>();
        // GenericClass5<DummyInterface> genericClass5 = new GenericClass5<>(); // as it's not inherit parent class
        // GenericClass5<ChildClass> genericClass5 = new GenericClass5<>(); // as it's not implemented dummy interface
        genericClass5.print(new ChildClassWithDummyInterface(2));

    }
}
```

<aside>
💡 ParentClass.java

</aside>

```java
public class ParentClass {

    private int parentData;

    public ParentClass(int parentData) {
        this.parentData = parentData;
    }

    public int getParentData() {
        return parentData;
    }

    public void setParentData(int parentData) {
        this.parentData = parentData;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "parentData=" + parentData +
                '}';
    }

}
```

<aside>
💡 ChildClass.java

</aside>

```java
public class ChildClass extends ParentClass {

    private int childData;

    public ChildClass(int parentData, int childData) {
        super(parentData);
        this.childData = childData;
    }

    public int getChildData() {
        return childData;
    }

    public void setChildData(int childData) {
        this.childData = childData;
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "childData=" + childData +
                '}';
    }
}
```

<aside>
💡 DummyInterface.java

</aside>

```java
public interface DummyInterface {

    void dummy();
}
```

<aside>
💡 DummyInterfaceImpl.java

</aside>

```java
public class DummyInterfaceImpl implements DummyInterface {
    @Override
    public void dummy() {
        System.out.println("Dummy");
    }
}
```

<aside>
💡 ChildClassWithDummyInterface.java

</aside>

```java
public class ChildClassWithDummyInterface extends ParentClass implements DummyInterface {
    public ChildClassWithDummyInterface(int parentData) {
        super(parentData);
    }

    @Override
    public void dummy() {
        System.out.println(getParentData());
    }

}
```