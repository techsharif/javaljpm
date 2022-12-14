package section14.io.bytestream;

import java.io.*;

public class InputStreamClass {

    public static void printCharBytes(byte[] bytes) {
        for (byte b : bytes)
            System.out.print((char) b);
        System.out.println();
    }


    /**
     * 123456789ABCDEFGHIJKLMNOPQRSTUV
     */

    public static void show(InputStream inputStream, OutputStream outputStream) {
        System.out.println("Show InputStream methods " + inputStream.getClass());
        try (inputStream) {

            // read()- reads one byte of data from the input stream
            System.out.println((char) inputStream.read()); // 1

            // read(byte[] array) - reads bytes from the stream and stores in the specified array
            byte[] bytes = new byte[2];
            inputStream.read(bytes);
            printCharBytes(bytes); // 23


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

            // readNBytes(len)
            bytes = inputStream.readNBytes(3);
            printCharBytes(bytes); // ABC

            // read(bytes, offset, length)
            bytes = new byte[5];
            bytes[0] = (byte) inputStream.read();
            bytes[1] = (byte) inputStream.read();
            printCharBytes(bytes); // DE   
            inputStream.read(bytes, 2, 2); // same as inputStream.readNBytes(bytes, 2, 2);
            printCharBytes(bytes); // DEFG 


            // readAllBytes
            if (inputStream.markSupported()) {
                inputStream.mark(1);
                bytes = inputStream.readAllBytes();
                printCharBytes(bytes); // HIJKLMNOPQRST
                inputStream.reset();
            }


            // transfer to
            try (outputStream) {
                inputStream.transferTo(outputStream); // HIJKLMNOPQRST to output stream
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("example.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            show(bufferedInputStream, System.out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
