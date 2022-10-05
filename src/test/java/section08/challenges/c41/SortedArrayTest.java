package section08.challenges.c41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedArrayTest {

    @Test
    public void testRandomArray() {
        int[] unsortedArray = {106, 26, 81, 5, 15};
        int[] sortedArray = SortedArray.sortIntegers(unsortedArray);
        assertArrayEquals(new int[]{106, 81, 26, 15, 5}, sortedArray);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] unsortedArray = {106, 81, 26, 15, 5};
        int[] sortedArray = SortedArray.sortIntegers(unsortedArray);
        assertArrayEquals(new int[]{106, 81, 26, 15, 5}, sortedArray);
    }

    @Test
    public void testReverseSortedArray() {
        int[] unsortedArray = {5, 15, 26, 81, 106};
        int[] sortedArray = SortedArray.sortIntegers(unsortedArray);
        assertArrayEquals(new int[]{106, 81, 26, 15, 5}, sortedArray);
    }

    @Test
    public void testBlankArray() {
        int[] unsortedArray = {};
        int[] sortedArray = SortedArray.sortIntegers(unsortedArray);
        assertArrayEquals(new int[]{}, sortedArray);
    }
}
