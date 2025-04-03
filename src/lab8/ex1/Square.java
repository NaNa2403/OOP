package lab8.ex1;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side){
        super(side, side);
    }

    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
    }

    public double getSide(){
        return this.getLength();
    }

    public void setSide(double side){
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
