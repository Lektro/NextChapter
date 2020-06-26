public class Circle extends GeometricObject {

    /** Declaring data types and variables for this class? */
    private double radius;

    /** Construct a default geometric Circle */
    public Circle(){}

    /** Construct a geometric object (CIRCLE) with the specified color and filled value */
    public Circle(double radius, String color, boolean filled) {

        /** Declaring data types and variables for this object? */
        this.radius = radius;
        setColor(color); // correct way to set color because they are accessed at GeometricObject Super Class
        setFilled(filled); // correct wat to set filled because they are accessed at GeometricObject Super Class
    }

    /** Return radius */
    public double getRadius(){
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area (abstract) */
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter  */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print circle information */
    public void printCircle() {
        System.out.println("The Circle is created on: " + getDateCreated() + " and the radius is: " + radius);
    }
    /** Print object */
    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
