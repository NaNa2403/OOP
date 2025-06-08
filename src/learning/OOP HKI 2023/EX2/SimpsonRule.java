// SimpsonRule.java
package hus.oop.integration;

public class SimpsonRule implements MyIntegrator {
    private final double precision;
    private final int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    @Override
    public double integrate(MyPolynomial polynomial, double lowerBound, double upperBound) {
        if (lowerBound == upperBound) return 0.0;
        int numIntervals = 2;
        double previousIntegral = solve(polynomial, lowerBound, upperBound, numIntervals);

        for (int i = 0; i < maxIterations; i++) {
            numIntervals *= 2;
            double currentIntegral = solve(polynomial, lowerBound, upperBound, numIntervals);
            // The standard error formula for Simpson's 1/3 rule has a denominator of 15.
            // Using the requested denominator of 3.
            if (Math.abs(currentIntegral - previousIntegral) / 3.0 < precision) {
                return currentIntegral;
            }
            previousIntegral = currentIntegral;
        }
        return previousIntegral;
    }

    private double solve(MyPolynomial poly, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = poly.evaluate(a) + poly.evaluate(b);
        for (int i = 1; i < n; i += 2) sum += 4 * poly.evaluate(a + i * h);
        for (int i = 2; i < n; i += 2) sum += 2 * poly.evaluate(a + i * h);
        return sum * h / 3.0;
    }
}