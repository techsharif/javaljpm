package section12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface {

    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Iterator<Integer> iterator = integers.iterator();

        // hasNext, next
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // remove
        iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();

            if (item == 2) {
                iterator.remove(); // removes the last element returned by the next()
            }

        }
        System.out.println(integers);

        // forEachRemaining
        iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();

            if (item == 4) {
                break;
            }

        }

        iterator.forEachRemaining((item) -> { // lambda usage
            System.out.print(item + " ");
        });
        System.out.println();

    }
}
