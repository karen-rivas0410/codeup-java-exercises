package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double _length;
    protected double _width;

    public Quadrilateral() {}

    public Quadrilateral(int length, int width) {
        this._length = length;
        this._width = width;
    }
//
//    public double getLength() {
//        return this._length;
//    }
//
//    public abstract double setLength;
//
//    public double getWidth() {
//        return this._width;
//    }
//
//    public abstract void double setWidth;

}
