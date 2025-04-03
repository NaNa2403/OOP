package lab5.part2.ex10;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(0, 10);
        MyPoint bottomRight = new MyPoint(5, 0);

        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);
        MyRectangle rectangle2 = new MyRectangle(1, 7, 6, 1);

        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());
        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());

        System.out.println("Rectangle 2: " + rectangle2);
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.getPerimeter());
        System.out.println("Area of Rectangle 2: " + rectangle2.getArea());

        MyPoint point1 = new MyPoint(3, 5);
        MyPoint point2 = new MyPoint(7, 2);

        System.out.println("Point (3, 5) is inside Rectangle 1: " + rectangle1.contains(point1));
        System.out.println("Point (7, 2) is inside Rectangle 1: " + rectangle1.contains(point2));

        System.out.println("Top Left of Rectangle 1: " + rectangle1.getTopLeft());
        System.out.println("Bottom Right of Rectangle 1: " + rectangle1.getBottomRight());
        System.out.println("Top Right of Rectangle 1: " + rectangle1.getTopRight());
        System.out.println("Bottom Left of Rectangle 1: " + rectangle1.getBottomLeft());
    }
}
