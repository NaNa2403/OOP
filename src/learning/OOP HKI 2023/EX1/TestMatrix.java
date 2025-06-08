package hus.oop.matrix;

import java.util.Random;
import java.util.Arrays;

public class TestMatrix {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(6) + 5; 

        MySquareMatrix matrix1 = new MySquareMatrix(size);
        MySquareMatrix matrix2 = new MySquareMatrix(size);

        System.out.println("Ma tran 1:");
        System.out.println(matrix1);

        System.out.println("Ma tran 2:");
        System.out.println(matrix2);

        System.out.println("Ma tran chuyen vi cua ma tran 1:");
        System.out.println(matrix1.transpose());

        System.out.println("Ma tran chuyen vi cua ma tran 2:");
        System.out.println(matrix2.transpose());

        System.out.println("Duong cheo chinh cua ma tran 1: " + Arrays.toString(matrix1.principalDiagonal()));
        System.out.println("Duong cheo phu cua ma tran 1:   " + Arrays.toString(matrix1.secondaryDiagonal()));

        System.out.println("Duong cheo chinh cua ma tran 2: " + Arrays.toString(matrix2.principalDiagonal()));
        System.out.println("Duong cheo phu cua ma tran 2:   " + Arrays.toString(matrix2.secondaryDiagonal()));

        System.out.println("Ma tran tong (matrix1 + matrix2):");
        System.out.println(matrix1.add(matrix2));

        System.out.println("Ma tran hieu (matrix1 - matrix2):");
        System.out.println(matrix1.minus(matrix2));

        System.out.println("Ma tran tich (matrix1 * matrix2):");
        System.out.println(matrix1.multiply(matrix2));

        System.out.println("Cac so nguyen to trong ma tran 1:");
        System.out.println(Arrays.toString(matrix1.primes()));

        System.out.println("Cac so nguyen to trong ma tran 2:");
        System.out.println(Arrays.toString(matrix2.primes()));
    }
}
