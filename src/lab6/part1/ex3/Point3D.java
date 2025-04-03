package lab6.part1.ex3;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {this.getX(), this.getY(), this.getZ()};
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    @Override
    public String toString(){
        return "(" + this.getX()
                + "," + this.getY()
                + "," + this.getZ()
                + ")";
    }
}
