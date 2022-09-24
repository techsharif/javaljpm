package section03;

public class MaxMinOverflow {

    public static void main(String[] args) {
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(minInt);
        System.out.println(maxInt);

        // underflow overFlow
        System.out.println(minInt - 1);
        System.out.println(maxInt + 1);
    }
}
