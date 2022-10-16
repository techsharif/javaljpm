package section10.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicWildCard {

    public static <T> void print1(List<T> items) {
        for (T item : items) {
            System.out.println(item.getClass().toString() + " " + item);
        }
    }

    public static <T extends Number> void print2(List<T> numbers) {
        for (T number : numbers) {
            System.out.println(number.getClass().toString() + " " + number);
        }
    }

    public static <T extends Number> void print3(List<T> numbers) {
        System.out.println(Arrays.toString(numbers.toArray()));
    }

    public static <T extends List<Number>> void print4(T numbers) {
        System.out.println(Arrays.toString(numbers.toArray()));
    }

    public static <T extends List<?>> void print5(T items) {
        System.out.println(Arrays.toString(items.toArray()));
    }

    public static <T extends List<? extends Number>> void print6(T items) {
        System.out.println(Arrays.toString(items.toArray()));
    }


    public static void main(String[] args) {
        print1(Arrays.asList(1, 2, 1.2, "Hello"));
        // print2(Arrays.asList(1, 2, 1.2, "Hello")); // We can't add it as hello is not a number
        print2(Arrays.asList(1, 2, 1.2));
        print3(Arrays.asList(1, 2, 1.2));

        print4(Arrays.asList(1, 2, 1.2)); // here we are doing the auto cast
        print5(Arrays.asList(1, 2, 1.2, "hello")); // all wildcard
        // print6(Arrays.asList(1, 2, 1.2, "hello")); // error, as hello is not a number
        print6(Arrays.asList(1, 2, 1.2)); // all wildcard


        List<Number> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(13.4);

        System.out.println("Number");
        // print1(numbers);
        print2(numbers);
        print3(numbers);

        print4(numbers);

        print5(numbers);
        print6(numbers);

        List<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(12);
        integers.add(13);

        System.out.println("Integer");
        print2(integers);
        print3(integers);

        // here we can't cast. because we can cast integer to number but not List<Integer> to List<number>
        // print4(integers); // error

        print5(integers); // wild card
        print6(integers); // wild card


        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");

        print1(strings); // basic generic

        // print2(strings); // error, not number
        // print3(strings); // error not number
        // print4(strings); // error not number

        print5(strings); // wild card
        // print6(strings); // error not number


    }
}
