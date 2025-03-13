package lab4.HW2;

import java.util.Scanner;

public class Ex5 {
    public static double sin(double x, int numTerms) {
        double result = 0.0;
        double term = x;
        int sign = 1;
        for (int n = 1; n <= numTerms; n++) {
            result += sign * term;
            sign = -sign;
            term *= x * x / ((2 * n) * (2 * n + 1));
        }
        return result;
    }


    public static double cos(double x, int numTerms) {
        double result = 1.0;
        double term = 1.0;
        int sign = -1;

        for (int n = 1; n <= numTerms; n++) {
            term *= x * x / ((2 * n - 1) * (2 * n));
            result += sign * term;
            sign = -sign;
        }
        return result;
    }

    public static void testTrigonometric(Scanner sc) {

        System.out.print("Enter the value of x (in radians): ");
        double x = sc.nextDouble();
        System.out.print("Enter the number of terms for the series: ");
        int numTerms = sc.nextInt();

        double sinValue = sin(x, numTerms);
        double cosValue = cos(x, numTerms);

        double mathSinValue = Math.sin(x);
        double mathCosValue = Math.cos(x);


        System.out.println("Results using series expansion:");
        System.out.println("sin(" + x + ") = " + sinValue);
        System.out.println("cos(" + x + ") = " + cosValue);

        System.out.println("Results using Math.sin() and Math.cos():");
        System.out.println("Math.sin(" + x + ") = " + mathSinValue);
        System.out.println("Math.cos(" + x + ") = " + mathCosValue);
    }

    public static double specialSeries(double x, int numTerms) {
        double result = 0.0;
        double numerator = 1.0;
        double denominator = 1.0;

        for (int n = 0; n < numTerms; n++) {
            int power = 2 * n + 1;
            double term = Math.pow(x, power) / (2 * n + 1);

            if (n > 0) {
                numerator *= (2 * n - 1);
                denominator *= (2 * n);
            }

            term *= numerator / denominator;
            result += term;
        }

        return result;
    }

    public static void testSpecialSeries(Scanner sc) {
        System.out.print("Enter the value of x (in the range [-1, 1]): ");
        double x = sc.nextDouble();
        if (x < -1 || x > 1) {
            System.out.println("x must be in the range [-1, 1]. Exiting.");
            return;
        }

        System.out.print("Enter the number of terms for the series: ");
        int numTerms = sc.nextInt();

        double result = specialSeries(x, numTerms);

        System.out.println("Sum of the series: " + result);
    }

    public static void factorialInt() {
        final int MAX_INT = Integer.MAX_VALUE;

        int factorial = 1;

        for (int i = 1; i <= 12; i++) {
            if (i > 1 && (MAX_INT / factorial) < i) {
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }
            factorial *= i;
            System.out.println("The factorial of " + i + " is " + factorial);
        }
    }

    public static void factorialLong() {
        final long MAX_LONG = Long.MAX_VALUE;

        long factorial = 1;

        for (int i = 1; i <= 20; i++) {
            if (i > 1 && (MAX_LONG / factorial) < i) {
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }
            factorial *= i;
            System.out.println("The factorial of " + i + " is " + factorial);
        }
    }

    public static void fibonacciInt() {
        final int MAX_INT = Integer.MAX_VALUE;

        int f0 = 1, f1 = 1;

        System.out.println("F(0) = " + f0);
        System.out.println("F(1) = " + f1);

        int index = 2;
        while (true) {
            int nextFib = f0 + f1;

            if (nextFib < 0 || nextFib > MAX_INT) {
                System.out.println("F(" + index + ") is out of the range of int");
                break;
            }

            System.out.println("F(" + index + ") = " + nextFib);

            f0 = f1;
            f1 = nextFib;
            index++;
        }
    }

    public static void tribonacciInt() {
        final int MAX_INT = Integer.MAX_VALUE;

        int f0 = 1, f1 = 1, f2 = 2;

        System.out.println("F(0) = " + f0);
        System.out.println("F(1) = " + f1);
        System.out.println("F(1) = " + f2);

        int index = 3;
        while (true) {
            int nextTri = f0 + f1 + f2;

            if (nextTri < 0 || nextTri > MAX_INT) {
                System.out.println("F(" + index + ") is out of the range of int");
                break;
            }

            System.out.println("F(" + index + ") = " + nextTri);

            f0 = f1;
            f1 = f2;
            f2 = nextTri;
            index++;
        }
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        int decimal = 0;

        if (inRadix < 0 || inRadix > 16) {
            throw new IllegalArgumentException("Not valid input Radix");
        }

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) >= '0' && in.charAt(i) <= '9') {
                decimal += (in.charAt(i) - '0') * Math.pow(inRadix, in.length() - 1 - i);
            } else if (in.charAt(i) >= 'a' && in.charAt(i) <= 'f') {
                decimal += (in.charAt(i) - 'a' + 10) * Math.pow(inRadix, in.length() - 1 - i);
            } else {
                throw new IllegalArgumentException("Not valid input string");
            }
            ;
        }

        if (outRadix == 10) {
            return String.valueOf(decimal);
        }

        StringBuilder result = new StringBuilder();
        if (decimal == 0) {
            return "0";
        }
        while (decimal > 0) {
            int remainder = decimal % outRadix;
            if (remainder < 10) {
                result.insert(0, (char) ('0' + remainder));
            } else {
                result.insert(0, (char) ('A' + remainder - 10));
            }
            decimal /= outRadix;
        }

        return result.toString();
    }

    public static void testNumberConversion(Scanner sc) {
        System.out.print("Enter a number and radix: ");
        String inputNumber = sc.next();

        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();

        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();

        String result = toRadix(inputNumber.toLowerCase(), inRadix, outRadix);

        System.out.printf("%s in radix %d is %s in radix %d", inputNumber, inRadix, result, outRadix);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n-------------Menu-----------");
            System.out.println("1. Trigonometric Series");
            System.out.println("2. Exponential Series");
            System.out.println("3. Factorial Integer");
            System.out.println("4. Factorial Long");
            System.out.println("5. Fibonacci Integer");
            System.out.println("6. Tribonacci Integer");
            System.out.println("7. Number System Conversion");
            System.out.println("8. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    testTrigonometric(sc);
                    break;
                case 2:
                    testSpecialSeries(sc);
                    break;
                case 3:
                    factorialInt();
                    break;
                case 4:
                    factorialLong();
                    break;
                case 5:
                    fibonacciInt();
                    break;
                case 6:
                    tribonacciInt();
                    break;
                case 7:
                    testNumberConversion(sc);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid number");
            }
        } while (choice != 8);
    }
}
