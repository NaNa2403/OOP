package lab3;

import java.util.Scanner;

public class Ex3 {

    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i < n ; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return (n == sum);
    }

    public static boolean isDeficient(int n){
        int sum = 0;
        for(int i = 1; i < n ; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return (sum < n);
    }


    public static void testPerfectAndDeficient(Scanner sc){
        System.out.print("Enter the upper bound :");
        int upperBound = sc.nextInt();
        System.out.println("These numbers are perfect :");
        int perfectCount = 0;
        for (int i = 1; i <= upperBound; i++){
            if(isPerfect(i)){
                System.out.print(i + " ");
                perfectCount += 1;
            }
        }
        System.out.printf("\n[%d perfect numbers found(%.2f %%) \n", perfectCount,(double) perfectCount/upperBound *100);
        System.out.println("These numbers neither deficient nor perfect :");
        int neitherCount = 0;
        for (int i = 1; i <= upperBound; i++){
            if(!isDeficient(i) && !isPerfect(i)){
                System.out.print(i + " ");
                neitherCount += 1;
            }
        }
        System.out.printf("\n[%d perfect numbers found(%.2f %%)", neitherCount,(double) neitherCount/upperBound *100);

    }
    public static boolean isPrime(int n){
        if (n == 1) return false;
        if (n == 2) return true;
        else {
            for (int i = 2; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

    public static void testPrime(Scanner sc){
        System.out.print("Enter the upper bound :");
        int upperBound = sc.nextInt();
        System.out.println("These numbers are prime :");
        int primeCount = 0;
        for (int i = 1; i <= upperBound; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
                primeCount += 1;
            }
        }
        System.out.printf("\n[%d prime found(%.2f %%) \n", primeCount,(double) primeCount/upperBound *100);

    }

    public static boolean isProductOfPrimeFactor(int n){
        int product = 1;
        for (int i = 2; i < n/2+1; i++){
            if (n % i == 0){
                if(isPrime(i)){
                    product *= i;
                }
            }
        }
        return (product == n);
    }

    public static void testPerfectPrimeFactor(Scanner sc){
        System.out.print("Enter the upper bound :");
        int upperBound = sc.nextInt();
        System.out.println("These numbers are equal to the product of prime factors :");
        int perfectPrimeFactorCount = 0;
        for (int i = 1; i <= upperBound; i++){
            if(isProductOfPrimeFactor(i)){
                System.out.print(i + " ");
                perfectPrimeFactorCount += 1;
            }
        }
        System.out.printf("\n[%d prime found(%.2f %%) \n", perfectPrimeFactorCount,(double) perfectPrimeFactorCount/upperBound *100);

    }

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void testGcd(Scanner sc){
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b (a > b) :" );
        int b = sc.nextInt();
        System.out.printf("GCD for %d and %d is %d\n", a, b , gcd(a,b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----------------Menu-----------------");
            System.out.println("1. Perfect and Deficient");
            System.out.println("2. Prime number");
            System.out.println("3. Perfect Prime Factor");
            System.out.println("4. GCD");
            System.out.println("5. Exit");
            System.out.print("Enter your choice :");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    testPerfectAndDeficient(sc);
                    break;
                case 2:
                    testPrime(sc);
                    break;
                case 3:
                    testPerfectPrimeFactor(sc);
                    break;
                case 4:
                    testGcd(sc);
                    break;
            }
        } while (choice != 5);
    }
}
