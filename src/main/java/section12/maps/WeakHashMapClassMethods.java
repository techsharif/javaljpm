package section12.maps;

import section12.interfacemethods.MapInterfaceMethods;

import java.util.WeakHashMap;

public class WeakHashMapClassMethods {

    public static void show(WeakHashMap<String, Integer> weakHashMap) {
        MapInterfaceMethods.show(weakHashMap);

    }

    public static void main(String[] args) {
        show(new WeakHashMap<>());
    }
}
