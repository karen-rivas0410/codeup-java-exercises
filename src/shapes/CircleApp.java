package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input in = new Input();
        Circle c = new Circle(in.getInt);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
        System.out.println(c.getRadius());
    }
}
