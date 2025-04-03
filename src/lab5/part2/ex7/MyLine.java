package lab5.part2.ex7;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public int[] getBeginXY(){
        return new int[]{begin.getX(), begin.getY()};
    }

    public void setBeginXY(int x, int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY(){
        return new int[]{end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength(){
        return begin.distance(this.end);
    }

    public double getGradient(){
        return Math.atan2(this.end.getY() - this.begin.getY(), this.end.getX() - this.begin.getX());
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
