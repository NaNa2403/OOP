package hus.oop.matrix;

import java.util.*;

public class MySquareMatrix {
    private int[][] data;

    public MySquareMatrix(int size) {
        initRandom(size);
    }

    private void initRandom(int size) {
        Random rand = new Random();
        data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = rand.nextInt(81) + 10; 
            }
        }
    }

    public int[] principalDiagonal() {
        int[] diagonal = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            diagonal[i] = data[i][i];
        }
        return diagonal;
    }

    public int[] secondaryDiagonal() {
        int[] diagonal = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            diagonal[i] = data[i][data.length - 1 - i];
        }
        return diagonal;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int[] primes() {
        List<Integer> primes = new ArrayList<>();
        for (int[] row : data) {
            for (int val : row) {
                if (isPrime(val)) {
                    primes.add(val);
                }
            }
        }
        return primes.stream().mapToInt(Integer::intValue).toArray();
    }

    public MySquareMatrix getSortedMatrix() {
        int size = data.length;
        int[] flat = new int[size * size];
        int index = 0;
        for (int[] row : data) {
            for (int val : row) {
                flat[index++] = val;
            }
        }
        Arrays.sort(flat);
        // đảo ngược mảng để thành giảm dần
        for (int i = 0; i < flat.length / 2; i++) {
            int temp = flat[i];
            flat[i] = flat[flat.length - 1 - i];
            flat[flat.length - 1 - i] = temp;
        }

        MySquareMatrix result = new MySquareMatrix(size);
        index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.set(i, j, flat[index++]);
            }
        }
        return result;
    }

    public int get(int row, int col) {
        return data[row][col];
    }

    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    public MySquareMatrix add(MySquareMatrix that) {
        int size = data.length;
        MySquareMatrix result = new MySquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.set(i, j, this.get(i, j) + that.get(i, j));
            }
        }
        return result;
    }

    public MySquareMatrix minus(MySquareMatrix that) {
        int size = data.length;
        MySquareMatrix result = new MySquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.set(i, j, this.get(i, j) - that.get(i, j));
            }
        }
        return result;
    }

    public MySquareMatrix multiply(MySquareMatrix that) {
        int size = data.length;
        MySquareMatrix result = new MySquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = 0;
                for (int k = 0; k < size; k++) {
                    sum += this.get(i, k) * that.get(k, j);
                }
                result.set(i, j, sum);
            }
        }
        return result;
    }

    public MySquareMatrix scaled(int value) {
        int size = data.length;
        MySquareMatrix result = new MySquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.set(i, j, this.get(i, j) * value);
            }
        }
        return result;
    }

    public MySquareMatrix transpose() {
        int size = data.length;
        MySquareMatrix result = new MySquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.set(i, j, this.get(j, i));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int[] row : data) {
            for (int val : row) {
                builder.append(String.format("%4d", val));
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
