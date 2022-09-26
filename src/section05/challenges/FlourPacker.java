package section05.challenges;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int canPackBig = goal / 5;
        int canPackSmall = goal % 5;

        if (canPackBig > bigCount) {
            canPackSmall += (5 * (canPackBig - bigCount));
        }

        return smallCount >= canPackSmall;

    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(1, 0, 6));
    }
}
