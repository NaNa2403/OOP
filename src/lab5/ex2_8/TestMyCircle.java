package lab5.ex2_8;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint center1 = new MyPoint(0, 0);
        MyPoint center2 = new MyPoint(3, 4);

        MyCircle circle1 = new MyCircle(center1, 5);
        MyCircle circle2 = new MyCircle(center2, 10);

        System.out.println("Circle 1: Center (" + circle1.getCenterX() + ", " + circle1.getCenterY() + "), Radius: " + circle1.getRadius());
        System.out.println("Circle 2: Center (" + circle2.getCenterX() + ", " + circle2.getCenterY() + "), Radius: " + circle2.getRadius());

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));
    }
}
