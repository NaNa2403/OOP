package lab7.ex1_7;

import java.util.Random;

public class TestBallPlayer {
    public static void main(String[] args) {
        Ball ball = new Ball(25, 25, 0);
        System.out.println("Ball initialized: " + ball);

        // Create two players
        Player player1 = new Player(7, 15, 20);
        Player player2 = new Player(10, 40, 30);

        System.out.println(player1);
        System.out.println(player2);

        Field field = new Field(0, 0, 50, 50);
        System.out.println();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            double dist1 = player1.distanceTo(ball);
            double dist2 = player2.distanceTo(ball);

            player1.moveTowards(ball, 2.5f);
            System.out.println(player1 + " moved closer to the ball.");

            player2.moveTowards(ball, 2.5f);
            System.out.println(player2 + " moved closer to the ball.");

            Player closerPlayer = (dist1 < dist2) ? player1 : player2;

            if (closerPlayer.near(ball)) {
                closerPlayer.kick(ball);
                System.out.println("Ball new position: " + ball);
            }

            if (ball.getX() > field.getX2() || ball.getX() < field.getX1() || ball.getY() < field.getY1() || ball.getY() > field.getY2()) {
                System.out.println("Ball out of field, set ball to the middle of the field.");
                ball.setXYZ(25,25,0);
            }
        }
    }
}

