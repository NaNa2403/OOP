package lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUMSTUDENT = 3;

        int numberIn;
        boolean isValid;
        int sum = 0;
        double average = 0;

        for (int i = 1; i <= NUMSTUDENT; ++i) {
            do {
                System.out.print("Enter the mark (0-100) for student " + i + " ");
                numberIn = sc.nextInt();
                isValid = false;

                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                }
                else {
                    System.out.println("Invalid input, try again");
                }
            }
            while (!isValid);
            sum += numberIn;
        }
        average = (double) sum / NUMSTUDENT;
        System.out.printf("The avarage is %.2f%n" , average);
    }
}
