package section12.interfacemethods;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceMethods {

    public static void show(Map<String, String> map) {
        System.out.println("======== Map Show " + map.getClass().getSimpleName() + " ======== ");

        // put
        map.put("first", "one"); // {first=one}
        System.out.println(map);

        // putAll
        map.putAll(Map.ofEntries(
                Map.entry("extra1", "Extra one"),
                Map.entry("extra2", "Extra two")
        ));
        System.out.println(map); // {extra2=Extra two, extra1=Extra one, first=one}

        // putIfAbsent(K, V)
        map.putIfAbsent("first", "top"); // it will not add
        map.putIfAbsent("second", "two");
        System.out.println(map); // {extra2=Extra two, extra1=Extra one, first=one, second=two}

        // get(K)
        System.out.println(map.get("first")); // one
        System.out.println(map.get("third")); // null

        // getOrDefault(K, defaultValue)
        System.out.println(map.getOrDefault("first", "No value")); // one
        System.out.println(map.getOrDefault("third", "No value")); // No value


        // containsKey(K)
        System.out.println(map.containsKey("first")); // true
        System.out.println(map.containsKey("third")); // false


        // containsValue(V)
        System.out.println(map.containsValue("one")); // true
        System.out.println(map.containsValue("three")); // false


        // replace(K, V)
        map.put("third", "thre");
        map.replace("third", "three");
        System.out.println(map); // {third=three, extra2=Extra two, extra1=Extra one, first=one, second=two}


        // replace(K, oldValue, newValue)
        map.put("fourth", "for");
        map.replace("fourth", "fo", "four");
        System.out.println(map); // {third=three, extra2=Extra two, extra1=Extra one, fourth=for, first=one, second=two}
        map.replace("fourth", "for", "four");
        System.out.println(map); // {third=three, extra2=Extra two, extra1=Extra one, fourth=four, first=one, second=two}


        // remove(K)
        map.put("fifth", "five");
        map.remove("fifth");
        System.out.println(map); // {third=three, extra2=Extra two, extra1=Extra one, fourth=four, first=one, second=two}


        // remove(K, V)
        map.put("fifth", "five");
        map.remove("fifth", "fiv");
        System.out.println(map); // {third=three, extra2=Extra two, fifth=five, extra1=Extra one, fourth=four, first=one, second=two}

        map.putIfAbsent("fifth", "five");
        map.remove("fifth", "five");
        System.out.println(map); // {third=three, extra2=Extra two, extra1=Extra one, fourth=four, first=one, second=two}


        // keySet()
        System.out.println(map.keySet()); // [third, extra2, extra1, fourth, first, second]


        // values()
        System.out.println(map.values()); // [three, Extra two, Extra one, four, one, two]


        // entrySet()
        System.out.println(map.entrySet()); // [third=three, extra2=Extra two, extra1=Extra one, fourth=four, first=one, second=two]
    }

    public static void main(String[] args) {
        show(new HashMap<>());
    }
}
