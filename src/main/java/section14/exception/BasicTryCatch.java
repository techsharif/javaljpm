package section14.exception;

public class BasicTryCatch {

    public static Boolean tryCatchFinal(int x, int y) {
        try {
            return x / y == 0;
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
            return Boolean.FALSE;
        } finally {
            System.out.println("Finally"); // always no matter print is in try
        }
    }

    public static void main(String[] args) {
        System.out.println(tryCatchFinal(1, 2));
        System.out.println(tryCatchFinal(1, 0));
        System.out.println(tryCatchFinal(2, 2));
    }
}
