package section12.stack;

import section12.interfacemethods.ListInterfaceMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackListInterfaceMethod {


    public static void main(String[] args) {
        List<Integer> arrayList = new Stack<>();
        List<String> strings = new Stack<>();
        strings.addAll(Arrays.asList("one", "two", "three", "one"));

        ListInterfaceMethods.show(arrayList, strings);

    }
}
