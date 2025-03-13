package lab4.HW3;

import java.util.Scanner;

public class GradesHistogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grades for students " + i + ": ");
            grades[i] = scanner.nextInt();
        }

        int[] ranges = new int[10];

        for (int grade : grades) {
            if (grade >= 0 && grade <= 9) {
                ranges[0]++;
            } else if (grade >= 10 && grade <= 19) {
                ranges[1]++;
            } else if (grade >= 20 && grade <= 29) {
                ranges[2]++;
            } else if (grade >= 30 && grade <= 39) {
                ranges[3]++;
            } else if (grade >= 40 && grade <= 49) {
                ranges[4]++;
            } else if (grade >= 50 && grade <= 59) {
                ranges[5]++;
            } else if (grade >= 60 && grade <= 69) {
                ranges[6]++;
            } else if (grade >= 70 && grade <= 79) {
                ranges[7]++;
            } else if (grade >= 80 && grade <= 89) {
                ranges[8]++;
            } else if (grade >= 90 && grade <= 100) {
                ranges[9]++;
            }
        }

        displayHorizontalHistogram(ranges);

        displayVerticalHistogram(ranges);
    }

    public static void displayHorizontalHistogram(int[] ranges) {
        System.out.println("\nHorizontal Histogram:");
        for (int i = 0; i < ranges.length; i++) {
            System.out.print((i * 10) + "-" + (i * 10 + 9) + ": ");
            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void displayVerticalHistogram(int[] ranges) {
        System.out.println("\nVertical Histogram:");
        int maxCount = 0;

        for (int count : ranges) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        for (int i = maxCount; i > 0; i--) {
            if (ranges[0] >= i) {
                System.out.print(" *     ");
            } else {
                System.out.print("       ");
            }
            for (int j = 1; j < ranges.length; j++) {
                if (ranges[j] >= i) {
                    System.out.print("*      ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < ranges.length; i++) {
            System.out.print((i * 10) + "-" + (i * 10 + 9) + "  ");
        }
        System.out.println();
    }
}
