package section05.challenges;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int panNumber = number = Math.abs(number);
        int newNumber = 0;
        while (number != 0) {
            newNumber = newNumber * 10 + number % 10;
            number /= 10;
        }
        return panNumber == newNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
