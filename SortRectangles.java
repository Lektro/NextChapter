/** oefening boek maar implementatie werkt nog niet 100*/

public class SortRectangles extends Rectangle {

    /** invoke default constructor*/
    public SortRectangles(){}

    /** Construct a geometric object (CIRCLE) with the specified color and filled value */
    public SortRectangles(double width, double height, String color, boolean filled) {
        super(width, height, color, filled);
    }


    public double getWidth() {
        return super.getWidth();
    }


    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    public Comparable[] rectangles() {

        new SortRectangles(3.4, 5.4, "brown", false);
        new SortRectangles(3.4, 5.4, "brown", false);
        new SortRectangles(3.4, 5.4, "brown", false);
        new SortRectangles(3.4, 5.4, "brown", false);
        new SortRectangles(3.4, 5.4, "brown", false);


        java.util.Arrays.sort(rectangles());
        for (Comparable rectangle : rectangles()) {
        }
        return rectangles();
    }
}


