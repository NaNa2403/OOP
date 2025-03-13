package lab5.ex2_8;

public class MyCircle {
    private MyPoint center;
    private double radius;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY(){
        return new int[]{getCenterX(), getCenterY()};
    }

    public void setCenterXY(int x, int y){
        setCenterX(x);
        setCenterY(y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle circle) {
        return this.center.distance(circle.getCenter());
    }
}
