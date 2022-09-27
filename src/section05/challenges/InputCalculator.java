package section05.challenges;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(sum * 1.0 / count));
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
