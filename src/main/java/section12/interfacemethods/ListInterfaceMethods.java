package section12.interfacemethods;

import java.util.*;

public class ListInterfaceMethods {

    public static void show(List<Integer> list, List<String> strings) {

        CollectionInterfaceMethods.show(list, strings);

        System.out.println("======== List Show " + list.getClass().getSimpleName() + " ======== ");

        // .add
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1, 9);
        System.out.println(list); // [5, 9, 6, 7]


        // get (with index)
        System.out.println(list.get(2)); // 6


        // set()
        list.set(2, 4);
        System.out.println(list.get(2)); // 4 -> previously it was 7


        // size
        System.out.println(list.size()); // 4


        // toArray
        Integer[] integers = new Integer[list.size()];
        list.toArray(integers);
        System.out.println(Arrays.toString(integers)); // [5, 9, 4, 7]


        // contains
        System.out.println(list.contains(100));  // false
        System.out.println(list.contains(5)); // true

        // remove - single remove
        list.set(0, 11);
        list.remove(0);
        System.out.println(list.contains(11)); // false


        list.set(0, 100);
        // list.remove(100); // error
        list.remove(list.get(0));
        System.out.println(list.contains(100)); // false


        list.add(8);
        list.add(9);
        list.add(10);
        list.add(4);
        list.add(12);

        System.out.println(list); // [4, 7, 8, 9, 10, 4, 12]
        System.out.println(list.indexOf(4)); // 0
        System.out.println(list.lastIndexOf(4)); // 5
        System.out.println(list.indexOf(40)); // -1


    }

    public static void main(String[] args) {
        show(new ArrayList<>(), new ArrayList<>());
        show(new LinkedList<>(), new LinkedList<>());
        show(new Vector<>(), new Vector<>());
        show(new Stack<>(), new Stack<>());
    }
}
