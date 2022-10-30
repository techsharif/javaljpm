package section12.interfacemethods;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceMethods {

    public static void show(Set<Integer> set, Set<String> strings) {
        CollectionInterfaceMethods.show(set, strings);

        System.out.println("======== Set Show " + set.getClass().getSimpleName() + " ======== ");


    }

    public static void main(String[] args) {
        show(new HashSet<>(), new HashSet<>());

    }
}
