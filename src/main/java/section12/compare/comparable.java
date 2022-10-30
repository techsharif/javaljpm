package section12.compare;


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

}

public class comparable {
    public static void main(String[] args) {
        Mark mark = new Mark(5);
        Mark mark1 = new Mark(5);
        Mark mark2 = new Mark(6);

        System.out.println(mark.compareTo(mark1)); // 0
        System.out.println(mark2.compareTo(mark1)); // -1
    }
}
