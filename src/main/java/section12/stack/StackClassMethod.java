package section12.stack;

import java.util.Stack;

public class StackClassMethod {

    public static void main(String[] args) {

        // push
        Stack<Integer> stackIntegers = new Stack<>();

        stackIntegers.push(6); // same as stackIntegers.add(6);
        stackIntegers.push(7);
        stackIntegers.push(8);
        System.out.println(stackIntegers); // [6, 7, 8]


        // pop
        Integer popItem = stackIntegers.pop();
        System.out.println(stackIntegers); // [6, 7]
        System.out.println(popItem); // 8


        // pick
        Integer peekItem = stackIntegers.peek();
        System.out.println(stackIntegers); // [6, 7]
        System.out.println(peekItem); // 7


        // search
        stackIntegers.push(9);
        stackIntegers.push(10);
        stackIntegers.push(11);
        stackIntegers.push(12);
        Integer pos = stackIntegers.search(11);
        System.out.println(stackIntegers); // [6, 7, 9, 10, 11, 12]
        System.out.println(pos); // 2 -> count from last (weird)


        // empty
        System.out.println(stackIntegers.empty()); // false
        stackIntegers.clear();
        System.out.println(stackIntegers.empty()); // true

    }
}
