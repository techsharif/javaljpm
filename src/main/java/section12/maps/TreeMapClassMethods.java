package section12.maps;


import section12.interfacemethods.NavigableMapInterfaceMethods;

import java.util.TreeMap;

public class TreeMapClassMethods {


    public static void show(TreeMap<String, Integer> treeMap) {
        NavigableMapInterfaceMethods.show(treeMap);

    }

    public static void main(String[] args) {
        show(new TreeMap<>());
    }
}
