package section05.challenges;

public class SumOddRange {

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < start) return -1;

        int sum = 0;

        for (int i = start; i <= end; ++i) {
            sum += (isOdd(i) ? i : 0);
        }

        return sum;
    }
}
