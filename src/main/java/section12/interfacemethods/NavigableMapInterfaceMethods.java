package section12.interfacemethods;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterfaceMethods {

    public static void show(NavigableMap<String, Integer> navigableMap) {
        SortedMapInterfaceMethods.show(navigableMap);
        navigableMap.clear();

        System.out.println("======== NavigableMap Show " + navigableMap.getClass().getSimpleName() + " ======== ");


        navigableMap.put("Two", 2);
        navigableMap.put("One", 1);
        navigableMap.put("Four", 4);
        navigableMap.put("Three", 3);
        navigableMap.put("Five", 5);
        navigableMap.put("Six", 6);
        navigableMap.put("Seven", 7);
        System.out.println(navigableMap); // {Five=5, Four=4, One=1, Seven=7, Six=6, Three=3, Two=2} // sorted


        // descendingMap
        System.out.println(navigableMap.descendingMap()); // {Two=2, Three=3, Six=6, Seven=7, One=1, Four=4, Five=5}
        System.out.println(navigableMap); // {Five=5, Four=4, One=1, Seven=7, Six=6, Three=3, Two=2}

        // descendingKeySet
        System.out.println(navigableMap.descendingKeySet()); // [Two, Three, Six, Seven, One, Four, Five]

        // ceilingEntry, ceilingKey(), floorEntry(), floorKey(), higherEntry(), higherKey(), lowerEntry(), lowerKey()
        System.out.println(navigableMap.ceilingEntry("One")); // One=1
        System.out.println(navigableMap.ceilingKey("One")); // One
        System.out.println(navigableMap.floorEntry("One")); // One=1
        System.out.println(navigableMap.floorKey("One")); // One
        System.out.println(navigableMap.higherEntry("One")); // Seven=7
        System.out.println(navigableMap.higherKey("One")); // Seven
        System.out.println(navigableMap.lowerEntry("One")); // Four=4
        System.out.println(navigableMap.lowerKey("One")); // Four

        // not in the hash
        System.out.println(navigableMap.ceilingEntry("On")); // One=1
        System.out.println(navigableMap.ceilingKey("On")); // One
        System.out.println(navigableMap.floorEntry("On")); // Four=4
        System.out.println(navigableMap.floorKey("On")); // Four
        System.out.println(navigableMap.higherEntry("On")); // One=1
        System.out.println(navigableMap.higherKey("On")); // One
        System.out.println(navigableMap.lowerEntry("On")); // Four=4
        System.out.println(navigableMap.lowerKey("On")); // Four


        // firstEntry(), lastEntry()
        System.out.println(navigableMap.firstEntry()); // Five=5
        System.out.println(navigableMap.lastEntry()); // Two=2
        System.out.println(navigableMap); // {Five=5, Four=4, One=1, Seven=7, Six=6, Three=3, Two=2}


        // pollFirstEntry, pollLastEntry // return and remove
        System.out.println(navigableMap.pollFirstEntry()); // Five=5
        System.out.println(navigableMap.pollLastEntry()); // Two=2
        System.out.println(navigableMap); // {Four=4, One=1, Seven=7, Six=6, Three=3}


        navigableMap.clear();


    }

    public static void main(String[] args) {
        show(new TreeMap<>());

    }
}
