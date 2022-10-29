package section12.maps;


import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapClass {
    public static void main(String[] args) {

        EnumMap<Size, String> enumMap = new EnumMap<>(Size.class);
        enumMap.put(Size.SMALL, "sm");
        System.out.println(enumMap);

        Map<Size, String> map = new HashMap<>();
        map.put(Size.SMALL, "sm");
        System.out.println(map);


    }

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
}
