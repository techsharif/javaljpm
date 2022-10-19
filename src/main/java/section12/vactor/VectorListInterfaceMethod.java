package section12.vactor;

import section12.interfacemethods.ListInterfaceMethods;

import java.util.List;
import java.util.Vector;

public class VectorListInterfaceMethod {


    public static void main(String[] args) {
        List<Integer> arrayList = new Vector<>();
        List<String> strings = new Vector<>();
        ListInterfaceMethods.show(arrayList, strings);

    }
}
