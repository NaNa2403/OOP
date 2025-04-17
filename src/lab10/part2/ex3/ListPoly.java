package lab10.part2.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double coeff : coefficients) {
            this.coefficients.add(coeff);
        }
    }

    @Override
    public double[] coefficients() {
        double[] coeffsArray = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffsArray[i] = coefficients.get(i);
        }
        return coeffsArray;
    }

    @Override
    public double coefficient(int n) {
        if (n < 0 || n >= coefficients.size()) {
            return -1;
        }
        return coefficients.get(n);
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double []deriveCoefficients = super.derive();
        this.coefficients = new ArrayList<>();
        for (double coeff : deriveCoefficients) {
            this.coefficients.add(coeff);
        }
        return new ListPoly(deriveCoefficients);
    }
}
