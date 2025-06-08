package hus.oop.integration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class MyAbstractPolynomial implements MyPolynomial {

    /**
     * Computes the coefficients of the derivative polynomial.
     * @return An array of coefficients for the derivative.
     */
    protected double[] differentiate() {
        double[] currentCoeffs = getCoefficients();
        if (currentCoeffs.length < 2) {
            return new double[]{0.0};
        }
        double[] derivativeCoeffs = new double[currentCoeffs.length - 1];
        for (int i = 1; i < currentCoeffs.length; i++) {
            derivativeCoeffs[i - 1] = currentCoeffs[i] * i;
        }
        return derivativeCoeffs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyPolynomial)) return false;
        MyPolynomial that = (MyPolynomial) obj;
        return Arrays.equals(this.getCoefficients(), that.getCoefficients());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCoefficients());
    }

    @Override
    public String toString() {
        double[] coeffs = getCoefficients();
        if (coeffs.length == 0) return "[]";

        List<String> terms = new ArrayList<>();
        for (int i = 0; i < coeffs.length; i++) {
            if (coeffs[i] == 0.0) continue;

            String term = "";
            double absCoeff = Math.abs(coeffs[i]);
            
            if (i > 0 && absCoeff == 1.0) {
                term = ""; // Don't print "1" for 1x, 1x^2, etc.
            } else {
                term = String.valueOf(absCoeff);
            }
            
            if (i == 1) {
                term += "x";
            } else if (i > 1) {
                term += "x^" + i;
            }

            terms.add((coeffs[i] < 0 ? "- " : "+ ") + term);
        }

        if (terms.isEmpty()) return "[0.0]";

        String result = String.join(" ", terms);
        // Clean up the leading "+ " if it exists
        if (result.startsWith("+ ")) {
            result = result.substring(2);
        }
        return "[" + result + "]";
    }
}