package section08.challenges.c43;

public class ReverseArray {

    public static void main(String[] args) {
        reverse(new int[]{1, 2, 3, 4, 5, 6});
    }

    private static void reverse(int[] elements) {
        System.out.print("Array = [");
        for (int i = 0; i < elements.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(elements[i]);
        }
        System.out.println("]");
        int size = elements.length;

        for (int i = 0; i < size / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[size - i - 1];
            elements[size - i - 1] = temp;
        }

        System.out.print("Reversed array = [");
        for (int i = 0; i < elements.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(elements[i]);
        }
        System.out.println("]");
    }
}
