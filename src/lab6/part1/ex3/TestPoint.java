package lab6.part1.ex3;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(10,20);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.toString());

        Point2D p2 = new Point2D(10,20);
        p2.setX(20);
        System.out.println(p2.toString());

        Point3D p3 = new Point3D(10,20,30);
        System.out.println(p3.getX());
        System.out.println(p3.getY());
        System.out.println(p3.getZ());
        System.out.println(p3.toString());

        Point3D p4 = new Point3D(10,20,30);
        p4.setX(30);
        p4.setY(40);
        p4.setZ(50);
        System.out.println(p4.toString());
    }
}
