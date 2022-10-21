package section12.linkedlist;

import section12.interfacemethods.DequeInterfaceMethods;
import section12.interfacemethods.ListInterfaceMethods;

import java.util.LinkedList;

public class LinkedListInterfaceMethod {


    public static void main(String[] args) {
        LinkedList<Integer> arrayList = new LinkedList<>();
        LinkedList<String> strings = new LinkedList<>();
        ListInterfaceMethods.show(arrayList, strings);

        arrayList.clear();
        strings.clear();
        DequeInterfaceMethods.show(arrayList, strings);


    }
}
