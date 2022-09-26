package section05;

public class ParseString {
    public static void main(String[] args) {
        String intString = "2018";
        String doubleString = "2018.12";

        int in = Integer.parseInt(intString);
        double db = Double.parseDouble(doubleString);

        System.out.println(in + " " + db);
    }
}
