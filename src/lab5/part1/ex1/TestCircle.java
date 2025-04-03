package lab5.part1.ex1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());


        Circle circle2 = new Circle();

        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());

        Circle circle3 = new Circle();
        circle3.setRadius(5.5);

        System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " + circle3.getArea());

        circle3.setColor("green");

        System.out.println("The color is: " + circle3.getColor());

        Circle circle4 = new Circle(5.5);
        System.out.println(circle4.toString());

        Circle circle6 = new Circle(6.6);
        System.out.println(circle6.toString());
        System.out.println("Operator + invokes toString() too: " + circle6);
    }
}
