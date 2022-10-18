package section12.arraylist;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Capacity2 {

    public static void execute(List<String> strings) {
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


    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        first.ensureCapacity(110000);
        execute(first);

    }
}

/***
 *
 * value - 0
 * start --
 * 19410
 * 228
 * 67
 * 30
 * 6
 * 0 227
 * 447 383
 * 31618 109
 * 47427 172
 * 71140 208
 * 80593 2872
 *
 *
 * value - 0
 * start --
 * 18991
 * 202
 * 50
 * 18
 * 6
 * 0 221
 * 511 375
 * 31618 105
 * 47427 135
 * 71140 222
 * 82285 2883
 *
 *
 * value - 100
 * start --
 * 19980
 * 209
 * 43
 * 21
 * 5
 * 0 240
 * 511 400
 * 43606 149
 * 65409 189
 * 98113 318
 *
 * value 1000
 * start --
 * 21436
 * 195
 * 55
 * 27
 * 6
 * 0 232
 * 511 392
 * 38436 146
 * 57654 185
 * 80669 3365
 * 86481 239
 *
 *
 *
 * value - 10000
 * start --
 * 17363
 * 162
 * 37
 * 19
 * 5
 * 0 212
 * 511 371
 * 33750 100
 * 50625 142
 * 75937 214
 *
 *
 * value 100000
 * start --
 * 18497
 * 158
 * 30
 * 14
 * 2
 * 0 217
 * 447 394
 *
 */
