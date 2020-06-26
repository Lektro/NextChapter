    /** Based on Chapter 11 & 13
    /** Alles staat in dezelfde package project begonnen in hoofstuk 11 */

public class NextChapter {

    public static void main(String[] args) {

        /** Here we go! */
        Circle circle = new Circle(2.58, "nuts", true);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        /** The rectangle, all or nothing! */
        Rectangle rectangle = new Rectangle(25.2, 42.92, "Caramel", false); // Caramel geprobeerd ivm de ijsjes
        System.out.println("\nA rectangle is filled? " + rectangle.isFilled()); // not sure what to do with dis.
        System.out.println("created with a height of: " +rectangle.getHeight() + " and a width of: " + rectangle.getWidth());  // can be used for flavors??
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        /** tried the same for a square, it freaking worked. Not sure if I can memorize it all tho */
        Square square = new Square(52.2);
        System.out.println("A Square " + square.toString());
        System.out.println("The area is " + square.getArea());

        /** Display objects binded weird stuff happened here */
        // Object object = new GeometricObject();
        // Object o = new GeometricObject();
        // System.out.println("First PRINT of object: " + o.toString());

        /** Casting Demo polymorphism? */
        Circle.displayObject(new Circle(1, "red", false)); // hurray?? but multiple color selections how?
        Rectangle.displayObject(new Rectangle(4, 18, "black", true));
        Triangle.displayObject(new Triangle(5,25,"blue", false)); // they all need to be filled in otherwise no worky

        Triangle triangle = new Triangle(3,8,"blue",true);
        System.out.println(triangle.getColor());

        System.out.println("printed from sorting: " + rectangle); // sorted werkt, but I don't know why. neemt de verkeerde value's aan denk ik ergens

        /** Snap het toch al iets meer, nu opnieuw proberen met die ijsjes, smaken krijgen toch niet allemaal hun eigen classe? */
        /** staan hier en daar wat andere variablen, dit is echt een try to figure it out projectje geworden */
        
    }
}
