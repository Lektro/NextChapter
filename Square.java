public class Square extends GeometricObject{

    /** Declaring data types and variables */
    private double side;

    /** Construct a default geometric square */
    public Square(){}

    /** Construct a square object with parameters available? */
    public Square(double side) {
        this.side = side;
        setColor(color); // correct way to set color because they are accessed at GeometricObject Super Class
        setFilled(filled); // correct wat to set filled because they are accessed at GeometricObject Super Class
    }

    /** Return side value */
    public double getSide() {
        return side;
    }

    /** Set a new side value? */
    public void setSide(double side) {
        this.side = side;
    }

    /** Return area (abstract) overrides because also in super class? */
    @Override
    public double getArea() {
        return side * side;
    }

    /** Return perimeter (abstract) */
    @Override
    public double getPerimeter() {
        return 4 * (side);
    }
}
