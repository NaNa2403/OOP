package lab5.part1.ex2;

public class Circle {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                " radius = " + radius +
                ']';
    }
}
