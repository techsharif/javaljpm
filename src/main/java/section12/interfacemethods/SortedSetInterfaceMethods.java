package section12.interfacemethods;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceMethods {

    public static void show(SortedSet<Integer> sortedSet, SortedSet<String> strings) {
        CollectionInterfaceMethods.show(sortedSet, strings);

        System.out.println("======== SortedSet Show " + sortedSet.getClass().getSimpleName() + " ======== ");

        sortedSet.clear();

        sortedSet.add(5);
        sortedSet.add(1);
        sortedSet.add(6);
        sortedSet.add(9);
        sortedSet.add(5);

        System.out.println(sortedSet); // [1, 5, 6, 9]


        // comparator
        System.out.println(sortedSet.comparator()); // null

        // first, last
        System.out.println(sortedSet.first()); // 1
        System.out.println(sortedSet.last()); // 9

        // headSet(element) // excluded
        System.out.println(sortedSet.headSet(5)); // 1
        System.out.println(sortedSet.headSet(4)); // 1

        // tailSet(element) // included
        System.out.println(sortedSet.tailSet(5)); // [5, 6, 9]
        System.out.println(sortedSet.tailSet(4)); // [5, 6, 9]

        // subSet(element1, element2) // element1 included, // element2 excluded
        System.out.println(sortedSet.subSet(5, 6)); // [5]
        System.out.println(sortedSet.subSet(4, 7)); // [5, 6]


    }

    public static void main(String[] args) {
        show(new TreeSet<>(), new TreeSet<>());

    }
}
