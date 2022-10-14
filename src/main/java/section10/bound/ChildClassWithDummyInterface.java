package section10.bound;

public class ChildClassWithDummyInterface extends ParentClass implements DummyInterface {
    public ChildClassWithDummyInterface(int parentData) {
        super(parentData);
    }

    @Override
    public void dummy() {
        System.out.println(getParentData());
    }


}
