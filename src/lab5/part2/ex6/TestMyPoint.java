package lab5.part2.ex6;

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        System.out.println(point1);

        point1.setX(8);
        point1.setY(6);

        System.out.println("x is: " + point1.getX());
        System.out.println("y is: " + point1.getY());

        point1.setXY(3, 0);

        System.out.println("x is: " + point1.getXY()[0]);
        System.out.println("y is: " + point1.getXY()[1]);

        System.out.println(point1);

        MyPoint point2 = new MyPoint(0, 4);
        System.out.println(point2);

        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
        System.out.println("Distance from point2 to point1: " + point2.distance(point1));
        System.out.println("Distance from point1 to (5, 6): " + point1.distance(5, 6));
        System.out.println("Distance from point1 to origin: " + point1.distance());

        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        System.out.println("List of points: " + Arrays.toString(points));
    }
}
