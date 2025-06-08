package hus.oop.integration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListPolynomial extends MyAbstractPolynomial {
    private final List<Double> coefficients;

    public MyListPolynomial() {
        this.coefficients = new ArrayList<>();
        this.coefficients.add(0.0);
    }

    private MyListPolynomial(List<Double> coefficients) {
        this.coefficients = new ArrayList<>(coefficients);
    }

    @Override
    public double coefficient(int degree) {
        return (degree >= 0 && degree < coefficients.size()) ? coefficients.get(degree) : 0.0;
    }

    @Override
    public double[] getCoefficients() {
        return coefficients.stream().mapToDouble(Double::doubleValue).toArray();
    }

    @Override
    public int degree() {
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            if (coefficients.get(i) != 0.0) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public MyPolynomial append(double coefficient) {
        this.coefficients.add(coefficient);
        return this;
    }

    @Override
    public MyPolynomial set(double coefficient, int degree) {
        if (degree < 0) throw new IllegalArgumentException("Degree cannot be negative.");
        while (degree >= coefficients.size()) {
            coefficients.add(0.0);
        }
        coefficients.set(degree, coefficient);
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
        double[] derivCoeffs = differentiate();
        List<Double> newList = new ArrayList<>();
        for (double coeff : derivCoeffs) {
            newList.add(coeff);
        }
        return new MyListPolynomial(newList);
    }

    @Override
    public MyPolynomial plus(MyPolynomial another) {
        int resultDegree = Math.max(this.degree(), another.degree());
        List<Double> resultCoeffs = new ArrayList<>();
        for (int i = 0; i <= resultDegree; i++) {
            resultCoeffs.add(this.coefficient(i) + another.coefficient(i));
        }
        return new MyListPolynomial(resultCoeffs);
    }

    @Override
    public MyPolynomial minus(MyPolynomial another) {
        int resultDegree = Math.max(this.degree(), another.degree());
        List<Double> resultCoeffs = new ArrayList<>();
        for (int i = 0; i <= resultDegree; i++) {
            resultCoeffs.add(this.coefficient(i) - another.coefficient(i));
        }
        return new MyListPolynomial(resultCoeffs);
    }

    @Override
    public MyPolynomial multiply(MyPolynomial another) {
        int resultDegree = this.degree() + another.degree();
        List<Double> resultCoeffs = new ArrayList<>(Collections.nCopies(resultDegree + 1, 0.0));
        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                double currentVal = resultCoeffs.get(i + j);
                resultCoeffs.set(i + j, currentVal + this.coefficient(i) * another.coefficient(j));
            }
        }
        return new MyListPolynomial(resultCoeffs);
    }
}