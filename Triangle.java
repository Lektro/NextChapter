public class Triangle extends GeometricObject {

    /**
     * Declaring data types and variables for this class?
     */
    private double base;
    private double height;
    private double hypotenuse;

    /** Construct a default geometric triangle */
    public Triangle() {}

    /** Construct a square object with parameters available? */
    public Triangle(double base, double height, String color, boolean filled){

        this.base = base;
        this.height = height;
        setColor(color); // correct way to set color because they are accessed at GeometricObject Super Class
        setFilled(filled); // correct wat to set filled because they are accessed at GeometricObject Super Class
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return  ( base * height ) * 2 ;
    }

    @Override
    public double getPerimeter() {

        // This needs some math
        return 0;
    }
}
