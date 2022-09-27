package section05.challenges;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || j == 1) {
                    System.out.print("*");
                    continue;
                }

                if (i == number || j == number) {
                    System.out.print("*");
                    continue;
                }

                if (i == j || i == (number - j + 1)) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        printSquareStar(5);
    }
}
