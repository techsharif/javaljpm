package section12.interfacemethods;

import java.util.*;

public class ListInterfaceMethods {

    public static void show(List<Integer> list, List<String> strings) {

        System.out.println("======== Show " + list.getClass().getSimpleName() + " ======== ");

        // .add
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list); // [5, 6, 7]

        // .addAll
        list.addAll(Arrays.asList(1, 2, 3)); // [5, 6, 7, 1, 2, 3]
        System.out.println(list);

        // get (with index)
        System.out.println(list.get(2)); // 7

        // iterator()
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // 5 6 7 1 2 3
        }
        System.out.println();

        // set()
        list.set(2, 4);
        System.out.println(list.get(2)); // 4 -> previously it was 7


        // size
        System.out.println(list.size()); // 6


        // toArray
        Integer[] integers = new Integer[list.size()];
        list.toArray(integers);
        System.out.println(Arrays.toString(integers)); // [5, 6, 4, 1, 2, 3]


        // contains
        System.out.println(list.contains(100));  // false
        System.out.println(list.contains(5)); // true

        // remove - single remove
        list.set(0, 9);
        list.remove(0);
        System.out.println(list.contains(9)); // false

        list.set(0, 100);
        // list.remove(100); // error
        list.remove(list.get(0));
        System.out.println(list.contains(100)); // false

        strings.addAll(Arrays.asList("one", "two", "three", "one"));
        System.out.println(strings); // [one, two, three, one]
        strings.remove("one");
        System.out.println(strings); // [one, two, three, one]

        // remove All
        list.add(0, 50);
        list.add(1, 50);
        list.add(2, 50);
        System.out.println(list); // [50, 50, 50, 4, 1, 2, 3]
        list.removeAll(Arrays.asList(50, 1, 3));
        System.out.println(list.contains(50)); // false
        System.out.println(list.contains(1)); // false
        System.out.println(list); // [4, 2]

        strings.clear();
        strings.addAll(Arrays.asList("one", "two", "three", "one"));
        System.out.println(strings); // [one, two, three, one]
        strings.removeAll(Arrays.asList("one"));
        System.out.println(strings); // [two, three]


        // Clear
        System.out.println(list); // [4, 2]
        list.clear();
        System.out.println(list); // []
        System.out.println();

    }

    public static void main(String[] args) {
        show(new ArrayList<>(), new ArrayList<>());
        show(new LinkedList<>(), new LinkedList<>());
        show(new Vector<>(), new Vector<>());
        show(new Stack<>(), new Stack<>());
    }
}
