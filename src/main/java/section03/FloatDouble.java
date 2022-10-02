package section03;

public class FloatDouble {
    public static void main(String[] args) {
        float f1 = 1.2f;
        double d1 = 1.5d;

        System.out.println(f1);
        System.out.println(d1);

        // take a look

        double d2 = 5 / 3;  // 1.0
        double d3 = 5f / 3f; // 1.6666666269302368
        double d4 = 5d / 3d; // 1.6666666666666667
        double d5 = 5.0 / 3.0; // 1.6666666666666667
//        float f2 = 5.0 / 3.0;
        float f3 = (float) (5.0 / 3.0); // 1.6666666
        float f4 = 5.0f / 3.0f; // 1.6666666

        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(f3);
        System.out.println(f4);
    }
}
