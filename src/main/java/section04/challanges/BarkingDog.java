package section04.challanges;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hour) {
        return isBarking && ((0 <= hour && hour < 8) || (hour == 23));
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1)); // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8)); // false
        System.out.println(shouldWakeUp(true, -1)); // false
    }

}
