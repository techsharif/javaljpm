package section10.bound;

public class ChildClass extends ParentClass {

    private int childData;

    public ChildClass(int parentData, int childData) {
        super(parentData);
        this.childData = childData;
    }

    public int getChildData() {
        return childData;
    }

    public void setChildData(int childData) {
        this.childData = childData;
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "childData=" + childData +
                '}';
    }
}
