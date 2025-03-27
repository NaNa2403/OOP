package lab7.ex1_2;

public class TestMyPolynomial {
    public static void main(String[] args) {
        double[] coeffs1 = {1.2, 3.4, 5.6, 7.8};
        double[] coeffs2 = {2.2, 3.3, 4.4, 5.5, 6.6};

        MyPolynomial polynomial1 = new MyPolynomial(coeffs1);
        MyPolynomial polynomial2 = new MyPolynomial(coeffs2);

        System.out.println("Polynomial 1: " + polynomial1);
        System.out.println("Polynomial 2: " + polynomial2);

        System.out.println("Degree of Polynomial 1: " + polynomial1.getDegree());
        System.out.println("Degree of Polynomial 2: " + polynomial2.getDegree());

        double x = 2.0;
        System.out.println("Polynomial 1 evaluated at x=" + x + ": " + polynomial1.evaluate(x));
        System.out.println("Polynomial 2 evaluated at x=" + x + ": " + polynomial2.evaluate(x));

        MyPolynomial sumPoly = polynomial1.add(polynomial2);
        System.out.println("Sum of Polynomial 1 and 2: " + sumPoly);


        MyPolynomial productPoly = polynomial1.multiply(polynomial2);
        System.out.println("Product of Polynomial 1 and 2: " + productPoly);
    }
}
