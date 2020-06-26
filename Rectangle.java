public class Rectangle extends GeometricObject {

    /** Declaring private data types and variables? only accessebale from here? can be set in another classs? */
    private double width;
    private double height;

    /** Construct a default geometric rectangle */
    public Rectangle() {}

    /** Construct a square object with parameters available? */
    public Rectangle (double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color); // correct way to set color because they are accessed at GeometricObject Super Class
        setFilled(filled); // correct wat to set filled because they are accessed at GeometricObject Super Class
    }

    /** return width */
    public double getWidth() {
        return width;
    }

    /** set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** return height */
    public double getHeight() {
        return height;
    }

    /** set new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** uuuuh??? method om object te creeen? werkt nog niet in main */
    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
    /** return area (abstract) */
    @Override
    public double getArea() {
        return width * height;
    }

    /** Return perimeter (abstract) */
    @Override
    public double getPerimeter(){ return 2 * (width + height);
    }
}
