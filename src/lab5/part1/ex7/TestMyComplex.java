package lab5.part1.ex7;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(1.1, 2.2);
        MyComplex complex2 = new MyComplex(3.3, 4.4);

        System.out.println("Number 1 is " + complex1);
        if (!complex1.isReal()) {
            System.out.printf("%s is NOT a pure real number%n", complex1);
        } else {
            System.out.printf("%s is a pure real number%n", complex1);

        }

        if (!complex1.isImaginary()) {
            System.out.printf("%s is NOT a pure imaginary number%n", complex1);
        } else {
            System.out.printf("%s is a pure imaginary number%n", complex1);

        }

        if (!complex2.isReal()) {
            System.out.printf("%s is NOT a pure real number%n", complex2);
        } else {
            System.out.printf("%s is a pure real number%n", complex2);

        }

        if (!complex2.isImaginary()) {
            System.out.printf("%s is NOT a pure imaginary number%n", complex2);
        } else {
            System.out.printf("%s is a pure imaginary number%n", complex2);

        }

        if (!complex1.equals(complex2)) {
            System.out.printf("%s is NOT equal to %s%n", complex1, complex2);
        } else {
            System.out.printf("%s is equal to %s%n", complex1, complex2);

        }

        System.out.printf("(%s) + (%s) = ", complex1, complex2);
        System.out.printf("%s%n", complex1.addInto(complex2));

        System.out.printf("(%s) - (%s) = ", complex1, complex2);
        System.out.printf("%s%n", complex1.subtract(complex2));

        System.out.printf("(%s) - (%s) = %s%n", complex1, complex2, complex1.subtractNew(complex2));

        System.out.printf("(%s) * (%s) = ", complex1, complex2);
        System.out.printf("%s%n", complex1.multiply(complex2));

        System.out.printf("(%s) / (%s) = ", complex1, complex2);
        System.out.printf("%s%n", complex1.divide(complex2));

        System.out.printf("Argument of %s is ", complex1);
        System.out.printf("%s%n", complex1.argument());

        System.out.printf("Conjugate of %s is ", complex1);
        System.out.printf("%s%n", complex1.conjugate());
    }


}
