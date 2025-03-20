package lab6.ex2_2;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(5.0, "blue");
        System.out.println(circle2);

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(circle2, 5.0);
        System.out.println(cylinder2);
    }
}
