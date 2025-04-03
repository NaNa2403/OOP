package lab6.part2.ex1;

public class Line {
    private Point begin;
    private Point end;

    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
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
        return Math.sqrt(Math.pow(this.getBeginX() - this.getEndX(), 2) + Math.pow(this.getBeginY() - getEndY(), 2));
    }

    public double getGradient(){
        return Math.atan2(this.getEndY() - this.getBeginY(), this.getBeginX() - this.getEndX());
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
