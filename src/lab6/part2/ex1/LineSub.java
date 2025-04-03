package lab6.part2.ex1;

public class LineSub extends Point{
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(),begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "begin =" + super.toString() +
                ", end=" + end +
                '}';
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }
    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setX(beginX);
        super.setY(beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        end.setX(endX);
        end.setY(endY);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.getBeginX() - this.getEndX(), 2) + Math.pow(this.getBeginY() - getEndY(), 2));
    }

    public double getGradient(){
        return Math.atan2(this.getBeginY() - this.getEndY(), this.getBeginX() - this.getEndX());
    }
}
