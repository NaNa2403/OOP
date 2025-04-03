package lab8.ex2;

public class GeometricObjectTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(3.0, 5.0);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

    }
}
