package section10;

import java.util.ArrayList;
import java.util.List;

public class TypeCheck {

    public static void main(String[] args) {

        List a = new ArrayList();

        a.add(1); // here 1 is an object
        a.add(2);
        a.add(3);
        a.add(5);

        print(a);

    }

    public static void print(List n) {
        for (Object i : n) {
            // System.out.println( (int) i * 2); // correct
            System.out.println((Integer) i * 2); // better
        }
    }
}
