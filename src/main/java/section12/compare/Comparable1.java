package section12.compare;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mark implements Comparable<Mark> {
    private int mark;

    public Mark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public int compareTo(Mark m) {
        return m.mark - mark;
    }

    @Override
    public String toString() {
        return "" + mark;
    }
}

public class Comparable1 {
    public static void main(String[] args) {
        Mark mark = new Mark(5);
        Mark mark1 = new Mark(5);
        Mark mark2 = new Mark(6);

        System.out.println(mark.compareTo(mark1)); // 0
        System.out.println(mark2.compareTo(mark1)); // -1

        List<Mark> marks = new ArrayList<>();
        marks.add(mark1);
        marks.add(mark2);
        marks.add(mark);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
