package lab8.ex5;

public class MainTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        ResizeableCircle circle2 = new ResizeableCircle(6.0);
        System.out.println(circle2);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());

        circle2.resize(50);
        System.out.println(circle2);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
    }
}
