package section12.arraylist;

import section12.interfacemethods.ListInterfaceMethods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInterfaceMethods {


    public static void main(String[] args) {

//        List<Integer> arrayList = new ArrayList<>(pre(new Integers[] {1, 2, 3})); // we can start with previously populated list (collection)
        List<Integer> arrayList = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        ListInterfaceMethods.show(arrayList, strings);



    }
}
