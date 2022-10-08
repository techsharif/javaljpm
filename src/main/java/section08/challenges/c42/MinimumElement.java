package section08.challenges.c42;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) { // doint this as all members are private
        int size = readInteger();
        int[] elements = readElements(size);
        int min = findMin(elements);
        System.out.println(min);

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int size) {
        int[] elements = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return elements;

    }

    private static int findMin(int[] elements) {
        int min = Integer.MAX_VALUE;
        for (int element : elements) {
            min = Math.min(element, min);
        }
        return min;
    }
}
