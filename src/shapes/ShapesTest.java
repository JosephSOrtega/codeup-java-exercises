package shapes;

public class ShapesTest {
   static Measurable myShape;

    public static void main(String[] args) {
        myShape = new Rectangle(5, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


//        You can determine which getArea and getPerimeter methods are being called on each object
//        by what instance is being is used.
    }
}
