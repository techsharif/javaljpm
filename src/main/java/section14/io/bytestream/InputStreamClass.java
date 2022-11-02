package section14.io.bytestream;

import java.io.*;

public class InputStreamClass {

    /**
     * 123456789
     * ABCDEFGHIJ
     * KLMNOPQRST
     */

    public static void show(InputStream inputStream) {

        System.out.println("Show InputStream methods " + inputStream.getClass());
        try (inputStream) {

            // read()- reads one byte of data from the input stream
            System.out.println((char) inputStream.read()); // 1

            // read(byte[] array) - reads bytes from the stream and stores in the specified array
            byte[] bytes = new byte[2];
            inputStream.read(bytes);
            for (byte b : bytes)
                System.out.print((char) b); // 23
            System.out.println();


            // available() - returns the number of bytes available in the input stream
            System.out.println(inputStream.available()); // 28

            inputStream.skip(2L);
            System.out.println((char) inputStream.read()); // 6


            // markSupported()- checks if the mark() and reset() method is supported in the stream
            System.out.println(inputStream.markSupported());   // true or false

            // mark() and reset
            if (inputStream.markSupported()) {
                System.out.println((char) inputStream.read()); // 7
                inputStream.mark(5);
                System.out.println((char) inputStream.read()); // 8
                System.out.println((char) inputStream.read()); // 9
                inputStream.reset();
                System.out.println((char) inputStream.read()); // 8
                System.out.println((char) inputStream.read()); // 9
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("example.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            show(bufferedInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
