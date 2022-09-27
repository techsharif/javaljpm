package section06;

public class Animal {
    private String name;
    private int brain;
    private int size;

    public Animal(String name, int brain, int size) {
        this.name = name;
        this.brain = brain;
        this.size = size;
    }

    public void eat() {
        System.out.println("eat() called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
