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

interface AA extends A {
    void f();
}

abstract class B {

    abstract void g();
}

abstract class BB extends B implements AA {

    private char ii = 'i';

    abstract void h();

    // we don't need to add all unimplemented method
    // the methods we will not add here are still abstract methods
    public void c() { // just add the c method
        System.out.println("c");
    }

    public void i() {
        System.out.println(ii);
    }
}

class M extends BB { // need to implement all unimplemented methods
    public void a() {
        System.out.println("a");
    }

    public void b() {
        System.out.println("b");
    }

    public void d() {
        System.out.println("d");
    }

    public void f() {
        System.out.println("f");
    }

    public void g() {
        System.out.println("g");
    }

    public void h() {
        System.out.println("h");
    }


}

public class AbstractClassAndInterface {
    public static void main(String[] args) {
        AA a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
        a.e();
        a.f();
        // a.g(); // error
        // a.h(); // error
        // a.i()/ // error

        M m = new M();
        m.a();
        m.b();
        m.c();
        m.d();
        m.e();
        m.f();
        m.g();
        m.h();
        m.i();
    }
}
