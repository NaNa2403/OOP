package hus.oop.integration;

public class MyArrayPolynomial extends MyAbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayPolynomial() {
        /* TODO */
    }

    @Override
    public double coefficient(int index) {
        /* TODO */
    }

    @Override
    public double[] coefficients() {
        /* TODO */
    }

    @Override
    public MyArrayPolynomial append(double coefficient) {
        /* TODO */
    }

    @Override
    public MyArrayPolynomial add(double coefficient, int index) {
        /* TODO */
    }

    @Override
    public MyArrayPolynomial set(double coefficient, int index) {
        /* TODO */
    }

    @Override
    public int degree() {
        /* TODO */
    }

    @Override
    public double evaluate(double x) {
        /* TODO */
    }

    @Override
    public MyArrayPolynomial derivative() {
        /* TODO */
    }

    @Override
    public MyArrayPolynomial plus(MyPolynomial right) {
        /* TODO */
    }

    @Override
    public MyArrayPolynomial minus(MyPolynomial right) {
        /* TODO */
    }

    @Override
    public MyArrayPolynomial multiply(MyPolynomial right) {
        /* TODO */
    }

    /**
     * Tăng kích thước mảng lên gấp đôi để lưu đa thức khi cần thiết.
     */
    private void allocateMore() {
        /* TODO */
    }
}
