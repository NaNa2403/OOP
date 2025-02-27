package Lab3;

import java.util.Scanner;

public class Ex1 {
    public static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);

        // return (n == 0) ? 1 : n* factorial(n-1)

    }

    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int numOfDigits(int n) {
        return Integer.toString(n).length();
    }

    public static int lengthOfRunningNumber(int n){
        if(n == 1){
            return 1;
        }
        else {
            return lengthOfRunningNumber(n-1) + numOfDigits(n);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b , (a%b));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----------------Menu-----------------");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Length of running number");
            System.out.println("4. GCD");
            System.out.println("5. Exit");
            System.out.print("Enter your choice :");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter a number :");
                    int factorial = sc.nextInt();
                    System.out.printf("Factorial for %d number is %d :\n", factorial, factorial(factorial));
                    break;
                case 2:
                    System.out.print("Enter a number :");
                    int fibonacci = sc.nextInt();
                    System.out.printf("Fibonacci for %d number is %d :\n" ,fibonacci,fibonacci(fibonacci));
                    break;
                case 3:
                    System.out.print("Enter a number :");
                    int runningNumber = sc.nextInt();
                    System.out.printf("Length of %d running number is %d :\n",runningNumber,lengthOfRunningNumber(runningNumber));
                    break;
                case 4:
                    System.out.print("Enter number a :");
                    int a = sc.nextInt();
                    System.out.println("enter number b (a>b) :");
                    int b = sc.nextInt();
                    System.out.printf("GCD for %d and %d is %d :\n", a, b, gcd(a,b));
                    break;
            }
        } while (choice != 5);
    }
}
