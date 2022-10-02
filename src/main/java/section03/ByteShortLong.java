package section03;

public class ByteShortLong {
    public static void main(String[] args) {
        byte bt1 = 127; // 8 bit blu
        short st1 = 12000; // 16 bit
        int int1 = 123123123; // 32 bit
        long lg1 = 1231231212312L; // 64 bit

        // notice
        lg1 = 123_12312_1231_2L; // we can use _ to make it more readable
        int1 = 123_1231_23;
        st1 = 120_00;
        lg1 = 123_1231_23; // for small value in int range, we can ignore the ending L

        System.out.println(lg1 + int1 + st1);

        // cast
//        bt1 = st1 / 2; // error
        bt1 = (byte) (st1 / 2);


    }
}

