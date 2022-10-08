package section08.challenges.c45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void checkRandomNameAndTransactionValue() {
        Customer customer = new Customer("Demo", 12);
        assertEquals(12, customer.getTransaction(), .01);
    }

    @Test
    void checkNegativeTransactionValue() {
        Customer customer = new Customer("Demo", -12);
        assertEquals(0, customer.getTransaction(), .01);
    }

    @Test
    void checkTransactionAddWithRandomValue() {
        Customer customer = new Customer("Demo", 12);
        customer.addTransaction(12);
        assertEquals(24, customer.getTransaction(), .01);
    }

    @Test
    void checkTransactionAddWithNegativeValue() {
        Customer customer = new Customer("Demo", 12);
        customer.addTransaction(-12);
        assertEquals(12, customer.getTransaction(), .01);
    }


}
