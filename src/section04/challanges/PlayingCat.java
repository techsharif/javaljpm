package section04.challanges;

public class PlayingCat {

    public static boolean isCatPlaying(boolean isSummer, long temperature) {
        if (isSummer) return 25 <= temperature && temperature <= 45;
        else return 25 <= temperature && temperature <= 35;
    }
}
