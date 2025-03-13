package lab4.HW3;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {

    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.println("The standard deviation is " + standardDeviation(grades));
    }

    public static void readGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int grade : array) {
            sum += grade;
        }
        return sum / array.length;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        int length = array.length;

        if (length % 2 == 1) {
            return array[length / 2];
        } else {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double standardDeviation(int[] array) {
        double mean = average(array);
        double sumOfSquares = 0;
        for (int grade : array) {
            sumOfSquares += Math.pow(grade - mean, 2);
        }
        return Math.sqrt(sumOfSquares / array.length);
    }
}
