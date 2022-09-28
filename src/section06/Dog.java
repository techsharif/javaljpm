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

    @Override
    public void publicMethod() { // only public possible
        System.out.println("child public");
    }

    @Override
    public void protectedMethod() { // possible both public and protected (not private)
        System.out.println("child protected");
    }

//    @Override
//    public void privateMethod(){ // not possible
//        System.out.println("child private");
//    }

    @Override
    void defaultMethod() { // only possible in same package (public, protected, default)
        System.out.println("child default");
    }

}