package shapes;
import util.Input;

import java.util.Scanner;

//import shapes.Circle;


public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        System.out.println("Whats the radius of the circle?");
        double radius = scanner.nextDouble();
//        double radius = input.getDouble("what is the radius of this circle?");
        Circle circle = new Circle(radius);
        circle.getArea();
        circle.getCircumference();
    }
}
