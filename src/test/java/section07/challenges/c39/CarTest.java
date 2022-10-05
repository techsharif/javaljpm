package section07.challenges.c39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void testCarStartEngine() {
        Car car = new Car(8, "Base car");
        assertEquals("Car -> startEngine()", car.startEngine());
    }

    @Test
    void testCarAccelerate() {
        Car car = new Car(8, "Base car");
        assertEquals("Car -> accelerate()", car.accelerate());
    }

    @Test
    void testCarBrake() {
        Car car = new Car(8, "Base car");
        assertEquals("Car -> brake()", car.brake());
    }

    @Test
    void testMitsubishiStartEngine() {
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        assertEquals("Mitsubishi -> startEngine()", mitsubishi.startEngine());
    }

    @Test
    void testMitsubishiAccelerate() {
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        assertEquals("Mitsubishi -> accelerate()", mitsubishi.accelerate());
    }

    @Test
    void testMitsubishiBrake() {
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        assertEquals("Mitsubishi -> brake()", mitsubishi.brake());
    }

    @Test
    void testFordStartEngine() {
        Ford ford = new Ford(6, "Ford Falcon");
        assertEquals("Ford -> startEngine()", ford.startEngine());
    }

    @Test
    void testFordAccelerate() {
        Ford ford = new Ford(6, "Ford Falcon");
        assertEquals("Ford -> accelerate()", ford.accelerate());
    }

    @Test
    void testFordBrake() {
        Ford ford = new Ford(6, "Ford Falcon");
        assertEquals("Ford -> brake()", ford.brake());
    }
}
