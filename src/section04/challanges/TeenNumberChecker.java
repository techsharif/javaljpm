package section04.challanges;

public class TeenNumberChecker {

    public static boolean isTeen(int number) {
        return 13 <= number && number <= 19;
    }

    public static boolean hasTeen(int first, int second, int third) {
        return isTeen(first) || isTeen(second) || isTeen(third);
    }
}
