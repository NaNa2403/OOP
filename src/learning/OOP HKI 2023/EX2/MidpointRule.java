// MidpointRule.java
package hus.oop.integration;

public class MidpointRule implements MyIntegrator {
    private final double precision;
    private final int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    @Override
    public double integrate(MyPolynomial polynomial, double lowerBound, double upperBound) {
        if (lowerBound == upperBound) return 0.0;
        int numIntervals = 1;
        double previousIntegral = solve(polynomial, lowerBound, upperBound, numIntervals);

        for (int i = 0; i < maxIterations; i++) {
            numIntervals *= 2;
            double currentIntegral = solve(polynomial, lowerBound, upperBound, numIntervals);
            if (Math.abs(currentIntegral - previousIntegral) / 3.0 < precision) {
                return currentIntegral;
            }
            previousIntegral = currentIntegral;
        }
        return previousIntegral;
    }

    private double solve(MyPolynomial poly, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double midpoint = a + (i + 0.5) * h;
            sum += poly.evaluate(midpoint);
        }
        return sum * h;
    }
}