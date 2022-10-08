package section08.challenges.c45;

public class Customer {

    private String name;
    private double transaction;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transaction = Math.max(transaction, 0);
    }

    public String getName() {
        return name;
    }

    public double getTransaction() {
        return transaction;
    }

    public void addTransaction(double transaction) {
        this.transaction += Math.max(transaction, 0);
    }
}
