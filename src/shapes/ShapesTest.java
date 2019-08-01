package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());


//        You can determine which getArea and getPerimeter methods are being called on each object
//        by what instance is being is used.
    }
}
