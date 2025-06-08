package hus.oop.integration;

import java.util.Arrays;

public class MyArrayPolynomial extends MyAbstractPolynomial {
    private double[] coefficients;

    public MyArrayPolynomial() {
        this.coefficients = new double[]{0.0};
    }

    private MyArrayPolynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double coefficient(int degree) {
        return (degree >= 0 && degree < coefficients.length) ? coefficients[degree] : 0.0;
    }

    @Override
    public double[] getCoefficients() {
        return Arrays.copyOf(coefficients, coefficients.length);
    }

    @Override
    public int degree() {
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] != 0.0) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public MyPolynomial append(double coefficient) {
        double[] newCoeffs = Arrays.copyOf(this.coefficients, this.coefficients.length + 1);
        newCoeffs[newCoeffs.length - 1] = coefficient;
        this.coefficients = newCoeffs;
        return this;
    }

    @Override
    public MyPolynomial set(double coefficient, int degree) {
        if (degree < 0) throw new IllegalArgumentException("Degree cannot be negative.");
        if (degree >= this.coefficients.length) {
            this.coefficients = Arrays.copyOf(this.coefficients, degree + 1);
        }
        this.coefficients[degree] = coefficient;
        return this;
    }

    @Override
    public double evaluate(double x) {
        double value = 0.0;
        for (int i = this.degree(); i >= 0; i--) {
            value = value * x + this.coefficient(i);
        }
        return value;
    }

    @Override
    public MyPolynomial derivative() {
        return new MyArrayPolynomial(differentiate());
    }

    @Override
    public MyPolynomial plus(MyPolynomial another) {
        int resultDegree = Math.max(this.degree(), another.degree());
        double[] resultCoeffs = new double[resultDegree + 1];
        for (int i = 0; i <= resultDegree; i++) {
            resultCoeffs[i] = this.coefficient(i) + another.coefficient(i);
        }
        return new MyArrayPolynomial(resultCoeffs);
    }

    @Override
    public MyPolynomial minus(MyPolynomial another) {
        int resultDegree = Math.max(this.degree(), another.degree());
        double[] resultCoeffs = new double[resultDegree + 1];
        for (int i = 0; i <= resultDegree; i++) {
            resultCoeffs[i] = this.coefficient(i) - another.coefficient(i);
        }
        return new MyArrayPolynomial(resultCoeffs);
    }

    @Override
    public MyPolynomial multiply(MyPolynomial another) {
        int resultDegree = this.degree() + another.degree();
        double[] resultCoeffs = new double[resultDegree + 1];
        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                resultCoeffs[i + j] += this.coefficient(i) * another.coefficient(j);
            }
        }
        return new MyArrayPolynomial(resultCoeffs);
    }
}