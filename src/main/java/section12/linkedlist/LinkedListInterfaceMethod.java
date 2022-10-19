package section12.linkedlist;

import java.util.*;

public class LinkedListInterfaceMethod {

    public static List<Integer> pre(Integer[] integers) {
        return new ArrayList<>(Arrays.asList(integers));
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new LinkedList<>();

        // .add
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        System.out.println(arrayList); // [5, 6, 7]

        // .addAll
        arrayList.addAll(pre(new Integer[]{1, 2, 3})); // [5, 6, 7, 1, 2, 3]
        System.out.println(arrayList);

        // get (with index)
        System.out.println(arrayList.get(2)); // 7

        // iterator()
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // 5 6 7 1 2 3
        }
        System.out.println();

        // set()
        arrayList.set(2, 4);
        System.out.println(arrayList.get(2)); // 4 -> previously it was 7


        // size
        System.out.println(arrayList.size()); // 6


        // toArray
        Integer[] integers = new Integer[arrayList.size()];
        arrayList.toArray(integers);
        System.out.println(Arrays.toString(integers)); // [5, 6, 4, 1, 2, 3]


        // contains
        System.out.println(arrayList.contains(100));  // false
        System.out.println(arrayList.contains(5)); // true

        // remove - single remove
        arrayList.set(0, 9);
        arrayList.remove(0);
        System.out.println(arrayList.contains(9)); // false

        arrayList.set(0, 100);
        // arrayList.remove(100); // error
        arrayList.remove(arrayList.get(0));
        System.out.println(arrayList.contains(100)); // false

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("one", "two", "three", "one"));
        System.out.println(strings); // [one, two, three, one]
        strings.remove("one");
        System.out.println(strings); // [one, two, three, one]

        // remove All
        arrayList.add(0, 50);
        arrayList.add(1, 50);
        arrayList.add(2, 50);
        System.out.println(arrayList); // [50, 50, 50, 4, 1, 2, 3]
        arrayList.removeAll(Arrays.asList(50, 1, 3));
        System.out.println(arrayList.contains(50)); // false
        System.out.println(arrayList.contains(1)); // false
        System.out.println(arrayList); // [4, 2]

        strings = new ArrayList<>(Arrays.asList("one", "two", "three", "one"));
        System.out.println(strings); // [one, two, three, one]
        strings.removeAll(Arrays.asList("one"));
        System.out.println(strings); // [two, three]


        // Clear
        System.out.println(arrayList); // [4, 2]
        arrayList.clear();
        System.out.println(arrayList); // []
    }
}
