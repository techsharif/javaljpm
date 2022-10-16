package section10.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvanceWildCard {

    /***
     *
     * error on items.add(newItem);
     * as unbound wildcard not supported adding
     * if items is an integer list and listItem is an integer than it will create a problem
     * as java don't allow type related error on runtime, we have to confirm jave that there is no possibility of type mismatch
     *
     public static <T extends List<?>, S> void printAndAdd1(T items, S newItem) {
     items.add(newItem);
     System.out.println(Arrays.toString(items.toArray()));
     }
     */


    /***
     *
     * this is upper bounded wildcard
     * as upper bounded wildcard wildcard not supported writing
     * if items is an Double list and listItem is an integer than it will create a problem
     * as java don't allow type related error on runtime, we have to confirm jave that there is no possibility of type mismatch
     *

     public static <T extends List<? extends Number>, S extends Number> void printAndAdd2(T items, S newItem) {
     items.add(newItem);
     System.out.println(Arrays.toString(items.toArray()));
     }

     */

    /***
     *
     * this is upper bounded wildcard
     * as upper bounded wildcard wildcard not supported writing
     * if items is an Double list and listItem is an integer than it will create a problem
     * as java don't allow type related error on runtime, we have to confirm jave that there is no possibility of type mismatch
     *
     *
     * */

    public static <T extends List<? super Number>, S extends Number> void printAndAdd3(T items, S newItem) {
        items.add(newItem);
        System.out.println(Arrays.toString(items.toArray()));
    }

    public static <T extends List<? super Integer>, S extends Integer> void printAndAdd4(T items, S newItem) {
        items.add(newItem);
        System.out.println(Arrays.toString(items.toArray()));
    }


    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3.5);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        printAndAdd3(numbers, 1);
        printAndAdd4(numbers, 1); // we can use number as number is upper than integer

        // printAndAdd3(integers, 1); // we can't use integer as integer is lower than number
        printAndAdd4(integers, 1);
    }
}
