package section12.stack;

import section12.interfacemethods.ListInterfaceMethods;

import java.util.List;
import java.util.Stack;

public class StackListInterfaceMethod {


    public static void main(String[] args) {
        List<Integer> arrayList = new Stack<>();
        List<String> strings = new Stack<>();

        ListInterfaceMethods.show(arrayList, strings);

    }
}
