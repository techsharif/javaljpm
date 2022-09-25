package section04.challanges;

public class IntEqualityPrinter {

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid value");
            return;
        }

        if (x == y && y == z) {
            System.out.println("All numbers are equal");
            return;
        }

        if (x != y && x != z && y != z) {
            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");
    }
}
