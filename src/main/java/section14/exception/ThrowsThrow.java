package section14.exception;

import java.util.Scanner;

class CustomException extends Exception {

}

public class ThrowsThrow {

    public static void checkThrows(int n) throws ArithmeticException, CustomException {
        if (n < 0) throw new CustomException();
        System.out.println(5 / n);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            checkThrows(scanner.nextInt());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (CustomException e) {
            System.out.println("CustomException");
        } catch (Exception e) {
            System.out.println("Unknown " + e.getClass().getSimpleName());
        }
    }
}
