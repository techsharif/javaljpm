package section12.interfacemethods;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterfaceMethods {

    public static void show(Queue<Integer> queue, Queue<String> strings) {
        CollectionInterfaceMethods.show(queue, strings);

        System.out.println("======== Queue Show " + queue.getClass().getSimpleName() + " ======== ");

        // add
        try {
            Boolean isAdded = queue.add(5);
            System.out.println(isAdded); // true
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        queue.clear();

        // offer
        Boolean isAdded = queue.offer(6);
        System.out.println(isAdded); // true
        System.out.println(queue); // 6
        queue.clear();


        // element
        try {
            Integer element = queue.element();
            System.out.println(element);
        } catch (Exception e) {
            System.out.println(e.getClass().toString() + " " + e.getMessage()); // class java.util.NoSuchElementException null
        }

        queue.add(5);
        try {
            Integer element = queue.element();
            System.out.println(element); // 5
        } catch (Exception e) {
            System.out.println(e.getClass().toString() + " " + e.getMessage());
        }
        System.out.println(queue.size()); // 1
        queue.clear();


        // peek
        Integer element = queue.peek();
        System.out.println(element); // null
        queue.add(5);
        element = queue.peek();
        System.out.println(element); // 5
        System.out.println(queue.size()); // 1
        queue.clear();


        // element
        try {
            element = queue.remove();
            System.out.println(element);
        } catch (Exception e) {
            System.out.println(e.getClass().toString() + " " + e.getMessage()); // class java.util.NoSuchElementException null
        }

        queue.add(5);
        try {
            element = queue.remove();
            System.out.println(element); // 5
        } catch (Exception e) {
            System.out.println(e.getClass().toString() + " " + e.getMessage());
        }
        System.out.println(queue.size()); // 0
        queue.clear();


        // poll
        element = queue.poll();
        System.out.println(element); // null
        queue.add(5);
        element = queue.poll();
        System.out.println(element); // 5
        System.out.println(queue.size()); // 0
        queue.clear();


    }

    public static void main(String[] args) {
        show(new ArrayDeque<>(), new ArrayDeque<>());

    }
}
