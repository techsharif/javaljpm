package section12.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListClassMethods {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 5, 1, -2, 7));

        // sort
        // arrayList.sort(); // error - need to pass comparator
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList); // [-2, 1, 3, 5, 7]

        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList); // [7, 5, 3, 1, -2]

        arrayList.sort((o1, o2) -> {
            return Math.abs(o1) - Math.abs(o2);
        }); // using comparator lambda
        // arrayList.sort(Comparator.comparingInt(Math::abs)); // same as last line
        System.out.println(arrayList); // [1, -2, 3, 5, 7]

        // copy
        ArrayList<Integer> arrayListCopy = (ArrayList<Integer>) arrayList.clone(); // need to cast
        System.out.println(arrayListCopy); // [1, -2, 3, 5, 7]

        // ensureCapacity
        ArrayList<String> first = new ArrayList<>();
        first.ensureCapacity(1000);

        // isEmpty()
        System.out.println(arrayList.isEmpty()); // false
        System.out.println(first.isEmpty()); // empty


        // indexOf - only first item or -1
        System.out.println(arrayList.indexOf(-2)); // 1
        System.out.println(arrayList.indexOf(-4)); // -1


    }
}
