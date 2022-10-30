package section12.interfacemethods;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterfaceMethods {

    public static void show(NavigableSet<Integer> navigableSet, NavigableSet<String> strings) {
        SortedSetInterfaceMethods.show(navigableSet, strings);

        System.out.println("======== NavigableSet Show " + navigableSet.getClass().getSimpleName() + " ======== ");

        navigableSet.clear();

        navigableSet.add(5);
        navigableSet.add(1);
        navigableSet.add(6);
        navigableSet.add(9);
        navigableSet.add(5);

        System.out.println(navigableSet); // [1, 5, 6, 9]


        // headSet(element) // excluded by default - false
        System.out.println(navigableSet.headSet(5, true)); // [1, 5]
        System.out.println(navigableSet.headSet(5, false)); // 1
        System.out.println(navigableSet.headSet(4)); // 1

        // tailSet(element) // included by default - true
        System.out.println(navigableSet.tailSet(5, true)); // [5, 6, 9]
        System.out.println(navigableSet.tailSet(5, false)); // [6, 9]
        System.out.println(navigableSet.tailSet(4)); // [5, 6, 9]

        // subSet(element1, element2) // element1 included, // element2 excluded -> by default true, false
        System.out.println(navigableSet.subSet(5, 6)); // [5]
        System.out.println(navigableSet.subSet(5, true, 6, true)); // [5, 6]
        System.out.println(navigableSet.subSet(4, 7)); // [5, 6]

        // descendingSet()
        System.out.println(navigableSet.descendingSet());

        // descendingIterator()
        Iterator<Integer> iterator = navigableSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*
        9
        6
        5
        1
         */
        System.out.println();

        // ceiling()
        System.out.println(navigableSet.ceiling(5)); // 5
        System.out.println(navigableSet.ceiling(4)); // 5

        // floor()
        System.out.println(navigableSet.floor(5)); // 5
        System.out.println(navigableSet.floor(4)); // 1

        // higher()
        System.out.println(navigableSet.higher(5)); // 6
        System.out.println(navigableSet.higher(4)); // 5

        // lower()
        System.out.println(navigableSet.lower(5)); // 1
        System.out.println(navigableSet.lower(4)); // 1


        // pollFirst(), pollLast()
        System.out.println(navigableSet); // [1, 5, 6, 9]
        System.out.println(navigableSet.pollFirst()); // 1
        System.out.println(navigableSet.pollLast()); // 9
        System.out.println(navigableSet); // [5, 6]


    }

    public static void main(String[] args) {
        show(new TreeSet<>(), new TreeSet<>());

    }
}
