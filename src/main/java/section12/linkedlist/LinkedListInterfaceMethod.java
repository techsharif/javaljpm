package section12.linkedlist;

import section12.interfacemethods.ListInterfaceMethods;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInterfaceMethod {


    public static void main(String[] args) {
        List<Integer> arrayList = new LinkedList<>();
        List<String> strings = new LinkedList<>();
        ListInterfaceMethods.show(arrayList, strings);

    }
}
