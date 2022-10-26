package section12.interfacemethods;

import java.util.HashMap;
import java.util.Map;

class ComputeKeyValue {

    public static Integer update(String key, Integer value) {
        Integer newValue = value == null ? 100 : value * -1;
        System.out.println("value of " + key + " is " + value + " new value " + newValue);

        return newValue;
    }

    public static Integer update(String key) {
        return update(key, null);
    }
}

public class MapInterfaceMethods {


    public static void show(Map<String, Integer> map) {
        System.out.println("======== Map Show " + map.getClass().getSimpleName() + " ======== ");

        // put
        map.put("first", 1); // {first=1}
        System.out.println(map);

        // putAll
        map.putAll(Map.ofEntries(
                Map.entry("extra1", 101),
                Map.entry("extra2", 102)
        ));
        System.out.println(map); // {extra2=102, extra1=101, first=1}

        // putIfAbsent(K, V)
        map.putIfAbsent("first", 11); // it will not add
        map.putIfAbsent("second", 2);
        System.out.println(map); // {extra2=102, extra1=101, first=1, second=2}

        // get(K)
        System.out.println(map.get("first")); // 1
        System.out.println(map.get("third")); // null

        // getOrDefault(K, defaultValue)
        System.out.println(map.getOrDefault("first", -1)); // 1
        System.out.println(map.getOrDefault("third", -1)); // -1


        // containsKey(K)
        System.out.println(map.containsKey("first")); // true
        System.out.println(map.containsKey("third")); // false


        // containsValue(V)
        System.out.println(map.containsValue(1)); // true
        System.out.println(map.containsValue(3)); // false


        // replace(K, V)
        map.put("third", 33);
        map.replace("third", 3);
        System.out.println(map); // {third=3, extra2=102, extra1=101, first=1, second=2}


        // replace(K, oldValue, newValue)
        map.put("fourth", 44);
        map.replace("fourth", 444, 4);
        System.out.println(map); // {third=3, extra2=102, extra1=101, fourth=44, first=1, second=2}
        map.replace("fourth", 44, 4);
        System.out.println(map); // {third=3, extra2=102, extra1=101, fourth=4, first=1, second=2}


        // remove(K)
        map.put("fifth", 5);
        map.remove("fifth");
        System.out.println(map); // {third=3, extra2=102, extra1=101, fourth=4, first=1, second=2}


        // remove(K, V)
        map.put("fifth", 5);
        map.remove("fifth", 55);
        System.out.println(map); // {third=3, extra2=102, fifth=5, extra1=101, fourth=4, first=1, second=2}

        map.putIfAbsent("fifth", 5);
        map.remove("fifth", 5);
        System.out.println(map); // {third=3, extra2=102, extra1=101, fourth=4, first=1, second=2}


        // keySet()
        System.out.println(map.keySet()); // [third, extra2, extra1, fourth, first, second]


        // values()
        System.out.println(map.values()); // [3, 102, 101, 4, 1, 2]


        // entrySet()
        System.out.println(map.entrySet()); // [third=3, extra2=102, extra1=101, fourth=4, first=1, second=2]


        // size
        System.out.println(map.size()); // 6

        // isEmpty
        System.out.println(map.isEmpty()); // false


        // clear
        map.clear();
        System.out.println(map.isEmpty()); // true

        // compute
        map.put("first", 1);
        System.out.println(map.compute("first", ComputeKeyValue::update)); // value of first is 1 new value -1 // -1
        System.out.println(map); // {first=-1}

        System.out.println(map.compute("second", ComputeKeyValue::update)); // value of second is null new value 100 // 100
        System.out.println(map); // {first=-1, second=100}

        // computeIfAbsent()
        map.computeIfAbsent("second", key -> 2); // will skip
        map.computeIfAbsent("third", key -> 3);
        System.out.println(map); // {third=3, first=-1, second=100}


        // computeIfPresent()
        map.computeIfPresent("second", ComputeKeyValue::update); // value of second is 100 new value -100
        map.computeIfPresent("forth", ComputeKeyValue::update); // will skip
        System.out.println(map); // {third=3, first=-1, second=-100}

        // marge
        map.clear();
        map.merge("books", 1, Integer::sum);
        map.merge("shirts", 1, Integer::sum);
        map.merge("books", 1, Integer::sum);
        map.merge("pant", 1, Integer::sum);
        System.out.println(map); // {pant=1, books=2, shirts=1}


    }

    public static void main(String[] args) {
        show(new HashMap<>());
    }
}
