package lab4.HW2;

import java.util.Scanner;

public class Ex4 {
    public static void printArrayInStars(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d : %s (%d)", i, "*".repeat(items[i]), items[i]);
        }
    }

    public static void testPrintArrayInStars(Scanner sc){
        System.out.print("Enter the number of items: ");
        int numItems = sc.nextInt();

        int[] items = new int[numItems];

        System.out.print("Enter the value of all items (separate by space): ");
        for (int i = 0; i < numItems; i++) {
            items[i] = sc.nextInt();
        }
        printArrayInStars(items);
    }
    
    public static void print(int[][] matrix) {
        System.out.println("[ ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
    
    public static void print(double[][] matrix) {
        System.out.println("[ ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
    
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }
    
    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }
    
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    // Add two double matrices
    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    // Subtract two double matrices
    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("Matrix multiplication requires the number of columns in the first matrix to equal the number of rows in the second matrix.");
        }

        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int[][] result = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[row][col] += matrix1[row][k] * matrix2[k][col];
                }
            }
        }
        return result;
    }

    // Multiply two double matrices
    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("Matrix multiplication requires the number of columns in the first matrix to equal the number of rows in the second matrix.");
        }

        int rows = matrix1.length;
        int cols = matrix2[0].length;
        double[][] result = new double[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[row][col] += matrix1[row][k] * matrix2[k][col];
                }
            }
        }
        return result;
    }
    
    public static void testMatrix(){
        int[][] intMatrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] intMatrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println("Integer Matrix 1:");
        print(intMatrix1);
        System.out.println("Integer Matrix 2:");
        print(intMatrix2);

        System.out.println("Integer Matrix 1 + Integer Matrix 2:");
        print(add(intMatrix1, intMatrix2));

        System.out.println("Integer Matrix 1 - Integer Matrix 2:");
        print(subtract(intMatrix1, intMatrix2));

        System.out.println("Integer Matrix 1 * Integer Matrix 2:");
        print(multiply(intMatrix1, intMatrix2));

        double[][] doubleMatrix1 = {
                {1.5, 2.5, 3.5},
                {4.5, 5.5, 6.5},
                {7.5, 8.5, 9.5}
        };

        double[][] doubleMatrix2 = {
                {9.5, 8.5, 7.5},
                {6.5, 5.5, 4.5},
                {3.5, 2.5, 1.5}
        };

        System.out.println("Double Matrix 1:");
        print(doubleMatrix1);
        System.out.println("Double Matrix 2:");
        print(doubleMatrix2);

        System.out.println("Double Matrix 1 + Double Matrix 2:");
        print(add(doubleMatrix1, doubleMatrix2));

        System.out.println("Double Matrix 1 - Double Matrix 2:");
        print(subtract(doubleMatrix1, doubleMatrix2));

        System.out.println("Double Matrix 1 * Double Matrix 2:");
        print(multiply(doubleMatrix1, doubleMatrix2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do{
            System.out.println("\n-------------Menu-----------");
            System.out.println("1. Print Array In Star");
            System.out.println("2. Matrix");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    testPrintArrayInStars(sc);
                    break;
                case 2:
                    testMatrix();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }while (choice != 3);
    }
}
