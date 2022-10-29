package section12.interfacemethods;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterfaceMethods {

    public static void show(SortedMap<String, Integer> sortedMap) {
        MapInterfaceMethods.show(sortedMap);
        sortedMap.clear();

        System.out.println("======== SortedMap Show " + sortedMap.getClass().getSimpleName() + " ======== ");


        sortedMap.put("Two", 2);
        sortedMap.put("One", 1);
        sortedMap.put("Four", 4);
        sortedMap.put("Three", 3);
        sortedMap.put("Five", 5);
        sortedMap.put("Six", 6);
        sortedMap.put("Seven", 7);
        System.out.println(sortedMap); // {Five=5, Four=4, One=1, Seven=7, Six=6, Three=3, Two=2} // sorted

        // firstKey(), lastKey()
        System.out.println(sortedMap.firstKey()); // Five
        System.out.println(sortedMap.lastKey()); // Two


        // headMap(key) , tailMap(key)
        System.out.println(sortedMap.headMap("One")); // {Five=5, Four=4} // less than
        System.out.println(sortedMap.tailMap("Seven")); // {Seven=7, Six=6, Three=3, Two=2} // greater than or equal

        System.out.println(sortedMap.headMap("Ok")); // {Five=5, Four=4}
        System.out.println(sortedMap.tailMap("Sat")); // {Seven=7, Six=6, Three=3, Two=2}

        // subMap(key1, key2)
        System.out.println(sortedMap.subMap("One", "Three")); // {One=1, Seven=7, Six=6} // key1 included key2 excluded
        System.out.println(sortedMap.subMap("Fri", "Sat")); // {One=1}

        sortedMap.clear();


    }

    public static void main(String[] args) {
        show(new TreeMap<>());

    }
}
