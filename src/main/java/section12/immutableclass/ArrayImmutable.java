package section12.immutableclass;

import java.util.ArrayList;
import java.util.List;

public class ArrayImmutable {

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(6);
        System.out.println(list);
    }
}
