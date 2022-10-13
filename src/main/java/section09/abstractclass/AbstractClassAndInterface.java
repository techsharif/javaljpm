package section09.abstractclass;

interface A {
    void a();

    void b();

    void c();

    void d();

    default void e() {
        System.out.println("e");
    }
}

abstract class B implements A {

    // we don't need to add all unimplemented method
    // the methods we will not add here are still abstract methods
    public void c() { // just add the c method
        System.out.println("c");
    }
}

class M extends B { // need to implement all unimplemented methods
    public void a() {
        System.out.println("a");
    }

    public void b() {
        System.out.println("b");
    }

    public void d() {
        System.out.println("d");
    }
}

public class AbstractClassAndInterface {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
        a.e();
    }
}
