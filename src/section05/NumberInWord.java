package section05;

public class NumberInWord {


    public static void printNumberInWord(int number) {
        String value = "";

        switch (number) {
            case 1:
                value = "ONE";
                break;

            case 2:
                value = "TWO";
                break;

            case 3:
                value = "THREE";
                break;

            case 4:
                value = "FOUR";
                break;

            case 5:
                value = "FIVE";
                break;

            case 6:
                value = "SIX";
                break;

            case 7:
                value = "SEVEN";
                break;

            case 8:
                value = "EIGHT";
                break;

            case 9:
                value = "NINE";
                break;

            case 0:
                value = "ZERO";
                break;

            default:
                value = "OTHER";
                break;

        }

        System.out.println(value);
    }
}
