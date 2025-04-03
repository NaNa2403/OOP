package lab7.ex6;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y - height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getWidth() {
        return x1 - x2;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collidesWith(Ball ball) {
        if ((ball.getX() - ball.getRadius() + ball.getxDelta() <= this.x1) || (ball.getX() + ball.getRadius() + ball.getxDelta() >= this.x2)) {
            ball.reflectHorizontal();
            return true;
        }
        if ((ball.getY() + ball.getRadius() + ball.getyDelta() >= this.y1) || (ball.getY() - ball.getRadius() + ball.getyDelta() <= this.y2)) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "((" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + "))";
    }
}
