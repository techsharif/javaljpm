package section10.wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T extends Number> void print1(List<T> numbers) {
        for (T number : numbers) {
            System.out.println(number);
        }
    }

    public static <T extends Number> void print2(List<T> numbers) {
        System.out.println(Arrays.toString(numbers.toArray()));
    }


    public static void main(String[] args) {
        print1(Arrays.asList(1, 2, 1.2));
        print2(Arrays.asList(1, 2, 1.2));
    }
}
