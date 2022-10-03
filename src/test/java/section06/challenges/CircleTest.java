package section06.challenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    @DisplayName("Test random radius value")
    void testCircleRadius() {
        Circle circle = new Circle(3.75);
        assertEquals(circle.getRadius(), 3.75, .01);
    }

    @Test
    @DisplayName("Test radius value zero")
    void testCircleWithZeroRadius() {
        Circle circle = new Circle(0);
        assertEquals(circle.getRadius(), 0, .01);
    }

    @Test
    @DisplayName("Test negative radius value")
    void testCircleWithNegativeRadius() {
        Circle circle = new Circle(-2);
        assertEquals(circle.getRadius(), 0, .01);
    }

    @Test
    @DisplayName("Test area with random radius value")
    void testAreaWithRandomRadius() {
        Circle circle = new Circle(3.75);
        assertEquals(circle.getArea(), 44.178646691106465, .00001);
    }

    @Test
    @DisplayName("Test area with zero radius value")
    void testAreaWithZeroRadius() {
        Circle circle = new Circle(0);
        assertEquals(circle.getArea(), 0, .00001);
    }

    @Test
    @DisplayName("Test area with negative radius value")
    void testAreaWithNegativeRadius() {
        Circle circle = new Circle(-1);
        assertEquals(circle.getArea(), 0, .00001);
    }
}
