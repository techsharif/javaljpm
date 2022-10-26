package section12.maps;

import section12.interfacemethods.MapInterfaceMethods;

import java.util.HashMap;

public class HashmapClassMethods {

    public static void show(HashMap<String, Integer> hashMap) {

        MapInterfaceMethods.show(hashMap);

        System.out.println("======== HashMap Show " + hashMap.getClass().getSimpleName() + " ======== ");

        // clone
        HashMap<String, Integer> cloned = (HashMap<String, Integer>) hashMap.clone();
        cloned.put("Clone", 1);
        System.out.println(hashMap); // {third=value of third is three, first=value of first is one, second=value of second is two}
        System.out.println(cloned); // {third=value of third is three, first=value of first is one, second=value of second is two, Clone=Yes}


    }

    public static void main(String[] args) {
        show(new HashMap<>());
    }
}
