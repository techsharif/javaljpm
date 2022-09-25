package section05;

public class Switch {

    public static String numberToString(int number) {

        String value = "";

        switch (number) {
            case 1:
                value = "One";
                break;

            case 2:
                value = "Two";
                break;

            case 3:
                value = "Three";
                break;

            default:
                value = "Out of range";
                break;

        }
        return value;
    }

    public static void main(String[] args) {

        System.out.println(numberToString(2));
    }
}
