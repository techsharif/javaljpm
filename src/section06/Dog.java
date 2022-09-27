package section06;

public class Dog extends Animal {

    private int teeth;

    public Dog(String name, int brain, int size, int teeth) {
        super(name, brain, size);
        this.teeth = teeth;
    }

    private void chew() {
        System.out.println("dog chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog eat() called");
        chew();
        super.eat();
    }

}
