package section12.arraylist;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Capacity {


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        System.out.println("start --");
        List<Long[]> one = new ArrayList<>();
        List<Long[]> five = new ArrayList<>();
        List<Long[]> ten = new ArrayList<>();
        List<Long[]> twenty = new ArrayList<>();
        List<Long[]> hundred = new ArrayList<>();

        for (Long i = 0L; i < 100000; i++) {
            LocalDateTime start = LocalDateTime.now();
            strings.add("ASDFGHJKLPPDSFJDSVJUERDFHJVDUYERHVERDV");
            LocalDateTime end = LocalDateTime.now();

            Long diff = ChronoUnit.MICROS.between(start, end);
            if (diff >= 1) one.add(new Long[]{i, diff});
            if (diff >= 5) five.add(new Long[]{i, diff});
            if (diff >= 10) ten.add(new Long[]{i, diff});
            if (diff >= 20) twenty.add(new Long[]{i, diff});
            if (diff >= 100) hundred.add(new Long[]{i, diff});
        }

        System.out.println(one.size());
        System.out.println(five.size());
        System.out.println(ten.size());
        System.out.println(twenty.size());
        System.out.println(hundred.size());

        for (Long[] item : hundred) {
            System.out.println(item[0] + " " + item[1]);
        }
    }
}

/***
 * start --
 * 23313
 * 206
 * 42
 * 26
 * 5
 *
 *
 * start --
 * 20422
 * 223
 * 57
 * 27
 * 5
 *
 *
 * start --
 * 23848
 * 311
 * 101
 * 33
 * 5
 *
 *
 *
 * start --
 * 22642
 * 294
 * 107
 * 39
 * 5
 *
 * start --
 * 16058
 * 169
 * 40
 * 14
 * 5
 * 0 223
 * 511 346
 * 47427 142
 * 71140 195
 * 81616 2975
 *
 *
 * start --
 * 18619
 * 160
 * 32
 * 16
 * 5
 * 0 213
 * 511 376
 * 31618 107
 * 47427 169
 * 71140 215
 *
 *
 * start --
 * 20132
 * 237
 * 94
 * 33
 * 5
 * 0 229
 * 511 370
 * 31618 107
 * 47427 183
 * 71140 248
 *
 */
