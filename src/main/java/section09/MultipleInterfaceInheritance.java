package section09;

interface Demo {
    void show(); // don't need to think. as we must have to implement this

    default void defaultMethod() { // may be problematic but still we have to implement this as well
        System.out.println("Demo");
    }
}

interface Demo2 {
    void show();

    default void defaultMethod() {
        System.out.println("Demo2");
    }
}

class MyClass1 implements Demo, Demo2 {
    @Override
    public void show() {

    }

    @Override
    public void defaultMethod() {
        System.out.println("MyClass");
    }
}

class MyClass2 implements Demo, Demo2 {
    @Override
    public void show() {

    }

    @Override
    public void defaultMethod() {
        Demo.super.defaultMethod();
    }
}

public class MultipleInterfaceInheritance {
}
