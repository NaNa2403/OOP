package lab7.ex6;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;

        double radians = Math.toRadians(direction);
        this.xDelta = (float) (speed * Math.cos(radians));
        this.yDelta = (float) (-speed * Math.sin(radians));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(Container container) {
        // if hit the left container
        if (x - radius + xDelta < container.getX1()) {
            float distance = Math.abs(-container.getX1() - radius + x);
            float speedLeft = -xDelta - distance;

            x = container.getX1() + radius + speedLeft;
            xDelta = -xDelta;
        }
        // if hit the right container
        else if (x + radius + xDelta > container.getX2()) {
            float distance = Math.abs(-x - radius + container.getX2());
            float speedLeft = xDelta - distance;

            x = container.getX2() - radius - speedLeft;
            xDelta = -xDelta;
        } else {
            x += xDelta;
        }

        // if hit the top container
        if (y - radius + yDelta > container.getY1()) {
            float distance = Math.abs(container.getY1() + radius - y);
            float speedLeft = -yDelta - distance;

            y = container.getY1() + radius + speedLeft;
            yDelta = -yDelta;

        }
        // if hit the bottom container
        else if (y + radius + yDelta < container.getY2()) {
            float distance = Math.abs(y + radius - container.getY2());
            float speedLeft = yDelta - distance;

            y = container.getY2() - radius - speedLeft;
            yDelta = -yDelta;
        } else {
            y += yDelta;
        }
    }

    public void moveX(int deltaX) {
        x += deltaX;
    }

    public void moveY(int deltaY) {
        y += deltaY;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "(" + x +
                "," + y +
                ") speed=(" + xDelta +
                "," + yDelta +
                ")" +
                '}';
    }
}
