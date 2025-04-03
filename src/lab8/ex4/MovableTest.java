package lab8.ex4;

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

        MovableCircle movableCircle1 = new MovableCircle(0,0 ,3 ,4 , 5);
        System.out.println(movableCircle1);

        movableCircle1.moveUp();
        movableCircle1.moveUp();
        movableCircle1.moveRight();
        System.out.println(movableCircle1);

        movableCircle1.moveLeft();
        movableCircle1.moveLeft();
        movableCircle1.moveDown();
        System.out.println(movableCircle1);
    }
}
