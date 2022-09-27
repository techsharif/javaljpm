package section05;

import java.util.Scanner;

public class ReadingInputNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // will work fine for two string
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(s1);
        System.out.println(s2);

        // will not work for number and string
        int a = scanner.nextInt();
        System.out.println(a);

        scanner.nextLine(); // to skip end line character

        String b = scanner.nextLine();
        System.out.println(b);
    }
}
