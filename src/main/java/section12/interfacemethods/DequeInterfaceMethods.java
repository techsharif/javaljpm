package section12.interfacemethods;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceMethods {

    public static void show(Deque<Integer> deque, Deque<String> strings) {
        QueueInterfaceMethods.show(deque, strings);

        System.out.println("======== Deque Show " + deque.getClass().getSimpleName() + " ======== ");

        // all methods have first and last


        // add -> addFirst, addLast
        try {
            deque.addFirst(5);
            deque.addLast(6);
            deque.addFirst(7);
            deque.addLast(8);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        System.out.println(deque); // [7, 5, 6, 8]
        deque.clear();

        // offer -> offerFirst, offerLast
        Boolean isAdded = deque.offerFirst(5);
        System.out.println(isAdded); // true
        isAdded = deque.offerLast(6);
        System.out.println(isAdded); // true
        isAdded = deque.offerFirst(7);
        System.out.println(isAdded); // true
        isAdded = deque.offerLast(8);
        System.out.println(isAdded); // true

        System.out.println(deque); // [7, 5, 6, 8]
        deque.clear();


        // get -> getFirst, getLast
        try {
            System.out.println(deque.getFirst());
        } catch (Exception e) {
            System.out.println(e.getClass()); // class java.util.NoSuchElementException
        }

        try {
            System.out.println(deque.getLast());
        } catch (Exception e) {
            System.out.println(e.getClass()); // class java.util.NoSuchElementException
        }

        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);
        deque.addFirst(8);
        System.out.println(deque); // [8, 7, 6, 5]

        try {
            System.out.println(deque.getFirst()); // 8
            System.out.println(deque.getLast()); // 5
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        deque.clear();


        // get -> getFirst, getLast
        try {
            System.out.println(deque.getFirst());
        } catch (Exception e) {
            System.out.println(e.getClass()); // class java.util.NoSuchElementException
        }

        try {
            System.out.println(deque.getLast());
        } catch (Exception e) {
            System.out.println(e.getClass()); // class java.util.NoSuchElementException
        }

        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);
        deque.addFirst(8);
        System.out.println(deque); // [8, 7, 6, 5]

        try {
            System.out.println(deque.getFirst()); // 8
            System.out.println(deque.getLast()); // 5
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        System.out.println(deque.size()); // 4
        deque.clear();


        // peek -> peekFirst, peekLast
        System.out.println(deque.peekFirst());  // null
        System.out.println(deque.peekLast()); // null

        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);
        deque.addFirst(8);

        System.out.println(deque); // [8, 7, 6, 5]
        System.out.println(deque.peekFirst()); // 8
        System.out.println(deque.peekLast()); // 8
        System.out.println(deque.size()); // 4
        deque.clear();


        // remove -> removeFirst, removeLast
        try {
            System.out.println(deque.removeFirst());
            System.out.println(deque.removeLast());
        } catch (Exception e) {
            System.out.println(e.getClass()); // class java.util.NoSuchElementException
        }

        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);
        deque.addFirst(8);
        try {
            System.out.println(deque.removeFirst()); // 8
            System.out.println(deque.removeLast()); // 5
        } catch (Exception e) {
            System.out.println(e.getClass().toString() + " " + e.getClass());
        }
        System.out.println(deque.size()); // 2
        deque.clear();


        // poll -> pollFirst, pollLast
        System.out.println(deque.pollFirst()); // null
        System.out.println(deque.pollLast()); // null

        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);
        deque.addFirst(8);

        System.out.println(deque.pollFirst()); // 8
        System.out.println(deque.pollLast()); // 5
        System.out.println(deque.size()); // 2
        deque.clear();


    }

    public static void main(String[] args) {
        show(new ArrayDeque<>(), new ArrayDeque<>());
    }
}
