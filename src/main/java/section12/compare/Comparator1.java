package section12.compare;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class WithComparable implements Comparable<WithComparable> {
    private final int num;

    public WithComparable(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public int compareTo(WithComparable o) {
        return num - o.num;
    }

    @Override
    public String toString() {
        return "" + num;
    }
}

class WithOutComparable {
    private final int num;

    public WithOutComparable(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "" + num;
    }
}

class BasicComparator implements Comparator<WithOutComparable> {

    @Override
    public int compare(WithOutComparable o1, WithOutComparable o2) {
        return o1.getNum() - o2.getNum();
    }
}

class AbsComparator implements Comparator<WithOutComparable> {

    @Override
    public int compare(WithOutComparable o1, WithOutComparable o2) {
        return Math.abs(o1.getNum()) - Math.abs(o2.getNum());
    }
}

public class Comparator1 {
    public static void main(String[] args) {
        List<WithComparable> withComparables = new ArrayList<>();
        withComparables.add(new WithComparable(1));
        withComparables.add(new WithComparable(5));
        withComparables.add(new WithComparable(2));
        withComparables.add(new WithComparable(-3));
        withComparables.add(new WithComparable(9));
        withComparables.add(new WithComparable(4));

        // Before sort WithComparable [1, 5, 2, -3, 9, 4]
        System.out.println("Before sort WithComparable " + withComparables);
        Collections.sort(withComparables);
        // After sort WithComparable [-3, 1, 2, 4, 5, 9]
        System.out.println("After sort WithComparable " + withComparables);

        List<WithOutComparable> withOutComparables = new ArrayList<>();
        withOutComparables.add(new WithOutComparable(1));
        withOutComparables.add(new WithOutComparable(5));
        withOutComparables.add(new WithOutComparable(2));
        withOutComparables.add(new WithOutComparable(-3));
        withOutComparables.add(new WithOutComparable(9));
        withOutComparables.add(new WithOutComparable(4));

        // Before basic sort withOutComparables [1, 5, 2, -3, 9, 4]
        System.out.println("Before basic sort withOutComparables " + withOutComparables);
        Collections.sort(withOutComparables, new BasicComparator());
//        withOutComparables.sort(new BasicComparator()); // we can do this
        // After basic sort withOutComparables [-3, 1, 2, 4, 5, 9]
        System.out.println("After basic sort withOutComparables " + withOutComparables);

        // Before abs sort withOutComparables [-3, 1, 2, 4, 5, 9]
        System.out.println("Before abs sort withOutComparables " + withOutComparables);
        Collections.sort(withOutComparables, new AbsComparator());
        // After abs sort withOutComparables [1, 2, -3, 4, 5, 9]
        System.out.println("After abs sort withOutComparables " + withOutComparables);
    }
}
