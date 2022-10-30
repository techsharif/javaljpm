package section12.interfacemethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceMethods {

    public static void show(Collection<Integer> collection, Collection<String> strings) {
        System.out.println("======== Collection Show " + collection.getClass().getSimpleName() + " ======== ");

        // .add
        collection.add(5);
        collection.add(6);
        collection.add(7);
        System.out.println(collection); // [5, 6, 7]

        // .addAll
        collection.addAll(Arrays.asList(1, 2, 3)); // [5, 6, 7, 1, 2, 3]
        System.out.println(collection);

        // iterator()
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // 5 6 7 1 2 3
        }
        System.out.println();

        strings.addAll(Arrays.asList("one", "two", "three", "one"));
        System.out.println(strings); // [one, two, three, one]
        strings.remove("one");
        System.out.println(strings); // [two, three, one]

        // remove All
        collection.add(50);
        collection.add(50);
        collection.add(50);
        System.out.println(collection); // [5, 6, 7, 1, 2, 3, 50, 50, 50]
        collection.removeAll(Arrays.asList(50, 1, 3));
        System.out.println(collection.contains(50)); // false
        System.out.println(collection.contains(1)); // false
        System.out.println(collection); // [5, 6, 7, 2]

        strings.clear();
        strings.addAll(Arrays.asList("one", "two", "three", "one"));
        System.out.println(strings); // [one, two, three, one]
        strings.removeAll(Arrays.asList("one"));
        System.out.println(strings); // [two, three]


        // retainAll
        System.out.println(collection); // [5, 6, 7, 2]
        collection.retainAll(Arrays.asList(9, 6, 7));
        System.out.println(collection); // [6, 7]

        // hashCode
        System.out.println(collection.hashCode()); // 1154 // may be changes


        // Clear
        System.out.println(collection); // [5, 6, 7, 2]
        collection.clear();
        System.out.println(collection); // []
        System.out.println();


    }

    public static void main(String[] args) {
        show(new ArrayList<>(), new ArrayList<>());
    }
}
