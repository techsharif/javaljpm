package section05.challenges;

public class LargestPrime {
    public static int getLargestPrime(int number) {

        int result = -1;

        int div = 2;
        while (number > 1) {
            if (number % div == 0) {
                result = Math.max(number, div);
                number /= div;
            } else {
                div++;
            }
        }

        return result;
    }
}
