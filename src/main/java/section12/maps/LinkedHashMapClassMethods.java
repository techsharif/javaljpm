package section12.maps;

import java.util.LinkedHashMap;

public class LinkedHashMapClassMethods {

    public static void show(LinkedHashMap<String, Integer> linkedHashMap) {
        HashmapClassMethods.show(linkedHashMap);

    }

    public static void main(String[] args) {
        show(new LinkedHashMap<>());
    }
}
