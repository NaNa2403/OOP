package lab10.part2.ex3;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {
    }

    public double[] derive(){
        int degree = coefficients().length - 1;

        if (degree <= 0) {
            return new double[]{0};
        }

        double[] derivedCoefficients = new double[degree];

        for (int i = 1; i <= degree; i++) {
            derivedCoefficients[i - 1] = coefficients()[i] * i;
        }

        return derivedCoefficients;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.coefficients());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof AbstractPoly)) return false;

        AbstractPoly other = (AbstractPoly) obj;
        if (this.coefficients().length != other.coefficients().length) {
            return false;
        }
        for (int i = 0; i < this.coefficients().length; i++) {
            if (Double.compare(this.coefficients()[i], other.coefficients()[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.coefficients().length; i++) {
            builder.append(String.format("%.2f", this.coefficients()[i]));
            if (i < this.coefficients().length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
}
