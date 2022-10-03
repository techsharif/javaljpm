package section06.challenges;

public class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
