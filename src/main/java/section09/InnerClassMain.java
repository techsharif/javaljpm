package section09;

public class InnerClassMain {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass(10);
        System.out.println(innerClass);

        // InnerClass.FirstInnerClass firstInnerClass = new InnerClass.FirstInnerClass(11); // we can't do this
        // InnerClass.FirstInnerClass firstInnerClass = new InnerClass(12).new FirstInnerClass(11); // we can do this

        InnerClass.FirstInnerClass firstInnerClass = innerClass.new FirstInnerClass(11);
        System.out.println(firstInnerClass);

        // InnerClass.PrivateInnerClass // we can't access this

        innerClass.print();
    }
}
