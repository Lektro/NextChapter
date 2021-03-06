import java.util.Date;

/** The abstract class, NO? */
public abstract class GeometricObject {

    /** Declaring data types and variables? */
    protected String color = "white";
    protected boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** eeeeijh display object?? */
    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
    /** Return color */
    public String getColor() {
        return color;
    }

    /**  Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean its getter method is named isFilled */
    public boolean isFilled() {

        /** build a switch here? */
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on: " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();

}

