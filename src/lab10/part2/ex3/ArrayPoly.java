package lab10.part2.ex3;

public class ArrayPoly extends AbstractPoly{
    private double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public double coefficient(int n) {
        return coefficients[n+1];
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        coefficients = super.derive();
        return new ArrayPoly(coefficients);
    }
}
