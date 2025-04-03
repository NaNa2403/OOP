package lab5.part2.ex7;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 1);
        MyPoint point2 = new MyPoint(2, 2);

        MyLine line1 = new MyLine(3, 3, 6, 6);
        System.out.println(line1);

        MyLine line2 = new MyLine(point1, point2);
        System.out.println(line2);

        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 2 Length: " + line2.getLength());

        System.out.println("Line 1 Gradient: " + line1.getGradient());
        System.out.println("Line 2 Gradient: " + line2.getGradient());

        line1.setBeginXY(5, 5);
        line1.setEndXY(8, 8);
        System.out.println("Updated Line 1: " + line1);

        line2.setBegin(new MyPoint(3, 3));
        line2.setEnd(new MyPoint(6, 7));
        System.out.println("Updated Line 2: " + line2);

        System.out.println("Line 1 Begin Coordinates: " + line1.getBeginXY()[0] + ", " + line1.getBeginXY()[1]);
        System.out.println("Line 1 End Coordinates: " + line1.getEndXY()[0] + ", " + line1.getEndXY()[1]);

        System.out.println("Line 2 Begin Coordinates: " + line2.getBeginXY()[0] + ", " + line2.getBeginXY()[1]);
        System.out.println("Line 2 End Coordinates: " + line2.getEndXY()[0] + ", " + line2.getEndXY()[1]);
    }
}
