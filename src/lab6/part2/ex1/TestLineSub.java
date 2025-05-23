package lab6.part2.ex1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        l2.setBeginX(5);
        l2.setBeginY(4);
        l2.setEndX(4);
        l2.setEndY(5);
        System.out.println(l2);
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
}
