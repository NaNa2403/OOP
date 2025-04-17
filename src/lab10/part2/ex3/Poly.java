package lab10.part2.ex3;

public interface Poly {
    public double[] coefficients();

    public double coefficient(int n);

    public int degree();

    public Poly derivative();
}
