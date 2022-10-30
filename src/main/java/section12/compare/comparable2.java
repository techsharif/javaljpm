package section12.compare;

class Mark2 implements Comparable<Object> {
    private final int mark;

    public Mark2(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    private String result() {
        return mark >= 40 ? "Pass" : "Fail";
    }


    @Override
    public int compareTo(Object o) {
        if (o.getClass().equals(String.class)) {
            String s = (String) o;
            return s.compareToIgnoreCase(result());
        }

        if (o.getClass().equals(Integer.class)) {
            Integer i = (Integer) o;
            return i - mark;
        }

        if (o.getClass().equals(Mark2.class)) {
            Mark2 m = (Mark2) o;
            return m.mark - mark;
        }

        return -1;
    }

}

public class comparable2 {
    public static void main(String[] args) {
        Mark2 mark = new Mark2(5);
        Mark2 mark1 = new Mark2(5);
        Mark2 mark2 = new Mark2(6);
        Mark2 mark3 = new Mark2(60);

        System.out.println(mark1.compareTo("pass"));
        System.out.println(mark1.compareTo("fail"));
        System.out.println(mark3.compareTo("pass"));
        System.out.println(mark3.compareTo("fail"));

        System.out.println(mark3.compareTo(mark1));
        System.out.println(mark.compareTo(mark1));
    }
}
