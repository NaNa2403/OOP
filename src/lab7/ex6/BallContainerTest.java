package lab7.ex6;

public class BallContainerTest {
    public static void main(String[] args) {
        Ball ball = new Ball(50,50,5,10,30);
        System.out.println(ball);
        Container box = new Container(0,100,100,100);
        System.out.println(box);
        for(int step =0 ; step < 20; ++step){
            ball.move(box); //check if hit the wall and return the speed left
            //box.collidesWith(ball); because i was check above so don't need this anymore
            System.out.println(ball);
        }
    }
}
