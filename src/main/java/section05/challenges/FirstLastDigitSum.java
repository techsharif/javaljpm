package section05.challenges;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int firstNumber = number % 10;
        int lastNumber = 0;
        while (number != 0) {
            lastNumber = number % 10;
            number /= 10;
        }

        return firstNumber + lastNumber;
    }
}
