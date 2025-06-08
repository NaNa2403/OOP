package hus.oop.integration;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

/**
 * A test harness for the polynomial and integration framework.
 * This class contains the main entry point to run a series of tests and report the results to a file.
 */
public final class TestIntegrationCalculator {
    // This class is a utility class and should not be instantiated.
    private TestIntegrationCalculator() {}

    /**
     * The main entry point of the application.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // IMPORTANT: Change the student name and ID here.
        final String studentName = "YourName";
        final String studentId = "YourID";
        final String outputFilename = String.format("%s_%s_Integration.txt", studentName, studentId);

        try (PrintStream out = new PrintStream(outputFilename)) {
            System.setOut(out); // Redirect all console output to the file.

            runArrayPolynomialTests();
            printSectionSeparator();
            runListPolynomialTests();

            System.out.printf("\nAll tests completed. Results are saved in '%s'.\n", outputFilename);

        } catch (FileNotFoundException e) {
            System.err.println("FATAL ERROR: Could not write to output file: " + e.getMessage());
        }
    }

    private static void runArrayPolynomialTests() {
        System.out.println("--- Testing MyArrayPolynomial ---");
        MyPolynomial poly = new MyArrayPolynomial().set(2, 2).set(-5, 1).set(3, 0); // 2x^2 - 5x + 3
        runAllTestsOnPolynomial(poly, "MyArrayPolynomial", 1.0, 5.0);
    }

    private static void runListPolynomialTests() {
        System.out.println("--- Testing MyListPolynomial ---");
        MyPolynomial poly = new MyListPolynomial().set(1, 3).set(0, 2).set(-2, 1).set(4, 0); // x^3 - 2x + 4
        runAllTestsOnPolynomial(poly, "MyListPolynomial", 2.0, 6.0);
    }

    private static void runAllTestsOnPolynomial(MyPolynomial poly, String polyType, double lower, double upper) {
        System.out.println("Initial Polynomial (" + polyType + "): " + poly);
        System.out.println("Degree: " + poly.degree());

        // Basic operations
        System.out.println("\n[Basic Operations]");
        System.out.println("Evaluate at x=3: " + poly.evaluate(3));
        System.out.println("Derivative: " + poly.derivative());

        // Binary operations
        System.out.println("\n[Binary Operations]");
        MyPolynomial poly2 = new MyArrayPolynomial().set(1, 1).set(1, 0); // x + 1
        System.out.println("Second polynomial for tests: " + poly2);
        System.out.println("Sum: " + poly.plus(poly2));
        System.out.println("Difference: " + poly.minus(poly2));
        System.out.println("Product: " + poly.multiply(poly2));

        // Integration tests
        System.out.println("\n[Integration Tests]");
        System.out.printf("Integrating from %.1f to %.1f\n", lower, upper);
        testAllIntegrators(poly, lower, upper);
    }

    private static void testAllIntegrators(MyPolynomial poly, double lower, double upper) {
        MyIntegrator simpson = new SimpsonRule(1e-7, 1000);
        MyIntegrator trapezoid = new TrapezoidRule(1e-7, 1000);
        MyIntegrator midpoint = new MidpointRule(1e-7, 1000);

        System.out.printf("  - Simpson's Rule: %.12f\n", simpson.integrate(poly, lower, upper));
        System.out.printf("  - Trapezoid Rule: %.12f\n", trapezoid.integrate(poly, lower, upper));
        System.out.printf("  - Midpoint Rule:  %.12f\n", midpoint.integrate(poly, lower, upper));
    }

    private static void printSectionSeparator() {
        System.out.println("\n" + "=".repeat(70) + "\n");
    }
}