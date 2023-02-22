import java.util.*;
//package shapes;

public class Circle {

    private final double PI = 3.1415159;
    private double radius;

    public Circle() {
        radius = 0.0;
    }
    public Circle(double r) {
        radius = r;
    }

    public void setRadius(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }

    //Constructor method
    public double getArea(double radius) {
        return radius * radius * Math.PI;

    }
    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;

    }

    public static void main(String[] args) {
        Circle circleRadius1 = new Circle();
        Circle circleRadius2 = new Circle();
        System.out.println(circleRadius2.getArea(34));
        System.out.println(circleRadius1.getCircumference(56));

    }
}
