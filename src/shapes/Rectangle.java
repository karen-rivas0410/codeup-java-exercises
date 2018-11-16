package shapes;

public class Rectangle {
    protected int length;
    protected int width;
//    protected double area;
//    protected double parimeter;

    public Rectangle() {}

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(int length, int width) {
        return length * width;
    }

    public int getPerimeter() { //best to pass the arguments in here//
          return (2 * length) + (2 * width);
    }
}
