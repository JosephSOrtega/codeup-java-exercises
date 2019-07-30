package shapes;

public class Circle {
    private static double radius;
//    public static double radius;

    //    Circle circle = new Circle();
    public Circle(double radius) {
        this.radius = radius;
        System.out.println(Circle.radius);
    }

    double getArea() {
        System.out.println(Circle.radius * Circle.radius);

        return Math.PI * (Circle.radius * Circle.radius);

    }

    public double getCircumference() {
        System.out.println(Math.PI * 2 * Circle.radius);
        return Math.PI * 2 * Circle.radius;
    }
}
