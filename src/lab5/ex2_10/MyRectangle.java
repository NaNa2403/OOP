package lab5.ex2_10;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }
    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public MyPoint getTopRight() {
        return new MyPoint(bottomRight.getX(), topLeft.getY());
    }

    public MyPoint getBottomLeft() {
        return new MyPoint(topLeft.getX(), bottomRight.getY());
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public int getWidth() {
        return bottomRight.getX() - topLeft.getX();
    }

    public int getHeight() {
        return topLeft.getY() - bottomRight.getY();
    }

    public boolean contains(MyPoint point) {
        return (point.getX() >= topLeft.getX() && point.getX() <= bottomRight.getX()
                && point.getY() <= topLeft.getY() && point.getY() >= bottomRight.getY());
    }

    public int getPerimeter() {
        return (getWidth() + getHeight()) * 2;
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "bottomRight=" + bottomRight +
                ", topLeft=" + topLeft +
                '}';
    }
}
