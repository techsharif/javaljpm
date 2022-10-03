package section06;

public class StaticMethod {
    public static String name;

    StaticMethod(String name) {
        StaticMethod.name = name;
    }

    void printName() {
        System.out.println(name);
    }
}
