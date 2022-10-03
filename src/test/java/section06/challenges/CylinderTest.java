package section06.challenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {

    @Test
    @DisplayName("Test random radius value")
    void testCylinderRadius() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        assertEquals(cylinder.getRadius(), 5.55, .01);
    }

    @Test
    @DisplayName("Test radius value zero")
    void testCylinderWithZeroRadius() {
        Cylinder cylinder = new Cylinder(0, 0);
        assertEquals(cylinder.getRadius(), 0, .01);
    }

    @Test
    @DisplayName("Test negative radius value")
    void testCylinderWithNegativeRadius() {
        Cylinder cylinder = new Cylinder(-1, -1);
        assertEquals(cylinder.getRadius(), 0, .01);
    }

    @Test
    @DisplayName("Test area with random radius value")
    void testAreaWithRandomRadius() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        assertEquals(cylinder.getArea(), 96.76890771219959, .00001);
    }

    @Test
    @DisplayName("Test area with zero radius value")
    void testAreaWithZeroRadius() {
        Cylinder cylinder = new Cylinder(0, 0);
        assertEquals(cylinder.getArea(), 0, .00001);
    }

    @Test
    @DisplayName("Test area with negative radius value")
    void testAreaWithNegativeRadius() {
        Cylinder cylinder = new Cylinder(-1, -1);
        assertEquals(cylinder.getArea(), 0, .00001);
    }

    @Test
    @DisplayName("Test volume with random radius value")
    void testVolumeWithRandomRadius() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        assertEquals(cylinder.getVolume(), 701.574580913447, .00001);
    }

    @Test
    @DisplayName("Test volume with zero radius value")
    void testVolumeWithZeroRadius() {
        Cylinder cylinder = new Cylinder(0, 0);
        assertEquals(cylinder.getVolume(), 0, .00001);
    }

    @Test
    @DisplayName("Test volume with negative radius value")
    void testVolumeWithNegativeRadius() {
        Cylinder cylinder = new Cylinder(-1, -1);
        assertEquals(cylinder.getVolume(), 0, .00001);
    }
}
