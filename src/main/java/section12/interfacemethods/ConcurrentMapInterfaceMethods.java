package section12.interfacemethods;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapInterfaceMethods {

    public static void show(ConcurrentMap<String, Integer> concurrentMap) {
        MapInterfaceMethods.show(concurrentMap);


    }

    public static void main(String[] args) {
        show(new ConcurrentHashMap<>());

    }
}
