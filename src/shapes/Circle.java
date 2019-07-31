package shapes;

public class Circle {
    private double radius;
//    public static double radius;

    //    Circle circle = new Circle();
    public Circle(double radius) {
        this.radius = radius;
        System.out.println(this.radius);
    }

    public double getArea() {
        System.out.println(this.radius * this.radius + " is the area.");

        return Math.PI * (this.radius * this.radius);

    }

    public double getCircumference() {
        System.out.println(Math.PI * 2 * this.radius + " is the circumference.");
        return Math.PI * 2 * this.radius;
    }
}
