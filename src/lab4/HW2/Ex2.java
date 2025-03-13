package lab4.HW2;

import java.util.Scanner;

public class Ex2 {
    public static void squarePattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testSquarePattern(Scanner sc) {
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        squarePattern(size);
    }

    public static void checkerPattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern(Scanner sc) {

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        checkerPattern(size);
    }

    public static void timeTable(int n) {
        System.out.print(" * |");
        for (int col = 1; col <= n; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        System.out.print("----");
        for (int col = 0; col < n; col++) {
            System.out.print("----");
        }
        System.out.println();

        for (int row = 1; row <= n; row++) {
            System.out.printf("%2d |", row);

            for (int col = 1; col <= n; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }

    public static void testTimeTable(Scanner sc) {
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        timeTable(size);
    }

    public static void triangularPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method for pattern (b)
    public static void triangularPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col <= n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method for pattern (c)
    public static void triangularPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method for pattern (d)
    public static void triangularPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col >= n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern(Scanner sc) {
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        triangularPatternA(size);
        System.out.println("Pattern (a)");
        System.out.println();

        triangularPatternB(size);
        System.out.println("Pattern (b)");
        System.out.println();

        triangularPatternC(size);
        System.out.println("Pattern (c)");
        System.out.println();

        triangularPatternD(size);
        System.out.println("Pattern (d)");
        System.out.println();
    }

    public static void boxPatternA(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n-1 || col == 0 || col == n-1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method for pattern (b): Border + Diagonal
    public static void boxPatternB(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || row == n - 1 - col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method for pattern (d): Border + Opposite Diagonal
    public static void boxPatternD(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || row == col || row == n - 1 - col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testBoxPattern(Scanner sc) {
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        boxPatternA(size);
        System.out.println("Pattern (a)");
        System.out.println();

        boxPatternB(size);
        System.out.println("Pattern (b)");
        System.out.println();

        boxPatternC(size);
        System.out.println("Pattern (c)");
        System.out.println();

        boxPatternD(size);
        System.out.println("Pattern (d)");
        System.out.println();
    }

    public static void hillPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n * 2 - 1; col++) {
                if ((row + col >= n + 1) && (row >= col - n + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method for pattern (b): Hill pattern with increasing '#' symbols from both sides
    public static void hillPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (col >= row && col <= n * 2 - row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method for pattern (c): A mirrored inverted triangle hill pattern
    public static void hillPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row * 2 - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        for (int row = n - 1; row > 0; row--) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row * 2 - 1; col++) {
                System.out.print("# ");
            }

            System.out.println();
        }
    }

    public static void hillPatternD(int n) {
        for (int row = 1; row <= n * 2 - 1; row++) {
            for (int col = 1; col <= n* 2 - 1; col++) {
                if (Math.abs(n - row) + Math.abs(n - col) < n) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void testHillPattern(Scanner sc) {
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();

        hillPatternA(rows);
        System.out.println("Pattern (a):");
        System.out.println();

        hillPatternB(rows);
        System.out.println("Pattern (b):");
        System.out.println();

        hillPatternC(rows);
        System.out.println("Pattern (c):");
        System.out.println();

        hillPatternD(rows);
        System.out.println("Pattern (d):");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do{
            System.out.println("------------Menu------------");
            System.out.println("1. Square Pattern");
            System.out.println("2. Checker Pattern");
            System.out.println("3. Time Table");
            System.out.println("4. Triangular Pattern");
            System.out.println("5. Box Pattern");
            System.out.println("6. Hill Pattern");
            System.out.println("7. Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    testSquarePattern(sc);
                    break;
                case 2:
                    testCheckerPattern(sc);
                    break;
                case 3:
                    testTimeTable(sc);
                    break;
                case 4:
                    testTriangularPattern(sc);
                    break;
                case 5:
                    testBoxPattern(sc);
                    break;
                case 6:
                    testHillPattern(sc);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid number");
            }
        } while (choice != 7);
    }
}
