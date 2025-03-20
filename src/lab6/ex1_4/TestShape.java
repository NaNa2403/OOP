package lab6.ex1_4;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape("blue", true);
        System.out.println(shape1);

        Circle circle1 = new Circle();
        System.out.println(circle1);
        circle1.setRadius(10);
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        rectangle1.setHeight(20);
        rectangle1.setWidth(10);
        System.out.println(rectangle1);

        Square square1 = new Square(5);
        System.out.println(square1);
        square1.setSide(5);
        System.out.println(square1);
    }
}
