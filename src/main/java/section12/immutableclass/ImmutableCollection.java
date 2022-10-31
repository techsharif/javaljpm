package section12.immutableclass;

import java.util.*;

public class ImmutableCollection {

    public static void main(String[] args) {
        List<Integer> mutableIntegers = new ArrayList<>();
        mutableIntegers.add(1);
        mutableIntegers.add(2);
        mutableIntegers.add(3);
        mutableIntegers.add(4);
        System.out.println(mutableIntegers);

        Map<String, Integer> mutableMap = new HashMap<>();
        mutableMap.put("One", 1);
        mutableMap.put("Two", 2);
        mutableMap.put("Three", 3);
        System.out.println(mutableMap);


        // before java 9 // unmodifiableXXX
        List<Integer> immutableIntegers = Collections.unmodifiableList(mutableIntegers);
        // immutableIntegers.add(5); // error
        System.out.println(immutableIntegers);

        Map<String, Integer> immutableMap = Collections.unmodifiableMap(mutableMap);
        // immutableMap.put("Four", 4); // error
        System.out.println(immutableMap);


        // from java 9
        List<Integer> immutableIntegers9 = List.of(7, 6, 5, 4);
        // immutableIntegers9.add(9); // error
        System.out.println(immutableIntegers9);


        Map<String, Integer> immutableMap9 = Map.of("One", 1, "Two", 2);
        // immutableMap9.put("Four", 4); // error
        System.out.println(immutableMap9);


    }
}
