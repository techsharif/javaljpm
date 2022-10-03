package section06;

public class Main {
    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod("one");
        StaticMethod staticMethod2 = new StaticMethod("two");

        staticMethod.printName(); // two
        staticMethod2.printName(); // two
    }
}
