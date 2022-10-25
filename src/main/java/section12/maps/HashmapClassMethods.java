package section12.maps;

import section12.interfacemethods.MapInterfaceMethods;

import java.util.HashMap;

public class HashmapClassMethods {

    public static void show(HashMap<String, String> hashMap) {

        MapInterfaceMethods.show(hashMap);

        System.out.println("======== HashMap Show " + hashMap.getClass().getSimpleName() + " ======== ");

        // clear
        hashMap.clear();
        System.out.println(hashMap); // {}
        hashMap.put("first", "one");
        hashMap.put("second", "two");
        hashMap.put("third", "three");

        System.out.println(hashMap); // {third=three, first=one, second=two}

        hashMap.clear();
        System.out.println(hashMap); // {}


        // compute
        hashMap.put("first", "one");
        System.out.println(hashMap.compute("first", (key, value) -> "value of " + key + " is " + value)); // value of first is one
        System.out.println(hashMap); // {first=value of first is one}

        System.out.println(hashMap.compute("second", (key, value) -> "value of " + key + " is " + value)); // value of second is null
        System.out.println(hashMap); // {first=value of first is one, second=value of second is null}

        // computeIfAbsent()
        hashMap.computeIfAbsent("second", key -> "value of second is two"); // will skip
        hashMap.computeIfAbsent("third", key -> "value of third is three");
        System.out.println(hashMap); // {third=value of third is three, first=value of first is one, second=value of second is null}


        // computeIfPresent()
        hashMap.computeIfPresent("second", (key, value) -> "value of " + key + " is two");
        hashMap.computeIfPresent("forth", (key, value) -> "value of " + key + " is four"); // will skip
        System.out.println(hashMap); // {third=value of third is three, first=value of first is one, second=value of second is two}

        // marge
        HashMap<String, Integer> count = new HashMap<>();
        count.merge("books", 1, Integer::sum);
        count.merge("shirts", 1, Integer::sum);
        count.merge("books", 1, Integer::sum);
        count.merge("pant", 1, Integer::sum);


        System.out.println(count); // {pant=1, books=2, shirts=1}

        // clone
        HashMap<String, String> cloned = (HashMap<String, String>) hashMap.clone();
        cloned.put("Clone", "Yes");
        System.out.println(hashMap); // {third=value of third is three, first=value of first is one, second=value of second is two}
        System.out.println(cloned); // {third=value of third is three, first=value of first is one, second=value of second is two, Clone=Yes}


        // size
        System.out.println(hashMap); // {third=value of third is three, first=value of first is one, second=value of second is two}
        System.out.println(hashMap.size()); // 3
        System.out.println(hashMap.isEmpty()); // false
        hashMap.clear();
        System.out.println(hashMap.isEmpty()); // true


    }

    public static void main(String[] args) {
        show(new HashMap<>());
    }
}
