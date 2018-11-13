package shapes;

public class Circle {
    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
