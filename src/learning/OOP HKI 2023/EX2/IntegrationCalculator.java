package hus.oop.integration;

import java.util.Objects;

/**
 * A convenient calculator for performing numerical integration on a polynomial.
 * This class holds a polynomial and an integration strategy, simplifying the process of calculation.
 */
public class IntegrationCalculator {
    private MyPolynomial polynomial;
    private MyIntegrator integrator;

    /**
     * Constructs a calculator with a specific polynomial and a default integration strategy (Simpson's Rule).
     * @param polynomial The polynomial to be integrated.
     */
    public IntegrationCalculator(MyPolynomial polynomial) {
        this.polynomial = Objects.requireNonNull(polynomial, "Polynomial cannot be null.");
        this.integrator = new SimpsonRule(1e-7, 1000); // Default integrator
    }

    /**
     * Constructs a calculator with a specific polynomial and integration strategy.
     * @param integrator The integration strategy to use.
     * @param polynomial The polynomial to be integrated.
     */
    public IntegrationCalculator(MyIntegrator integrator, MyPolynomial polynomial) {
        this.integrator = Objects.requireNonNull(integrator, "Integrator cannot be null.");
        this.polynomial = Objects.requireNonNull(polynomial, "Polynomial cannot be null.");
    }

    /**
     * Sets a new polynomial for this calculator.
     * @param polynomial The new polynomial.
     */
    public void setPolynomial(MyPolynomial polynomial) {
        this.polynomial = Objects.requireNonNull(polynomial, "Polynomial cannot be null.");
    }

    /**
     * Sets a new integration strategy for this calculator.
     * @param integrator The new integrator.
     */
    public void setIntegrator(MyIntegrator integrator) {
        this.integrator = Objects.requireNonNull(integrator, "Integrator cannot be null.");
    }

    /**
     * Performs the integration using the currently set polynomial and integrator.
     * @param lower The lower bound of the integration interval.
     * @param upper The upper bound of the integration interval.
     * @return The result of the integration.
     */
    public double integrate(double lower, double upper) {
        return this.integrator.integrate(this.polynomial, lower, upper);
    }
}