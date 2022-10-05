package section08.challenges.c41;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] unsortedInteger) {
        int[] sortedArray = Arrays.copyOf(unsortedInteger, unsortedInteger.length);
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length / 2; ++i) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - i - 1];
            sortedArray[sortedArray.length - i - 1] = temp;
        }
        return sortedArray;
    }

    public static void printArray(int[] sortedInteger) {
        for (int i = 0; i < sortedInteger.length; i++) {
            System.out.println("Element " + i + " contents " + sortedInteger[i]);
        }
    }
}
