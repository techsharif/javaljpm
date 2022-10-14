package section10.bound;

public class ParentClass {

    private int parentData;

    public ParentClass(int parentData) {
        this.parentData = parentData;
    }

    public int getParentData() {
        return parentData;
    }

    public void setParentData(int parentData) {
        this.parentData = parentData;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "parentData=" + parentData +
                '}';
    }


}
