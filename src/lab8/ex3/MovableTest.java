package lab8.ex3;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0,0 ,2 ,2 );
        System.out.println(point1.toString());

        point1.moveUp();
        point1.moveUp();
        point1.moveRight();
        System.out.println(point1);

        point1.moveLeft();
        point1.moveLeft();
        point1.moveDown();
        System.out.println(point1);
    }
}
