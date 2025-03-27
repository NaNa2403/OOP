package lab7.ex1_7;

import java.util.Random;

public class Player {
    private int number;
    private float x, y, z = 0.0f; // Default z is 0 (on the ground)

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2));
        return distance < 8;
    }

    public double distanceTo(Ball ball) {
        return Math.sqrt(Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2));
    }

    public void moveTowards(Ball ball, float stepSize) {
        float dx = ball.getX() - this.x;
        float dy = ball.getY() - this.y;
        float distance = (float) Math.sqrt(dx * dx + dy * dy);

        if (distance > stepSize) {
            // Normalize direction and move by stepSize
            this.x += (dx / distance) * stepSize;
            this.y += (dy / distance) * stepSize;
        } else {
            // If already very close, snap to the ball's position
            this.x = ball.getX();
            this.y = ball.getY();
        }
    }
    public void kick(Ball ball) {
        float randomX = -5 + new Random().nextFloat() * 10;
        float randomY = -5 + new Random().nextFloat() * 10;

        if (near(ball)) {
            ball.setXYZ(ball.getX() + randomX, ball.getY() + randomY, 1);
            System.out.println("Player " + number + " kicked the ball!");
        } else {
            System.out.println("Player " + number + " is too far to kick the ball.");
        }
    }

    @Override
    public String toString() {
        return "Player " + number + " at (" + x + "," + y + "," + z + ")";
    }
}
